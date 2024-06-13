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
import io.dcloud.uniapp.appframe.AppConfig;
import io.dcloud.uniapp.extapi.exit as uni_exit;
import io.dcloud.uniapp.extapi.showToast as uni_showToast;
var firstBackTime: Number = 0;
open class GenApp : BaseApp {
    constructor(instance: ComponentInternalInstance) : super(instance) {
        onLaunch(fun(_: OnLaunchOptions) {
            console.log("App Launch", " at App.uvue:9");
        }
        , instance);
        onAppShow(fun(_: OnShowOptions) {
            console.log("App Show", " at App.uvue:12");
        }
        , instance);
        onHide(fun() {
            console.log("App Hide", " at App.uvue:15");
        }
        , instance);
        onLastPageBackPress(fun() {
            console.log("App LastPageBackPress", " at App.uvue:19");
            if (firstBackTime == 0) {
                uni_showToast(ShowToastOptions(title = "再按一次退出应用", position = "bottom"));
                firstBackTime = Date.now();
                setTimeout(fun(){
                    firstBackTime = 0;
                }, 2000);
            } else if (Date.now() - firstBackTime < 2000) {
                firstBackTime = Date.now();
                uni_exit(null);
            }
        }
        , instance);
        onExit(fun() {
            console.log("App Exit", " at App.uvue:36");
        }
        , instance);
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
                return utsMapOf("uni-row" to padStyleMapOf(utsMapOf("flexDirection" to "row")), "uni-column" to padStyleMapOf(utsMapOf("flexDirection" to "column")));
            }
    }
}
val GenAppClass = CreateVueAppComponent(GenApp::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "app", name = "", inheritAttrs = true, inject = Map(), props = Map(), propsNeedCastKeys = utsArrayOf(), emits = Map(), components = Map(), styles = GenApp.styles);
}
, fun(instance): GenApp {
    return GenApp(instance);
}
);
val GenComponentsTabBarIndexClass = CreateVueComponent(GenComponentsTabBarIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenComponentsTabBarIndex.inheritAttrs, inject = GenComponentsTabBarIndex.inject, props = GenComponentsTabBarIndex.props, propsNeedCastKeys = GenComponentsTabBarIndex.propsNeedCastKeys, emits = GenComponentsTabBarIndex.emits, components = GenComponentsTabBarIndex.components, styles = GenComponentsTabBarIndex.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenComponentsTabBarIndex.setup(props as GenComponentsTabBarIndex);
    }
    );
}
, fun(instance): GenComponentsTabBarIndex {
    return GenComponentsTabBarIndex(instance);
}
);
val GenPagesIndexComponentRecommendNewMusicClass = CreateVueComponent(GenPagesIndexComponentRecommendNewMusic::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesIndexComponentRecommendNewMusic.inheritAttrs, inject = GenPagesIndexComponentRecommendNewMusic.inject, props = GenPagesIndexComponentRecommendNewMusic.props, propsNeedCastKeys = GenPagesIndexComponentRecommendNewMusic.propsNeedCastKeys, emits = GenPagesIndexComponentRecommendNewMusic.emits, components = GenPagesIndexComponentRecommendNewMusic.components, styles = GenPagesIndexComponentRecommendNewMusic.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesIndexComponentRecommendNewMusic.setup(props as GenPagesIndexComponentRecommendNewMusic);
    }
    );
}
, fun(instance): GenPagesIndexComponentRecommendNewMusic {
    return GenPagesIndexComponentRecommendNewMusic(instance);
}
);
val GenPagesIndexComponentRecommendClass = CreateVueComponent(GenPagesIndexComponentRecommend::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesIndexComponentRecommend.inheritAttrs, inject = GenPagesIndexComponentRecommend.inject, props = GenPagesIndexComponentRecommend.props, propsNeedCastKeys = GenPagesIndexComponentRecommend.propsNeedCastKeys, emits = GenPagesIndexComponentRecommend.emits, components = GenPagesIndexComponentRecommend.components, styles = GenPagesIndexComponentRecommend.styles);
}
, fun(instance): GenPagesIndexComponentRecommend {
    return GenPagesIndexComponentRecommend(instance);
}
);
val GenPagesIndexComponentPlaylistClass = CreateVueComponent(GenPagesIndexComponentPlaylist::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "component", name = "", inheritAttrs = GenPagesIndexComponentPlaylist.inheritAttrs, inject = GenPagesIndexComponentPlaylist.inject, props = GenPagesIndexComponentPlaylist.props, propsNeedCastKeys = GenPagesIndexComponentPlaylist.propsNeedCastKeys, emits = GenPagesIndexComponentPlaylist.emits, components = GenPagesIndexComponentPlaylist.components, styles = GenPagesIndexComponentPlaylist.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesIndexComponentPlaylist.setup(props as GenPagesIndexComponentPlaylist);
    }
    );
}
, fun(instance): GenPagesIndexComponentPlaylist {
    return GenPagesIndexComponentPlaylist(instance);
}
);
val GenPagesIndexIndexClass = CreateVueComponent(GenPagesIndexIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesIndexIndex.inheritAttrs, inject = GenPagesIndexIndex.inject, props = GenPagesIndexIndex.props, propsNeedCastKeys = GenPagesIndexIndex.propsNeedCastKeys, emits = GenPagesIndexIndex.emits, components = GenPagesIndexIndex.components, styles = GenPagesIndexIndex.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesIndexIndex.setup(props as GenPagesIndexIndex);
    }
    );
}
, fun(instance): GenPagesIndexIndex {
    return GenPagesIndexIndex(instance);
}
);
val GenPagesBroadcastingStationIndexClass = CreateVueComponent(GenPagesBroadcastingStationIndex::class.java, fun(): VueComponentOptions {
    return VueComponentOptions(type = "page", name = "", inheritAttrs = GenPagesBroadcastingStationIndex.inheritAttrs, inject = GenPagesBroadcastingStationIndex.inject, props = GenPagesBroadcastingStationIndex.props, propsNeedCastKeys = GenPagesBroadcastingStationIndex.propsNeedCastKeys, emits = GenPagesBroadcastingStationIndex.emits, components = GenPagesBroadcastingStationIndex.components, styles = GenPagesBroadcastingStationIndex.styles, setup = fun(props: ComponentPublicInstance): Any? {
        return GenPagesBroadcastingStationIndex.setup(props as GenPagesBroadcastingStationIndex);
    }
    );
}
, fun(instance): GenPagesBroadcastingStationIndex {
    return GenPagesBroadcastingStationIndex(instance);
}
);
fun createApp(): UTSJSONObject {
    val app = createSSRApp(GenAppClass);
    return object : UTSJSONObject() {
        var app = app
    };
}
fun main(app: IApp) {
    definePageRoutes();
    defineAppConfig();
    (createApp()["app"] as VueApp).mount(app);
}
open class UniAppConfig : AppConfig {
    override var name: String = "yosong";
    override var appid: String = "__UNI__6983728";
    override var versionName: String = "1.0.0";
    override var versionCode: String = "100";
    override var uniCompileVersion: String = "4.15";
    constructor(){}
}
fun definePageRoutes() {
    __uniRoutes.push(PageRoute(path = "pages/index/index", component = GenPagesIndexIndexClass, meta = PageMeta(isQuit = true), style = utsMapOf("navigationStyle" to "custom", "disableScroll" to true, "enablePullDownRefresh" to false)));
    __uniRoutes.push(PageRoute(path = "pages/broadcastingStation/index", component = GenPagesBroadcastingStationIndexClass, meta = PageMeta(isQuit = false), style = utsMapOf("navigationStyle" to "custom", "disableScroll" to true, "enablePullDownRefresh" to false)));
}
val __uniTabBar: Map<String, Any?>? = utsMapOf("list" to utsArrayOf(
    utsMapOf("pagePath" to "pages/index/index"),
    utsMapOf("pagePath" to "pages/broadcastingStation/index")
));
val __uniLaunchPage: Map<String, Any?> = utsMapOf("url" to "pages/index/index", "style" to utsMapOf("navigationStyle" to "custom", "disableScroll" to true, "enablePullDownRefresh" to false));
@Suppress("UNCHECKED_CAST")
fun defineAppConfig() {
    __uniConfig.entryPagePath = "/pages/index/index";
    __uniConfig.globalStyle = utsMapOf("navigationBarTextStyle" to "black", "navigationBarTitleText" to "", "navigationBarBackgroundColor" to "#ffffff", "backgroundColor" to "#ffffff");
    __uniConfig.tabBar = __uniTabBar as Map<String, Any>?;
    __uniConfig.conditionUrl = "";
    __uniConfig.uniIdRouter = utsMapOf();
    __uniConfig.ready = true;
}
fun getApp(): GenApp {
    return getBaseApp() as GenApp;
}
