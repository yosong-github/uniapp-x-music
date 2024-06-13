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
open class GenPagesIndexComponentPlaylist : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesIndexComponentPlaylist) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesIndexComponentPlaylist;
            val _cache = __ins.renderCache;
            val data = object : UTSJSONObject(UTSSourceMapPosition("data", "pages/index/component/playlist.uvue", 16, 7)) {
                var hasTaste = false
                var code: Number = 200
                var category: Number = 0
                var result = utsArrayOf(
                    object : UTSJSONObject() {
                        var id: Number = 5437310387
                        var type: Number = 0
                        var name = "可以带来快乐的歌曲"
                        var copywriter = ""
                        var picUrl = "https://p2.music.126.net/DtJcpkEwI3izoM9cWtW5Bg==/109951165593305441.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1702307416362
                        var playCount: Number = 3351187
                        var trackCount: Number = 48
                        var highQuality = false
                        var alg = "byOldUserRedHeart_combine"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2228795231
                        var type: Number = 0
                        var name = "【旋律控】那些让你一秒沦陷的欧美精选"
                        var copywriter = ""
                        var picUrl = "https://p2.music.126.net/Dp8QSsP8xlU7yYIuo8pjCA==/109951167305112641.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1716999810149
                        var playCount: Number = 31503676
                        var trackCount: Number = 378
                        var highQuality = false
                        var alg = "byOldUserRedHeart_combine"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 877586534
                        var type: Number = 0
                        var name = "欧美惊艳歌曲 唤醒沉睡的耳朵"
                        var copywriter = ""
                        var picUrl = "https://p2.music.126.net/lG2_lOc_84JJiubXMax2hw==/19112810625771537.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1717195871942
                        var playCount: Number = 7571146
                        var trackCount: Number = 267
                        var highQuality = false
                        var alg = "byOldUserRedHeart_combine"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 5349200976
                        var type: Number = 0
                        var name = "深夜emo伤感丨一个人一首歌不同的故事"
                        var copywriter = ""
                        var picUrl = "https://p2.music.126.net/O7RmaIOOIPTToDdBYFBIiw==/109951168572162451.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1701995357335
                        var playCount: Number = 14867513
                        var trackCount: Number = 118
                        var highQuality = false
                        var alg = "byApp_combine"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 9114261138
                        var type: Number = 0
                        var name = "【kpop】五代女团红曲合集！"
                        var copywriter = ""
                        var picUrl = "https://p2.music.126.net/uolcvOl1pHXbkovMxjogAw==/109951169230289740.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1717144703511
                        var playCount: Number = 432014
                        var trackCount: Number = 122
                        var highQuality = false
                        var alg = "byOldUserRedHeart_combine"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 5314589580
                        var type: Number = 0
                        var name = "【K-POP】韩国女团超燃舞曲！！"
                        var copywriter = ""
                        var picUrl = "https://p2.music.126.net/f-ixd7DEAzbse4Yjc8RBeQ==/109951167025971836.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1717517618785
                        var playCount: Number = 3570619
                        var trackCount: Number = 126
                        var highQuality = false
                        var alg = "byOldUserRedHeart_combine"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 5079932281
                        var type: Number = 0
                        var name = "网络热歌精选 (持续更新)"
                        var copywriter = ""
                        var picUrl = "https://p2.music.126.net/GlSh5XnS-OJ9A8cJswirxw==/109951166232601457.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1628953709946
                        var playCount: Number = 1979772
                        var trackCount: Number = 68
                        var highQuality = false
                        var alg = "byOldUserRedHeart_combine"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2439058144
                        var type: Number = 0
                        var name = "超好听的韩语歌单"
                        var copywriter = ""
                        var picUrl = "https://p1.music.126.net/-_ENCXARoYVbCOoNG5tS8A==/109951168982073386.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1718010681589
                        var playCount: Number = 3918182
                        var trackCount: Number = 52
                        var highQuality = false
                        var alg = "byOldUserRedHeart_combine"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2802976810
                        var type: Number = 0
                        var name = "『哈利波特』b站剪辑视频歌曲（精选）"
                        var copywriter = ""
                        var picUrl = "https://p1.music.126.net/ubOY62N4noNH-CDmfmt3MA==/109951164081624049.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1632402219832
                        var playCount: Number = 109467
                        var trackCount: Number = 25
                        var highQuality = false
                        var alg = "byOldUserRedHeart_combine"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 4861736970
                        var type: Number = 0
                        var name = "欧美流行歌曲的天花板了吧"
                        var copywriter = ""
                        var picUrl = "https://p1.music.126.net/LHdUvZJ1OS6OlxjSBWn4HQ==/109951164762969900.jpg"
                        var canDislike = true
                        var trackNumberUpdateTime: Number = 1701452417164
                        var playCount: Number = 8316378
                        var trackCount: Number = 99
                        var highQuality = false
                        var alg = "byOldUserRedHeart_combine"
                    }
                )
            };
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "highquality"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "title"), "精选歌单"),
                    createElementVNode("scroll-view", utsMapOf("direction" to "horizontal", "show-scrollbar" to false, "class" to "list"), utsArrayOf(
                        createElementVNode(Fragment, null, RenderHelpers.renderList(data.result, fun(it, _, _, _): VNode {
                            return createElementVNode("view", utsMapOf("class" to "item"), utsArrayOf(
                                createElementVNode("image", utsMapOf("class" to "itemImg", "src" to it["picUrl"], "mode" to ""), null, 8, utsArrayOf(
                                    "src"
                                )),
                                createElementVNode("text", utsMapOf("class" to "name"), toDisplayString(it["name"]), 1)
                            ));
                        }
                        ), 256)
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
                return utsMapOf("highquality" to padStyleMapOf(utsMapOf("marginTop" to "24rpx", "marginRight" to "24rpx", "marginBottom" to "24rpx", "marginLeft" to "24rpx")), "title" to utsMapOf(".highquality " to utsMapOf("marginTop" to "20rpx", "marginRight" to 0, "marginBottom" to "20rpx", "marginLeft" to 0)), "list" to utsMapOf(".highquality " to utsMapOf("display" to "flex", "flexDirection" to "row")), "item" to utsMapOf(".highquality .list " to utsMapOf("width" to "200rpx", "marginRight" to "20rpx")), "itemImg" to utsMapOf(".highquality .list .item " to utsMapOf("height" to "200rpx", "width" to "200rpx")), "name" to utsMapOf(".highquality .list .item " to utsMapOf("fontSize" to "24rpx", "marginTop" to "6rpx")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
