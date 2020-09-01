package com.testProject.giphy.modals

data class ServerRequest (
    var api_key : String ,
    var limit : Int? ,
    var offset : Int?,
    var rating : String = "g",
    var random_id : String
)