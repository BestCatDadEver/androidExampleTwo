package com.example.exampletwo.Services

import com.example.exampletwo.Model.Category
import com.example.exampletwo.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie","$10","hat01"),
        Product("Devslopes Hat Black","$20","hat02"),
        Product("Devslopes Hat White","$18","hat03"),
        Product("Devslopes Hat Snapback","$22","hat04")
    )

    val hoodies = listOf(
        Product("Devslopes Hoddie Gray", "$22","hoodie01"),
        Product("Devslopes Hoddie Red", "$30","hoodie02"),
        Product("Devslopes Gray Hoodie", "$22","hoodie03"),
        Product("Devslopes Black Hoodie", "$22","hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18","shirt01"),
        Product("Devslopes Budge Ligh", "$30","shirt02"),
        Product("Devslopes Logo Shirt Red", "$22","shirt03"),
        Product("Devslopes Hustle", "$22","shirt04"),
        Product("KickFlip Studios", "$18","shirt05")

    )
}