@file:Suppress("UNCHECKED_CAST", "USELESS_CAST", "INAPPLICABLE_JVM_NAME")
package uni.UNI6983728;
import io.dcloud.uniapp.*;
import io.dcloud.uniapp.extapi.*;
import io.dcloud.uniapp.framework.*;
import io.dcloud.uniapp.runtime.*;
import io.dcloud.uniapp.vue.*;
import io.dcloud.uniapp.vue.shared.*;
import io.dcloud.unicloud.*;
import io.dcloud.uts.*;
import io.dcloud.uts.Map;
import io.dcloud.uts.Set;
import io.dcloud.uts.UTSAndroid;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.async;
import io.dcloud.uniapp.framework.onShow;
import io.dcloud.uniapp.extapi.switchTab as uni_switchTab;
open class GenComponentsTabBarIndex : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenComponentsTabBarIndex) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenComponentsTabBarIndex;
            val _cache = __ins.renderCache;
            var page = ref<Any>("");
            val navTo = fun(path: String){
                uni_switchTab(SwitchTabOptions(url = path));
            }
            ;
            onShow(fun(){
                page.value = getCurrentPages()[0].route;
            }
            );
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "yoTabbar"), utsArrayOf(
                    createElementVNode("image", utsMapOf("class" to "bg", "src" to "/static/tabbarBg.png", "mode" to "")),
                    createElementVNode("view", utsMapOf("class" to "tab-item", "onClick" to fun(){
                        navTo("/pages/index/index");
                    }
                    ), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "icon", "src" to if (unref(page) == "pages/index/index") {
                            "../../static/home_select.png";
                        } else {
                            "../../static/home.png";
                        }
                        , "mode" to ""), null, 8, utsArrayOf(
                            "src"
                        ))
                    ), 8, utsArrayOf(
                        "onClick"
                    )),
                    createElementVNode("view", utsMapOf("class" to "search"), utsArrayOf(
                        createElementVNode("text", utsMapOf("class" to "xxx"), "搜索")
                    )),
                    createElementVNode("view", utsMapOf("class" to "tab-item", "onClick" to fun(){
                        navTo("/pages/broadcastingStation/index");
                    }
                    ), utsArrayOf(
                        createElementVNode("image", utsMapOf("class" to "icon", "src" to if (unref(page) == "pages/broadcastingStation/index") {
                            "../../static/FM_select.png";
                        } else {
                            "../../static/FM.png";
                        }
                        , "mode" to ""), null, 8, utsArrayOf(
                            "src"
                        ))
                    ), 8, utsArrayOf(
                        "onClick"
                    ))
                ));
            }
            ;
        }
        ;
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("yoTabbar" to padStyleMapOf(utsMapOf("height" to "140rpx", "display" to "flex", "flexDirection" to "row", "justifyContent" to "space-between", "alignContent" to "center", "overflow" to "visible", "paddingBottom" to "var(safe-area-inset-bottom)", "position" to "relative", "left" to "0%", "bottom" to "0%")), "bg" to utsMapOf(".yoTabbar " to utsMapOf("position" to "absolute", "bottom" to "0%", "left" to "0%", "width" to "100%", "height" to "140rpx")), "tab-item" to utsMapOf(".yoTabbar " to utsMapOf("flex" to 1, "display" to "flex", "justifyContent" to "center", "alignItems" to "center")), "icon" to utsMapOf(".yoTabbar .tab-item " to utsMapOf("width" to "50rpx", "height" to "50rpx")), "search" to utsMapOf(".yoTabbar " to utsMapOf("height" to "140rpx", "width" to "140rpx", "position" to "relative", "top" to "-70rpx", "backgroundColor" to "#3e2ad1", "borderRadius" to "70rpx", "justifyContent" to "center", "alignItems" to "center")), "xxx" to utsMapOf(".yoTabbar .search " to utsMapOf("color" to "#ffffff")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
