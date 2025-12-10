package com.aavidsoft.customview02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aavidsoft.customview02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var posts : ArrayList<Post>
    private lateinit var postsAdatper : PostsAdapter
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initData()
        initViews()
    }

    private fun initViews() {
        postsAdatper = PostsAdapter(posts)
        binding.recyclerPosts.adapter = postsAdatper
        binding.recyclerPosts.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    private fun initData() {
        posts = arrayListOf(
            Post(
                id = 1,
                title = "Eiffel Tower",
                description = "An iconic landmark in Paris, France, known for its stunning views and romantic ambiance.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/a/a8/Tour_Eiffel_Wikimedia_Commons.jpg"
            ),
            Post(
                id = 2,
                title = "Statue of Liberty",
                description = "A symbol of freedom located in New York Harbor, USA.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/4/47/New_York_-_Statue_of_Liberty.jpg"
            ),
            Post(
                id = 3,
                title = "Taj Mahal",
                description = "A UNESCO World Heritage site in Agra, India, famous for its white marble architecture.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/d/da/Taj-Mahal.jpg"
            ),
            Post(
                id = 4,
                title = "Great Wall of China",
                description = "Historic fortifications stretching thousands of miles across China.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/10/2018_Great_Wall_of_China.jpg"
            ),
            Post(
                id = 5,
                title = "Sydney Opera House",
                description = "A masterpiece of modern architecture located in Sydney, Australia.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/4/40/Sydney_Opera_House_Sails.jpg"
            ),
            Post(
                id = 6,
                title = "Machu Picchu",
                description = "Ancient Incan citadel set high in the Andes Mountains in Peru.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/eb/Machu_Picchu%2C_Peru.jpg"
            ),
            Post(
                id = 7,
                title = "Burj Khalifa",
                description = "The tallest building in the world, located in Dubai, UAE.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/93/Burj_Khalifa.jpg"
            ),
            Post(
                id = 8,
                title = "Colosseum",
                description = "An ancient Roman amphitheatre in Rome, Italy.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/d/de/Colosseo_2020.jpg"
            ),
            Post(
                id = 9,
                title = "Niagara Falls",
                description = "A group of massive waterfalls located on the border of the USA and Canada.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/2/2f/Niagara_Falls_from_Skylon_Tower_-_July_2017.jpg"
            ),
            Post(
                id = 10,
                title = "Santorini",
                description = "A beautiful Greek island known for its blue-domed buildings and sunsets.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/10/Oia_Santorini_Greece.jpg"
            ),
            Post(
                id = 11,
                title = "Mount Fuji",
                description = "Japan’s tallest mountain and iconic symbol.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/12/Mount_Fuji_and_Chureito_Pagoda.jpg"
            ),
            Post(
                id = 12,
                title = "Christ the Redeemer",
                description = "A giant statue overlooking Rio de Janeiro, Brazil.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/1/19/Cristo_Redentor_-_Rio_de_Janeiro%2C_Brasil.jpg"
            ),
            Post(
                id = 13,
                title = "Pyramids of Giza",
                description = "Ancient pyramids located near Cairo, Egypt.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/e3/Kheops-Pyramid.jpg"
            ),
            Post(
                id = 14,
                title = "Times Square",
                description = "The bustling commercial and entertainment hub in New York City.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/d/d3/Times_Square_%2813681676823%29.jpg"
            ),
            Post(
                id = 15,
                title = "Banff National Park",
                description = "A scenic park in Alberta, Canada known for turquoise lakes and mountains.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/9b/Moraine_Lake_17092005.jpg"
            ),
            Post(
                id = 16,
                title = "Angkor Wat",
                description = "The world’s largest religious monument, located in Cambodia.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/a/a2/Angkor_Wat_temple.jpg"
            ),
            Post(
                id = 17,
                title = "Golden Gate Bridge",
                description = "A famous suspension bridge located in San Francisco, USA.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/0/0c/Golden_Gate_Bridge_%28cropped%29.jpg"
            ),
            Post(
                id = 18,
                title = "Petra",
                description = "An ancient rock-carved city in Jordan.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/0/02/Petra_Jordan_BW_21.JPG"
            ),
            Post(
                id = 19,
                title = "Halong Bay",
                description = "A beautiful bay in Vietnam known for emerald waters and limestone islands.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/98/Ha_Long_Bay_in_Vietnam.jpg"
            ),
            Post(
                id = 20,
                title = "Stonehenge",
                description = "A prehistoric monument located in Wiltshire, England.",
                imageUrl = "https://upload.wikimedia.org/wikipedia/commons/3/3c/Stonehenge2007_07_30.jpg"
            )
        )

    }
}