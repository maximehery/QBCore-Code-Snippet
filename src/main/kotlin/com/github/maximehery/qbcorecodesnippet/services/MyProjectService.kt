package com.github.maximehery.qbcorecodesnippet.services

import com.github.maximehery.qbcorecodesnippet.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
