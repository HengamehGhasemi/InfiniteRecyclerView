package com.testProject.giphy

import com.giphy.sdk.core.models.enums.MediaType
import com.giphy.sdk.ui.GPHContentType
import com.giphy.sdk.ui.views.GiphyGridView

object Config {
    var spanCount = 2
    var cellPadding = 0
    var mediaType = MediaType.gif
    var contentType = GPHContentType.gif
    var direction = GiphyGridView.VERTICAL
    var fixedSizeCells = false
    var showCheckeredBackground = true
    var ServicesUrl = "http://api.giphy.com/v1/gifs/"
}