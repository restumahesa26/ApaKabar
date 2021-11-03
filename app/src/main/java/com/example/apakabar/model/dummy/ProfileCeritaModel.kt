package com.example.apakabar.model.dummy

class ProfileCeritaModel (pesan:String, waktu:String, like:Int, komentar:Int, share:Int) {
    var pesan = ""
    var waktu = ""
    var like = 0
    var komentar = 0
    var share = 0

    init {
        this.pesan = pesan
        this.waktu = waktu
        this.like = like
        this.komentar = komentar
        this.share = share
    }
}