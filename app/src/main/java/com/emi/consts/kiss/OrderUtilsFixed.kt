package com.emi.consts.kiss

//only single business comment and code is readable
object OrderUtilsFixed {


    const val PROMOTION_AMOUNT_MIN_PRICE = 10.0
    const val PROMOTION_PERCENT_MIN_PRICE = 20.0

   fun calculateSum(product: List<Product>, promotion : List<Promotions>) : Double{
       val productPrice = getProductPrice(product)
       return productPrice - getDiscountAmount(
           productPrice,
           promotion
       )
   }

   fun getProductPrice(products : List<Product>) : Double{
       var sum = 0.0
       for(product in products){
           sum += product.price
       }
       return sum
   }

   fun getDiscountAmount(productPrice : Double, promotions : List<Promotions>) : Double{
        var discount = 0.0
       for(promotion in promotions){
           if(canApplyPromotionAmount(
                   productPrice,
                   promotion.amount,
                   discount
               )
           ){
               discount += promotion.amount
           }else if(canApplyPromotionsPercent(
                   productPrice,
                   promotion.percent,
                   discount
               )
           ){
               discount += productPrice * promotion.percent
           }
       }
       return discount
   }

   fun canApplyPromotionAmount(productPrice : Double, amount: Double, currentDiscount : Double) : Boolean{
      return amount > 0 && productPrice - (currentDiscount + amount) > PROMOTION_AMOUNT_MIN_PRICE
   }

   fun canApplyPromotionsPercent(productPrice: Double, percent : Int, currentDiscount: Double) : Boolean{
       return percent > 0 && productPrice - (currentDiscount + productPrice * percent) > PROMOTION_PERCENT_MIN_PRICE
   }
}

data class Product(var price : Int)
data class Promotions(var amount : Double, var percent : Int)