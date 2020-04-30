package com.example.mobile_coding.repository

import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot
import kotlin.collections.ArrayList
import kotlin.random.Random

class FakeAnimalsRepository : AnimalsRepository {

    private val catImages = listOf(
        "https://ichef.bbci.co.uk/news/410/cpsprodpb/12A9B/production/_111434467_gettyimages-1143489763.jpg",
        "https://images2.minutemediacdn.com/image/upload/c_crop,h_1193,w_2121,x_0,y_64/f_auto,q_auto,w_1100/v1565279671/shape/mentalfloss/578211-gettyimages-542930526.jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQdAtqi81KofQxUncLfoNh_HhjW6DBDWWydBkytvI1xNIGXb0Zn&usqp=CAU")

    private val dogImages = listOf(
        "https://cdn.pixabay.com/photo/2016/12/13/05/15/puppy-1903313__340.jpg",
        "https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2018/01/12201051/cute-puppy-body-image.jpg",
        "https://cdn.mos.cms.futurecdn.net/QjuZKXnkLQgsYsL98uhL9X.jpg")

    private val parrotImages = listOf(
        "https://lafeber.com/pet-birds/wp-content/uploads/2018/06/Indian-Ring-Necked-Parakeet-300x300.jpg",
        "https://i.ytimg.com/vi/AVORzfvV114/maxresdefault.jpg",
        "https://lafeber.com/pet-birds/wp-content/uploads/2018/06/Eclectus.jpg")

    override fun getAnimals(): List<Animal> {
        return ArrayList<Animal>().apply {
            for (i in 0 until 20) {
                when {
                    i % 3 == 0 -> {
                        add(
                            Cat(
                                "Cat" + Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100).toString(),
                                catImages[Random.nextInt(0, 3)],
                                Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100).toString()
                            )
                        )
                    }
                    i % 3 == 1 -> {
                        add(
                            Dog(
                                "Dog" + Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100).toString(),
                                dogImages[Random.nextInt(0, 3)],
                                Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100).toString()
                            )
                        )
                    }
                    i % 3 == 2 -> {
                        add(
                            Parrot(
                                "Parrot" + Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100).toString(),
                                parrotImages[Random.nextInt(0, 3)],
                                Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100)
                            )
                        )
                    }
                }
            }
        }
    }
}