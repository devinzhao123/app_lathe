package com.github.devinzhao123.applathe.services

import com.intellij.openapi.project.Project
import com.github.devinzhao123.applathe.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
