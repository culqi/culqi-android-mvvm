package com.android.culqi.culqi_android.core.interactor

interface Interactor<in Params, out Type> {

    fun execute(params: Params): Type

    object None
}