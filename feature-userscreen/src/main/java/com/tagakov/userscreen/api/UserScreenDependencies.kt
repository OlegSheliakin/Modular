package com.tagakov.userscreen.api

import com.tagakov.common.ComponentDependencies
import com.tagakov.common.di.Rx
import com.tagakov.timelogic.TimeLogicApi
import com.tagakov.timelogic.TimeMachine
import io.reactivex.Scheduler

interface UserScreenDependencies: ComponentDependencies, TimeLogicApi {
    fun userpicLinkProvider(): UserpicLinkProvider
    @Rx.MainScheduler fun mainThread(): Scheduler
}