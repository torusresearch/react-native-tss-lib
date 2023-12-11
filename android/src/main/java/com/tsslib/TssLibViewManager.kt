package com.tsslib

import android.graphics.Color
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.TssLibViewManagerInterface
import com.facebook.react.viewmanagers.TssLibViewManagerDelegate

@ReactModule(name = TssLibViewManager.NAME)
class TssLibViewManager : SimpleViewManager<TssLibView>(),
  TssLibViewManagerInterface<TssLibView> {
  private val mDelegate: ViewManagerDelegate<TssLibView>

  init {
    mDelegate = TssLibViewManagerDelegate(this)
  }

  override fun getDelegate(): ViewManagerDelegate<TssLibView>? {
    return mDelegate
  }

  override fun getName(): String {
    return NAME
  }

  public override fun createViewInstance(context: ThemedReactContext): TssLibView {
    return TssLibView(context)
  }

  @ReactProp(name = "color")
  override fun setColor(view: TssLibView?, color: String?) {
    view?.setBackgroundColor(Color.parseColor(color))
  }

  companion object {
    const val NAME = "TssLibView"
  }
}
