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
open class GenPagesBroadcastingStationIndex : BasePage {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesBroadcastingStationIndex) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesBroadcastingStationIndex;
            val _cache = __ins.renderCache;
            uni_hideTabBar(null);
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "index"), utsArrayOf(
                    createElementVNode("scroll-view", utsMapOf("class" to "pageView", "show-scrollbar" to false, "style" to normalizeStyle(utsMapOf("flex" to "1"))), " 芜湖 ", 4),
                    createVNode(GenComponentsTabBarIndexClass)
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
                return utsMapOf("index" to padStyleMapOf(utsMapOf("display" to "flex", "flexDirection" to "column", "height" to "100%", "backgroundColor" to "#f1f8fd")), "pageView" to utsMapOf(".index " to utsMapOf("marginTop" to CSS_VAR_STATUS_BAR_HEIGHT)));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
