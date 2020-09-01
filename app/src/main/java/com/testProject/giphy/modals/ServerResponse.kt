package com.testProject.giphy.modals

import com.testProject.giphy.entity.Giph

data class ServerResponse (
      var data : List<Giph>,
      var pagination : PaginationObject,
      var meta : Meta
)