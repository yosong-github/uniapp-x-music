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
open class GenPagesIndexComponentRecommend : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
    override fun `$render`(): Any? {
        val _cache = this.`$`.renderCache;
        return createElementVNode("view", utsMapOf("class" to "recommend"), utsArrayOf(
            createElementVNode("image", utsMapOf("class" to "recommendImg", "src" to "http://p1.music.126.net/tQmjmqYs6bHi3I6srgEWGA==/109951169664272165.jpg", "mode" to "")),
            createElementVNode("view", utsMapOf("class" to "info"), utsArrayOf(
                createElementVNode("text", utsMapOf("class" to "desc ellipsis"), "晚星排排坐"),
                createElementVNode("view", utsMapOf("class" to "tagList"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "tag"), "华语"),
                    createElementVNode("text", utsMapOf("class" to "tag"), "灯忙")
                ))
            ))
        ));
    }
    companion object {
        val styles: Map<String, Map<String, Map<String, Any>>>
            get() {
                return normalizeCssStyles(utsArrayOf(
                    styles0
                ));
            }
        val styles0: Map<String, Map<String, Map<String, Any>>>
            get() {
                return utsMapOf("recommend" to padStyleMapOf(utsMapOf("position" to "relative", "height" to "400rpx")), "recommendImg" to utsMapOf(".recommend " to utsMapOf("width" to "100%", "height" to "100%")), "info" to utsMapOf(".recommend " to utsMapOf("position" to "absolute", "bottom" to "50rpx", "left" to "50rpx")), "desc" to utsMapOf(".recommend .info " to utsMapOf("color" to "#ffffff", "fontWeight" to "700")), "ellipsis" to utsMapOf(".recommend .info " to utsMapOf("whiteSpace" to "nowrap", "overflow" to "hidden", "textOverflow" to "ellipsis")), "tag" to utsMapOf(".recommend .info .tagList " to utsMapOf("color" to "#ffffff", "fontSize" to "24rpx")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
