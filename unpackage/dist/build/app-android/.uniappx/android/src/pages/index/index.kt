@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME")
package uni.UNI6983728;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.extapi.hideTabBar as uni_hideTabBar;
open class GenPagesIndexIndex : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesIndexIndex) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesIndexIndex;
            val _cache = __ins.renderCache;
            uni_hideTabBar(null);
            val menuState = ref(false);
            val isDraw = ref(false);
            val containerRef = ref<UniElement?>(null);
            val checkMenu = fun(){
                if (menuState.value) {
                    menuState.value = false;
                    containerRef.value?.style?.setProperty("left", "0px");
                    containerRef.value?.style?.setProperty("transform", "scale(1)");
                    containerRef.value?.style?.setProperty("border-radius", "0px");
                } else {
                    menuState.value = true;
                    containerRef.value?.style?.setProperty("left", "400rpx");
                    containerRef.value?.style?.setProperty("transform", "scale(0.9)");
                    containerRef.value?.style?.setProperty("border-radius", "50rpx");
                }
            }
            ;
            val drawStartX = ref(0);
            val drawStart = fun(e: UniTouchEvent){
                drawStartX.value = e.changedTouches[0].clientX;
            }
            ;
            val drawMove = fun(e: UniTouchEvent){
                if (e.changedTouches[0].clientX - drawStartX.value >= 80 && drawStartX.value <= 50) {
                    containerRef.value?.style?.setProperty("left", "400rpx");
                    containerRef.value?.style?.setProperty("transform", "scale(0.9)");
                    containerRef.value?.style?.setProperty("border-radius", "50rpx");
                    menuState.value = true;
                    isDraw.value = false;
                }
                if (e.changedTouches[0].clientX - drawStartX.value <= -50) {
                    containerRef.value?.style?.setProperty("left", "0px");
                    containerRef.value?.style?.setProperty("transform", "scale(1)");
                    containerRef.value?.style?.setProperty("border-radius", "0px");
                    menuState.value = false;
                    isDraw.value = false;
                }
            }
            ;
            val drawEnd = fun(){
                if (isDraw.value) {
                    menuState.value = false;
                    isDraw.value = false;
                    containerRef.value?.style?.setProperty("left", "0px");
                    containerRef.value?.style?.setProperty("transform", "scale(1)");
                    containerRef.value?.style?.setProperty("border-radius", "0px");
                }
            }
            ;
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "index-box"), utsArrayOf(
                    createElementVNode("view", utsMapOf("class" to "menu"), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "user"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "menuText"), "yosong")
                        )),
                        createElementVNode("view", utsMapOf("class" to "menuList"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "menuText"), "最近播放"),
                            createElementVNode("text", utsMapOf("class" to "menuText"), "收藏列表"),
                            createElementVNode("text", utsMapOf("class" to "menuText"), "修改密码"),
                            createElementVNode("text", utsMapOf("class" to "menuText"), "我的歌单")
                        )),
                        createElementVNode("view", utsMapOf("class" to "login_out"), utsArrayOf(
                            createElementVNode("text", utsMapOf("class" to "menuText"), "退出 登录")
                        ))
                    )),
                    createElementVNode("view", utsMapOf("class" to "index", "ref_key" to "containerRef", "ref" to containerRef, "onTouchstart" to drawStart, "onTouchmove" to drawMove, "onTouchend" to drawEnd), utsArrayOf(
                        createElementVNode("view", utsMapOf("class" to "menuIconBox", "onClick" to checkMenu), utsArrayOf(
                            createElementVNode("image", utsMapOf("class" to "menuIcon", "src" to "/static/menu.png", "mode" to ""))
                        )),
                        createElementVNode("scroll-view", utsMapOf("class" to "pageView", "show-scrollbar" to false, "style" to normalizeStyle(utsMapOf("flex" to "1"))), utsArrayOf(
                            createVNode(unref(GenPagesIndexComponentRecommendClass)),
                            createVNode(unref(GenPagesIndexComponentPlaylistClass)),
                            createVNode(unref(GenPagesIndexComponentRecommendNewMusicClass))
                        ), 4),
                        createVNode(GenComponentsTabBarIndexClass)
                    ), 544)
                ));
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ), utsArrayOf(
                    GenApp.styles
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("index-box" to padStyleMapOf(utsMapOf("position" to "relative", "height" to "100%")), "menu" to utsMapOf(".index-box " to utsMapOf("position" to "absolute", "top" to "0%", "left" to "0%", "height" to "100%", "width" to "100%", "backgroundColor" to "#f1f8fd", "paddingTop" to "80rpx", "paddingRight" to 0, "paddingBottom" to "80rpx", "paddingLeft" to "20rpx", "justifyContent" to "space-between")), "user" to utsMapOf(".index-box .menu " to utsMapOf("marginTop" to "80rpx", "backgroundColor" to "#3e2ad1", "paddingTop" to "40rpx", "paddingRight" to "10rpx", "paddingBottom" to "40rpx", "paddingLeft" to "10rpx", "marginLeft" to "-20rpx", "width" to "350rpx", "borderTopRightRadius" to "16rpx", "borderBottomRightRadius" to "16rpx")), "menuText" to utsMapOf(".index-box .menu .user " to utsMapOf("marginLeft" to "10rpx", "color" to "#ffffff"), ".index-box .menu .menuList " to utsMapOf("marginTop" to 0, "marginRight" to 0, "marginBottom" to "70rpx", "marginLeft" to "20rpx"), ".index-box .menu " to utsMapOf("color" to "#000000")), "menuList" to utsMapOf(".index-box .menu " to utsMapOf("height" to "70%", "marginTop" to "80rpx")), "login_out" to utsMapOf(".index-box .menu " to utsMapOf("marginTop" to 0, "marginRight" to 0, "marginBottom" to "70rpx", "marginLeft" to "20rpx")), "index" to utsMapOf(".index-box " to utsMapOf("boxShadow" to "0 1rpx 6rpx rgba(0, 0, 0, 0.3)", "position" to "absolute", "top" to "0rpx", "left" to "0rpx", "transitionDuration" to "0.1s", "transitionTimingFunction" to "linear", "display" to "flex", "flexDirection" to "column", "height" to "100%", "width" to "100%", "backgroundImage" to "linear-gradient(to bottom, #ffffff, #f1f8fd)")), "menuIconBox" to utsMapOf(".index-box .index " to utsMapOf("position" to "absolute", "marginTop" to CSS_VAR_STATUS_BAR_HEIGHT, "top" to "20rpx", "left" to "20rpx", "width" to "60rpx", "height" to "60rpx", "backgroundColor" to "#3e2ad1", "borderRadius" to "6rpx", "zIndex" to 9999, "justifyContent" to "center", "alignItems" to "center")), "menuIcon" to utsMapOf(".index-box .index .menuIconBox " to utsMapOf("zIndex" to 9999, "height" to "30rpx", "width" to "40rpx")), "@TRANSITION" to utsMapOf("index" to utsMapOf("duration" to "0.1s", "timingFunction" to "linear")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
