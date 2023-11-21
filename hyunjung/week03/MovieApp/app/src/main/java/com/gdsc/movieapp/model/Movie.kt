package com.gdsc.movieapp.model

data class Movie(
    val id:String,
    val title:String,
    val year:String,
    val genre:String,
    val director:String,
    val actors:String,
    val plot:String,
    val poster:String,
    val images:List<String>,
    val rating:String
)
fun getMovies(): List<Movie>{
    return listOf(
        Movie(
            id="tt0499549",
        title="Avatar",
        year="2009",
        genre="Action, Adventure,Fantasy",
        director="James Cameron",
        actors="Sam Worthington, Zoe Saldana",
        plot="A paraplegic marine dispatched to the moon Pandora on a unique mission",
        poster="https://i.namu.wiki/i/xoMh-LAhhM9P1k4j4eM43fpLZhYAPwjUvZpsNMxQqVnrnelLjYtj4Gp90RxZDqFeWg61imSgHC8nSImFISjL1vZ0GX1LWU2Rx04l3Na_jicdDlnyQyjuvZ3a2n_aLbs09lq2szBXp3QJveAMTz8irQ.webp",
        images=listOf(""),
        rating="7.9"),

        Movie(id="tt0416449",
            title="300",
            year="2006",
            genre="Action, Drama, Fantasy",
            director="Zack Snyder",
            actors="Genrard Butler, Lena Headey",
            plot="King Leonidas of Sparta and a force of 300 men fight",
            poster="https://i.namu.wiki/i/K0wOFtGOGxw0jVVHp6dI8775j-Ql7p4bhg1OSvGU-XMcVEDImgfZ23w4y-OQDQb_bHPP13ZFJWJMCJ4zOLjt_hnegEGicOZkTPII0fkmV-2hcMgRW2ESmmbfhwgo1jLcV45k856WYA29jS_2j3C-4A.webp",
            images=listOf(""),
            rating="7.5")
    )
}
