package fr.racomach.immosnap

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform