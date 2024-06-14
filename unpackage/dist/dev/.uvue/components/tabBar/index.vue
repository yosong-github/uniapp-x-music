import { ref } from 'vue'
import { onShow } from '@dcloudio/uni-app'



export default {
  __name: 'index',
  setup(__props: GenComponentsTabBarIndex) {
const __ins = getCurrentInstance()!;
const _ctx = __ins.proxy as GenComponentsTabBarIndex;
const _cache = __ins.renderCache;

let page = ref<any>('')

const navTo = (path: string) => {
	uni.switchTab({
		url: path
	})
}

onShow(() => {
	page.value = getCurrentPages()[0].route
})

return "INLINE_RENDER"
}

}

function GenComponentsTabBarIndexRender(): any | null {

  return createElementVNode("view", utsMapOf({ class: "yoTabbar" }), [
    createElementVNode("image", utsMapOf({
      class: "bg",
      src: "/static/tabbarBg.png",
      mode: ""
    })),
    createElementVNode("view", utsMapOf({
      class: "tab-item",
      onClick: () => {navTo('/pages/index/index')}
    }), [
      createElementVNode("image", utsMapOf({
        class: "icon",
        src: unref(page) == 'pages/index/index' ? '../../static/home_select.png' : '../../static/home.png',
        mode: ""
      }), null, 8 /* PROPS */, ["src"])
    ], 8 /* PROPS */, ["onClick"]),
    createElementVNode("view", utsMapOf({ class: "search" }), [
      createElementVNode("text", utsMapOf({ class: "xxx" }), "搜索")
    ]),
    createElementVNode("view", utsMapOf({
      class: "tab-item",
      onClick: () => {navTo('/pages/broadcastingStation/index')}
    }), [
      createElementVNode("image", utsMapOf({
        class: "icon",
        src: unref(page) == 'pages/broadcastingStation/index' ? '../../static/FM_select.png' : '../../static/FM.png',
        mode: ""
      }), null, 8 /* PROPS */, ["src"])
    ], 8 /* PROPS */, ["onClick"])
  ])
}
const GenComponentsTabBarIndexStyles = [utsMapOf([["yoTabbar", padStyleMapOf(utsMapOf([["height", "140rpx"], ["display", "flex"], ["flexDirection", "row"], ["justifyContent", "space-between"], ["alignContent", "center"], ["overflow", "visible"], ["paddingBottom", "var(safe-area-inset-bottom)"], ["position", "relative"], ["left", "0%"], ["bottom", "0%"]]))], ["bg", utsMapOf([[".yoTabbar ", utsMapOf([["position", "absolute"], ["bottom", "0%"], ["left", "0%"], ["width", "100%"], ["height", "140rpx"]])]])], ["tab-item", utsMapOf([[".yoTabbar ", utsMapOf([["flex", 1], ["display", "flex"], ["justifyContent", "center"], ["alignItems", "center"]])]])], ["icon", utsMapOf([[".yoTabbar .tab-item ", utsMapOf([["width", "50rpx"], ["height", "50rpx"]])]])], ["search", utsMapOf([[".yoTabbar ", utsMapOf([["height", "140rpx"], ["width", "140rpx"], ["position", "relative"], ["top", "-70rpx"], ["backgroundColor", "#3e2ad1"], ["borderRadius", "70rpx"], ["justifyContent", "center"], ["alignItems", "center"]])]])], ["xxx", utsMapOf([[".yoTabbar .search ", utsMapOf([["color", "#ffffff"]])]])]])]
