<template>
	<view class="yoTabbar">
		<image class="bg" src="../../static/tabbarBg.png" mode=""></image>
		
		<view class="tab-item" @click="navTo('/pages/index/index')">
			<image class="icon" :src="page == 'pages/index/index' ? '../../static/home_select.png' : '../../static/home.png'" mode=""></image>
		</view>
		<view class="search"><text class="xxx">搜索</text></view>
		<view class="tab-item" @click="navTo('/pages/broadcastingStation/index')">
			<image class="icon" :src="page == 'pages/broadcastingStation/index' ? '../../static/FM_select.png' : '../../static/FM.png'" mode=""></image>
		</view>
	</view>
</template>

<script setup lang="uts">
import { ref } from 'vue'
import { onShow } from '@dcloudio/uni-app'


let page = ref<any>('')

const navTo = (path: string) => {
	uni.switchTab({
		url: path
	})
}

onShow(() => {
	page.value = getCurrentPages()[0].route
})
</script>

<style lang="scss" scoped>
.yoTabbar{
	height: 140rpx;
	width: 100%;
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	align-content: center;
	overflow: visible;
	padding-bottom: var(safe-area-inset-bottom);
	position: relative;
	.bg{
		position: absolute;
		bottom: 0%;
		left: 0%;
		width: 100%;
		height: 140rpx;
	}
	
	.tab-item{
		flex: 1;
		display: flex;
		justify-content: center;
		align-items: center;
		.icon{
			width: 50rpx;
			height: 50rpx;
		}
	}
	
	
	.search{
		height: 140rpx;
		width: 140rpx;
		position: relative;
		top: -70rpx;
		background-color: #3e2ad1;
		border-radius: 70rpx;
		// border-left: 20rpx solid #f1f8fd;
		justify-content: center;
		align-items: center;
		.xxx{
			color: #fff;
		}
	}
}
</style>
