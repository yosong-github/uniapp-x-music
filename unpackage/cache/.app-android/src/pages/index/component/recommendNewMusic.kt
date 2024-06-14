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
open class GenPagesIndexComponentRecommendNewMusic : VueComponent {
    constructor(instance: ComponentInternalInstance) : super(instance) {}
    companion object {
        @Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE")
        var setup: (__props: GenPagesIndexComponentRecommendNewMusic) -> Any? = fun(
        @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        __props): Any? {
            val __ins = getCurrentInstance()!!;
            val _ctx = __ins.proxy as GenPagesIndexComponentRecommendNewMusic;
            val _cache = __ins.renderCache;
            val data = object : UTSJSONObject(UTSSourceMapPosition("data", "pages/index/component/recommendNewMusic.uvue", 17, 7)) {
                var code: Number = 200
                var category: Number = 5
                var result = utsArrayOf(
                    object : UTSJSONObject() {
                        var id: Number = 2158973221
                        var type: Number = 4
                        var name = "若月亮没来 (Live版)"
                        var copywriter = null
                        var picUrl = "http://p1.music.126.net/4iTkYFSI2ILuXnv9yBgSnw==/109951169617468185.jpg"
                        var canDislike = false
                        var trackNumberUpdateTime = null
                        var song = object : UTSJSONObject() {
                            var name = "若月亮没来 (Live版)"
                            var id: Number = 2158973221
                            var position: Number = 0
                            var alias = ""
                            var status: Number = 0
                            var fee: Number = 8
                            var copyrightId: Number = 2712562
                            var disc = "01"
                            var no: Number = 3
                            var artists = utsArrayOf(
                                object : UTSJSONObject() {
                                    var name = "杨宗纬"
                                    var id: Number = 6066
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                },
                                object : UTSJSONObject() {
                                    var name = "宝石Gem"
                                    var id: Number = 12084497
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                },
                                object : UTSJSONObject() {
                                    var name = "王宇宙Leto"
                                    var id: Number = 49144727
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                            )
                            var album = object : UTSJSONObject() {
                                var name = "天赐的声音第五季 第5期"
                                var id: Number = 197079448
                                var type = "专辑"
                                var size: Number = 12
                                var picId: Number = 109951169617468200
                                var blurPicUrl = "http://p3.music.126.net/4iTkYFSI2ILuXnv9yBgSnw==/109951169617468185.jpg"
                                var companyId: Number = 0
                                var pic: Number = 109951169617468200
                                var picUrl = "http://p4.music.126.net/4iTkYFSI2ILuXnv9yBgSnw==/109951169617468185.jpg"
                                var publishTime: Number = 1716480000000
                                var description = ""
                                var tags = ""
                                var company = "浙江卫视"
                                var briefDesc = ""
                                var artist = object : UTSJSONObject() {
                                    var name = ""
                                    var id: Number = 0
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                                var songs = ""
                                var alias = ""
                                var status: Number = 1
                                var copyrightId: Number = 2712562
                                var commentThreadId = "R_AL_3_197079448"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var name = "天赐的声音"
                                        var id: Number = 34485896
                                        var picId: Number = 0
                                        var img1v1Id: Number = 0
                                        var briefDesc = ""
                                        var picUrl = ""
                                        var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                        var albumSize: Number = 0
                                        var alias = ""
                                        var trans = ""
                                        var musicSize: Number = 0
                                        var topicPerson: Number = 0
                                    }
                                )
                                var subType = "现场版"
                                var transName = null
                                var onSale = false
                                var mark: Number = 0
                                var gapless: Number = 0
                                var picId_str = "109951169617468185"
                            }
                            var starred = false
                            var popularity: Number = 100
                            var score: Number = 100
                            var starredNum: Number = 0
                            var duration: Number = 251938
                            var playedNum: Number = 0
                            var dayPlays: Number = 0
                            var hearTime: Number = 0
                            var sqMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9208999826
                                var size: Number = 28907671
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 917929
                                var playTime: Number = 251938
                                var volumeDelta: Number = -31510
                            }
                            var hrMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9208999824
                                var size: Number = 53159794
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1688027
                                var playTime: Number = 251938
                                var volumeDelta: Number = -31092
                            }
                            var ringtone = ""
                            var crbt = null
                            var audition = null
                            var copyFrom = ""
                            var commentThreadId = "R_SO_4_2158973221"
                            var rtUrl = null
                            var ftype: Number = 0
                            var rtUrls = ""
                            var copyright: Number = 0
                            var transName = null
                            var sign = null
                            var mark: Number = 0
                            var originCoverType: Number = 2
                            var originSongSimpleData = object : UTSJSONObject() {
                                var songId: Number = 2119795491
                                var name = "若月亮没来 (若是月亮还没来)"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var id: Number = 49144727
                                        var name = "王宇宙Leto"
                                    },
                                    object : UTSJSONObject() {
                                        var id: Number = 29785908
                                        var name = "乔浚丞"
                                    }
                                )
                                var albumMeta = object : UTSJSONObject() {
                                    var id: Number = 183856439
                                    var name = "若月亮没来（若是月亮还没来）"
                                }
                            }
                            var single: Number = 0
                            var noCopyrightRcmd = null
                            var mvid: Number = 0
                            var hMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9208999823
                                var size: Number = 10080045
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 320000
                                var playTime: Number = 251938
                                var volumeDelta: Number = -31116
                            }
                            var mMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9208999831
                                var size: Number = 6048045
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 192000
                                var playTime: Number = 251938
                                var volumeDelta: Number = -28511
                            }
                            var lMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9208999825
                                var size: Number = 4032045
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 251938
                                var volumeDelta: Number = -26796
                            }
                            var bMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9208999825
                                var size: Number = 4032045
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 251938
                                var volumeDelta: Number = -26796
                            }
                            var rtype: Number = 0
                            var rurl = null
                            var mp3Url = null
                            var privilege = object : UTSJSONObject() {
                                var id: Number = 2158973221
                                var fee: Number = 8
                                var payed: Number = 0
                                var st: Number = 0
                                var pl: Number = 320000
                                var dl: Number = 0
                                var sp: Number = 7
                                var cp: Number = 1
                                var subp: Number = 1
                                var cs = false
                                var maxbr: Number = 999000
                                var fl: Number = 320000
                                var toast = false
                                var flag: Number = 4
                                var preSell = false
                                var playMaxbr: Number = 999000
                                var downloadMaxbr: Number = 999000
                                var maxBrLevel = "hires"
                                var playMaxBrLevel = "hires"
                                var downloadMaxBrLevel = "hires"
                                var plLevel = "exhigh"
                                var dlLevel = "none"
                                var flLevel = "exhigh"
                                var rscl = null
                                var freeTrialPrivilege = object : UTSJSONObject() {
                                    var resConsumable = false
                                    var userConsumable = false
                                    var listenType = null
                                    var cannotListenReason = null
                                    var playReason = null
                                }
                                var rightSource: Number = 0
                                var chargeInfoList = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var rate: Number = 128000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 192000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 320000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 1999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    }
                                )
                            }
                        }
                        var alg = "server_doudi"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2163982959
                        var type: Number = 4
                        var name = "异客 (Live版)"
                        var copywriter = null
                        var picUrl = "http://p1.music.126.net/jWyR23nQNhhyHC_gCmgIPQ==/109951169661028262.jpg"
                        var canDislike = false
                        var trackNumberUpdateTime = null
                        var song = object : UTSJSONObject() {
                            var name = "异客 (Live版)"
                            var id: Number = 2163982959
                            var position: Number = 0
                            var alias = ""
                            var status: Number = 0
                            var fee: Number = 8
                            var copyrightId: Number = 2712562
                            var disc = "01"
                            var no: Number = 8
                            var artists = utsArrayOf(
                                object : UTSJSONObject() {
                                    var name = "杨坤"
                                    var id: Number = 6068
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                },
                                object : UTSJSONObject() {
                                    var name = "王睿卓"
                                    var id: Number = 52113028
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                },
                                object : UTSJSONObject() {
                                    var name = "王赫野"
                                    var id: Number = 47091532
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                            )
                            var album = object : UTSJSONObject() {
                                var name = "天赐的声音第五季 第7期"
                                var id: Number = 198583185
                                var type = "专辑"
                                var size: Number = 16
                                var picId: Number = 109951169661028260
                                var blurPicUrl = "http://p4.music.126.net/jWyR23nQNhhyHC_gCmgIPQ==/109951169661028262.jpg"
                                var companyId: Number = 0
                                var pic: Number = 109951169661028260
                                var picUrl = "http://p3.music.126.net/jWyR23nQNhhyHC_gCmgIPQ==/109951169661028262.jpg"
                                var publishTime: Number = 1717689600000
                                var description = ""
                                var tags = ""
                                var company = "浙江卫视"
                                var briefDesc = ""
                                var artist = object : UTSJSONObject() {
                                    var name = ""
                                    var id: Number = 0
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                                var songs = ""
                                var alias = ""
                                var status: Number = 1
                                var copyrightId: Number = 2712562
                                var commentThreadId = "R_AL_3_198583185"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var name = "天赐的声音"
                                        var id: Number = 34485896
                                        var picId: Number = 0
                                        var img1v1Id: Number = 0
                                        var briefDesc = ""
                                        var picUrl = ""
                                        var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                        var albumSize: Number = 0
                                        var alias = ""
                                        var trans = ""
                                        var musicSize: Number = 0
                                        var topicPerson: Number = 0
                                    }
                                )
                                var subType = "现场版"
                                var transName = null
                                var onSale = false
                                var mark: Number = 0
                                var gapless: Number = 0
                                var picId_str = "109951169661028262"
                            }
                            var starred = false
                            var popularity: Number = 100
                            var score: Number = 100
                            var starredNum: Number = 0
                            var duration: Number = 227250
                            var playedNum: Number = 0
                            var dayPlays: Number = 0
                            var hearTime: Number = 0
                            var sqMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9261789256
                                var size: Number = 27845359
                                var extension = "flac"
                                var sr: Number = 44100
                                var dfsId: Number = 0
                                var bitrate: Number = 980254
                                var playTime: Number = 227250
                                var volumeDelta: Number = -49524
                            }
                            var hrMusic = null
                            var ringtone = ""
                            var crbt = null
                            var audition = null
                            var copyFrom = ""
                            var commentThreadId = "R_SO_4_2163982959"
                            var rtUrl = null
                            var ftype: Number = 0
                            var rtUrls = ""
                            var copyright: Number = 0
                            var transName = null
                            var sign = null
                            var mark: Number = 0
                            var originCoverType: Number = 2
                            var originSongSimpleData = object : UTSJSONObject() {
                                var songId: Number = 2137785330
                                var name = "异客"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var id: Number = 0
                                        var name = "杨坤"
                                    }
                                )
                                var albumMeta = object : UTSJSONObject() {
                                    var id: Number = 0
                                    var name = ""
                                }
                            }
                            var single: Number = 0
                            var noCopyrightRcmd = null
                            var mvid: Number = 0
                            var hMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9261789251
                                var size: Number = 9092746
                                var extension = "mp3"
                                var sr: Number = 44100
                                var dfsId: Number = 0
                                var bitrate: Number = 320000
                                var playTime: Number = 227250
                                var volumeDelta: Number = -49170
                            }
                            var mMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9261789252
                                var size: Number = 5455665
                                var extension = "mp3"
                                var sr: Number = 44100
                                var dfsId: Number = 0
                                var bitrate: Number = 192000
                                var playTime: Number = 227250
                                var volumeDelta: Number = -46642
                            }
                            var lMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9261789257
                                var size: Number = 3637124
                                var extension = "mp3"
                                var sr: Number = 44100
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 227250
                                var volumeDelta: Number = -45113
                            }
                            var bMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9261789257
                                var size: Number = 3637124
                                var extension = "mp3"
                                var sr: Number = 44100
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 227250
                                var volumeDelta: Number = -45113
                            }
                            var rtype: Number = 0
                            var rurl = null
                            var mp3Url = null
                            var privilege = object : UTSJSONObject() {
                                var id: Number = 2163982959
                                var fee: Number = 8
                                var payed: Number = 0
                                var st: Number = 0
                                var pl: Number = 320000
                                var dl: Number = 0
                                var sp: Number = 7
                                var cp: Number = 1
                                var subp: Number = 1
                                var cs = false
                                var maxbr: Number = 999000
                                var fl: Number = 320000
                                var toast = false
                                var flag: Number = 4
                                var preSell = false
                                var playMaxbr: Number = 999000
                                var downloadMaxbr: Number = 999000
                                var maxBrLevel = "lossless"
                                var playMaxBrLevel = "lossless"
                                var downloadMaxBrLevel = "lossless"
                                var plLevel = "exhigh"
                                var dlLevel = "none"
                                var flLevel = "exhigh"
                                var rscl = null
                                var freeTrialPrivilege = object : UTSJSONObject() {
                                    var resConsumable = false
                                    var userConsumable = false
                                    var listenType = null
                                    var cannotListenReason = null
                                    var playReason = null
                                }
                                var rightSource: Number = 0
                                var chargeInfoList = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var rate: Number = 128000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 192000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 320000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    }
                                )
                            }
                        }
                        var alg = "server_doudi"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2164260202
                        var type: Number = 4
                        var name = "你在，不在 (live)"
                        var copywriter = null
                        var picUrl = "http://p1.music.126.net/la6-9Bo6WY7pupYPzK-gYg==/109951169665666559.jpg"
                        var canDislike = false
                        var trackNumberUpdateTime = null
                        var song = object : UTSJSONObject() {
                            var name = "你在，不在 (live)"
                            var id: Number = 2164260202
                            var position: Number = 0
                            var alias = ""
                            var status: Number = 0
                            var fee: Number = 8
                            var copyrightId: Number = 7001
                            var disc = "01"
                            var no: Number = 1
                            var artists = utsArrayOf(
                                object : UTSJSONObject() {
                                    var name = "汪苏泷"
                                    var id: Number = 5538
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                            )
                            var album = object : UTSJSONObject() {
                                var name = "歌手2024 第5期"
                                var id: Number = 198674841
                                var type = "专辑"
                                var size: Number = 5
                                var picId: Number = 109951169665666560
                                var blurPicUrl = "http://p4.music.126.net/la6-9Bo6WY7pupYPzK-gYg==/109951169665666559.jpg"
                                var companyId: Number = 0
                                var pic: Number = 109951169665666560
                                var picUrl = "http://p4.music.126.net/la6-9Bo6WY7pupYPzK-gYg==/109951169665666559.jpg"
                                var publishTime: Number = 1717776000000
                                var description = ""
                                var tags = ""
                                var company = "索尼音乐X芒果TV"
                                var briefDesc = ""
                                var artist = object : UTSJSONObject() {
                                    var name = ""
                                    var id: Number = 0
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                                var songs = ""
                                var alias = ""
                                var status: Number = 1
                                var copyrightId: Number = 7001
                                var commentThreadId = "R_AL_3_198674841"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var name = "歌手2024"
                                        var id: Number = 34299694
                                        var picId: Number = 0
                                        var img1v1Id: Number = 0
                                        var briefDesc = ""
                                        var picUrl = ""
                                        var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                        var albumSize: Number = 0
                                        var alias = ""
                                        var trans = ""
                                        var musicSize: Number = 0
                                        var topicPerson: Number = 0
                                    }
                                )
                                var subType = "现场版"
                                var transName = null
                                var onSale = false
                                var mark: Number = 0
                                var gapless: Number = 0
                                var picId_str = "109951169665666559"
                            }
                            var starred = false
                            var popularity: Number = 100
                            var score: Number = 100
                            var starredNum: Number = 0
                            var duration: Number = 257260
                            var playedNum: Number = 0
                            var dayPlays: Number = 0
                            var hearTime: Number = 0
                            var sqMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9263732434
                                var size: Number = 31364857
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 975350
                                var playTime: Number = 257260
                                var volumeDelta: Number = -23683
                            }
                            var hrMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9263732429
                                var size: Number = 56138794
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1745744
                                var playTime: Number = 257260
                                var volumeDelta: Number = -22938
                            }
                            var ringtone = ""
                            var crbt = null
                            var audition = null
                            var copyFrom = ""
                            var commentThreadId = "R_SO_4_2164260202"
                            var rtUrl = null
                            var ftype: Number = 0
                            var rtUrls = ""
                            var copyright: Number = 0
                            var transName = null
                            var sign = null
                            var mark: Number = 0
                            var originCoverType: Number = 2
                            var originSongSimpleData = object : UTSJSONObject() {
                                var songId: Number = 233921
                                var name = "你在 不在"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var id: Number = 7762
                                        var name = "郭采洁"
                                    }
                                )
                                var albumMeta = object : UTSJSONObject() {
                                    var id: Number = 23495
                                    var name = "爱异想"
                                }
                            }
                            var single: Number = 0
                            var noCopyrightRcmd = null
                            var mvid: Number = 0
                            var hMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9263732431
                                var size: Number = 10293165
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 320000
                                var playTime: Number = 257260
                                var volumeDelta: Number = -22925
                            }
                            var mMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9263732430
                                var size: Number = 6175917
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 192000
                                var playTime: Number = 257260
                                var volumeDelta: Number = -20353
                            }
                            var lMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9263732436
                                var size: Number = 4117293
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 257260
                                var volumeDelta: Number = -18701
                            }
                            var bMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9263732436
                                var size: Number = 4117293
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 257260
                                var volumeDelta: Number = -18701
                            }
                            var rtype: Number = 0
                            var rurl = null
                            var mp3Url = null
                            var privilege = object : UTSJSONObject() {
                                var id: Number = 2164260202
                                var fee: Number = 8
                                var payed: Number = 0
                                var st: Number = 0
                                var pl: Number = 320000
                                var dl: Number = 0
                                var sp: Number = 7
                                var cp: Number = 1
                                var subp: Number = 1
                                var cs = false
                                var maxbr: Number = 999000
                                var fl: Number = 320000
                                var toast = false
                                var flag: Number = 260
                                var preSell = false
                                var playMaxbr: Number = 999000
                                var downloadMaxbr: Number = 999000
                                var maxBrLevel = "hires"
                                var playMaxBrLevel = "hires"
                                var downloadMaxBrLevel = "hires"
                                var plLevel = "exhigh"
                                var dlLevel = "none"
                                var flLevel = "exhigh"
                                var rscl = null
                                var freeTrialPrivilege = object : UTSJSONObject() {
                                    var resConsumable = false
                                    var userConsumable = false
                                    var listenType = null
                                    var cannotListenReason = null
                                    var playReason = null
                                }
                                var rightSource: Number = 0
                                var chargeInfoList = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var rate: Number = 128000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 192000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 320000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 1999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    }
                                )
                            }
                        }
                        var alg = "server_doudi"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2161527760
                        var type: Number = 4
                        var name = "不如回家喝自来水 (Live版)"
                        var copywriter = null
                        var picUrl = "http://p1.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                        var canDislike = false
                        var trackNumberUpdateTime = null
                        var song = object : UTSJSONObject() {
                            var name = "不如回家喝自来水 (Live版)"
                            var id: Number = 2161527760
                            var position: Number = 0
                            var alias = ""
                            var status: Number = 0
                            var fee: Number = 8
                            var copyrightId: Number = 2712562
                            var disc = "01"
                            var no: Number = 1
                            var artists = utsArrayOf(
                                object : UTSJSONObject() {
                                    var name = "陈楚生"
                                    var id: Number = 2124
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                },
                                object : UTSJSONObject() {
                                    var name = "王赫野"
                                    var id: Number = 47091532
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                            )
                            var album = object : UTSJSONObject() {
                                var name = "天赐的声音第五季 第6期"
                                var id: Number = 197888525
                                var type = "专辑"
                                var size: Number = 12
                                var picId: Number = 109951169638223100
                                var blurPicUrl = "http://p4.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                                var companyId: Number = 0
                                var pic: Number = 109951169638223100
                                var picUrl = "http://p3.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                                var publishTime: Number = 1717084800000
                                var description = ""
                                var tags = ""
                                var company = "浙江卫视"
                                var briefDesc = ""
                                var artist = object : UTSJSONObject() {
                                    var name = ""
                                    var id: Number = 0
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                                var songs = ""
                                var alias = ""
                                var status: Number = 1
                                var copyrightId: Number = 2712562
                                var commentThreadId = "R_AL_3_197888525"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var name = "天赐的声音"
                                        var id: Number = 34485896
                                        var picId: Number = 0
                                        var img1v1Id: Number = 0
                                        var briefDesc = ""
                                        var picUrl = ""
                                        var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                        var albumSize: Number = 0
                                        var alias = ""
                                        var trans = ""
                                        var musicSize: Number = 0
                                        var topicPerson: Number = 0
                                    }
                                )
                                var subType = "现场版"
                                var transName = null
                                var onSale = false
                                var mark: Number = 0
                                var gapless: Number = 0
                                var picId_str = "109951169638223106"
                            }
                            var starred = false
                            var popularity: Number = 100
                            var score: Number = 100
                            var starredNum: Number = 0
                            var duration: Number = 201306
                            var playedNum: Number = 0
                            var dayPlays: Number = 0
                            var hearTime: Number = 0
                            var sqMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309970
                                var size: Number = 25488081
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1012906
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58066
                            }
                            var hrMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309975
                                var size: Number = 44859627
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1782740
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58104
                            }
                            var ringtone = ""
                            var crbt = null
                            var audition = null
                            var copyFrom = ""
                            var commentThreadId = "R_SO_4_2161527760"
                            var rtUrl = null
                            var ftype: Number = 0
                            var rtUrls = ""
                            var copyright: Number = 0
                            var transName = null
                            var sign = null
                            var mark: Number = 0
                            var originCoverType: Number = 2
                            var originSongSimpleData = object : UTSJSONObject() {
                                var songId: Number = 2109988312
                                var name = "不如回家喝自来水"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var id: Number = 31255673
                                        var name = "刘烨溦"
                                    }
                                )
                                var albumMeta = object : UTSJSONObject() {
                                    var id: Number = 181445218
                                    var name = "不如回家喝自来水"
                                }
                            }
                            var single: Number = 0
                            var noCopyrightRcmd = null
                            var mvid: Number = 0
                            var hMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309979
                                var size: Number = 8054445
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 320000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58142
                            }
                            var mMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309972
                                var size: Number = 4832685
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 192000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -55602
                            }
                            var lMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309976
                                var size: Number = 3221805
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -54067
                            }
                            var bMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309976
                                var size: Number = 3221805
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -54067
                            }
                            var rtype: Number = 0
                            var rurl = null
                            var mp3Url = null
                            var privilege = object : UTSJSONObject() {
                                var id: Number = 2161527760
                                var fee: Number = 8
                                var payed: Number = 0
                                var st: Number = 0
                                var pl: Number = 320000
                                var dl: Number = 0
                                var sp: Number = 7
                                var cp: Number = 1
                                var subp: Number = 1
                                var cs = false
                                var maxbr: Number = 999000
                                var fl: Number = 320000
                                var toast = false
                                var flag: Number = 4
                                var preSell = false
                                var playMaxbr: Number = 999000
                                var downloadMaxbr: Number = 999000
                                var maxBrLevel = "hires"
                                var playMaxBrLevel = "hires"
                                var downloadMaxBrLevel = "hires"
                                var plLevel = "exhigh"
                                var dlLevel = "none"
                                var flLevel = "exhigh"
                                var rscl = null
                                var freeTrialPrivilege = object : UTSJSONObject() {
                                    var resConsumable = false
                                    var userConsumable = false
                                    var listenType = null
                                    var cannotListenReason = null
                                    var playReason = null
                                }
                                var rightSource: Number = 0
                                var chargeInfoList = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var rate: Number = 128000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 192000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 320000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 1999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    }
                                )
                            }
                        }
                        var alg = "server_doudi"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2161527760
                        var type: Number = 4
                        var name = "不如回家喝自来水 (Live版)"
                        var copywriter = null
                        var picUrl = "http://p1.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                        var canDislike = false
                        var trackNumberUpdateTime = null
                        var song = object : UTSJSONObject() {
                            var name = "不如回家喝自来水 (Live版)"
                            var id: Number = 2161527760
                            var position: Number = 0
                            var alias = ""
                            var status: Number = 0
                            var fee: Number = 8
                            var copyrightId: Number = 2712562
                            var disc = "01"
                            var no: Number = 1
                            var artists = utsArrayOf(
                                object : UTSJSONObject() {
                                    var name = "陈楚生"
                                    var id: Number = 2124
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                },
                                object : UTSJSONObject() {
                                    var name = "王赫野"
                                    var id: Number = 47091532
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                            )
                            var album = object : UTSJSONObject() {
                                var name = "天赐的声音第五季 第6期"
                                var id: Number = 197888525
                                var type = "专辑"
                                var size: Number = 12
                                var picId: Number = 109951169638223100
                                var blurPicUrl = "http://p4.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                                var companyId: Number = 0
                                var pic: Number = 109951169638223100
                                var picUrl = "http://p3.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                                var publishTime: Number = 1717084800000
                                var description = ""
                                var tags = ""
                                var company = "浙江卫视"
                                var briefDesc = ""
                                var artist = object : UTSJSONObject() {
                                    var name = ""
                                    var id: Number = 0
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                                var songs = ""
                                var alias = ""
                                var status: Number = 1
                                var copyrightId: Number = 2712562
                                var commentThreadId = "R_AL_3_197888525"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var name = "天赐的声音"
                                        var id: Number = 34485896
                                        var picId: Number = 0
                                        var img1v1Id: Number = 0
                                        var briefDesc = ""
                                        var picUrl = ""
                                        var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                        var albumSize: Number = 0
                                        var alias = ""
                                        var trans = ""
                                        var musicSize: Number = 0
                                        var topicPerson: Number = 0
                                    }
                                )
                                var subType = "现场版"
                                var transName = null
                                var onSale = false
                                var mark: Number = 0
                                var gapless: Number = 0
                                var picId_str = "109951169638223106"
                            }
                            var starred = false
                            var popularity: Number = 100
                            var score: Number = 100
                            var starredNum: Number = 0
                            var duration: Number = 201306
                            var playedNum: Number = 0
                            var dayPlays: Number = 0
                            var hearTime: Number = 0
                            var sqMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309970
                                var size: Number = 25488081
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1012906
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58066
                            }
                            var hrMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309975
                                var size: Number = 44859627
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1782740
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58104
                            }
                            var ringtone = ""
                            var crbt = null
                            var audition = null
                            var copyFrom = ""
                            var commentThreadId = "R_SO_4_2161527760"
                            var rtUrl = null
                            var ftype: Number = 0
                            var rtUrls = ""
                            var copyright: Number = 0
                            var transName = null
                            var sign = null
                            var mark: Number = 0
                            var originCoverType: Number = 2
                            var originSongSimpleData = object : UTSJSONObject() {
                                var songId: Number = 2109988312
                                var name = "不如回家喝自来水"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var id: Number = 31255673
                                        var name = "刘烨溦"
                                    }
                                )
                                var albumMeta = object : UTSJSONObject() {
                                    var id: Number = 181445218
                                    var name = "不如回家喝自来水"
                                }
                            }
                            var single: Number = 0
                            var noCopyrightRcmd = null
                            var mvid: Number = 0
                            var hMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309979
                                var size: Number = 8054445
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 320000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58142
                            }
                            var mMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309972
                                var size: Number = 4832685
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 192000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -55602
                            }
                            var lMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309976
                                var size: Number = 3221805
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -54067
                            }
                            var bMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309976
                                var size: Number = 3221805
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -54067
                            }
                            var rtype: Number = 0
                            var rurl = null
                            var mp3Url = null
                            var privilege = object : UTSJSONObject() {
                                var id: Number = 2161527760
                                var fee: Number = 8
                                var payed: Number = 0
                                var st: Number = 0
                                var pl: Number = 320000
                                var dl: Number = 0
                                var sp: Number = 7
                                var cp: Number = 1
                                var subp: Number = 1
                                var cs = false
                                var maxbr: Number = 999000
                                var fl: Number = 320000
                                var toast = false
                                var flag: Number = 4
                                var preSell = false
                                var playMaxbr: Number = 999000
                                var downloadMaxbr: Number = 999000
                                var maxBrLevel = "hires"
                                var playMaxBrLevel = "hires"
                                var downloadMaxBrLevel = "hires"
                                var plLevel = "exhigh"
                                var dlLevel = "none"
                                var flLevel = "exhigh"
                                var rscl = null
                                var freeTrialPrivilege = object : UTSJSONObject() {
                                    var resConsumable = false
                                    var userConsumable = false
                                    var listenType = null
                                    var cannotListenReason = null
                                    var playReason = null
                                }
                                var rightSource: Number = 0
                                var chargeInfoList = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var rate: Number = 128000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 192000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 320000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 1999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    }
                                )
                            }
                        }
                        var alg = "server_doudi"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2161527760
                        var type: Number = 4
                        var name = "不如回家喝自来水 (Live版)"
                        var copywriter = null
                        var picUrl = "http://p1.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                        var canDislike = false
                        var trackNumberUpdateTime = null
                        var song = object : UTSJSONObject() {
                            var name = "不如回家喝自来水 (Live版)"
                            var id: Number = 2161527760
                            var position: Number = 0
                            var alias = ""
                            var status: Number = 0
                            var fee: Number = 8
                            var copyrightId: Number = 2712562
                            var disc = "01"
                            var no: Number = 1
                            var artists = utsArrayOf(
                                object : UTSJSONObject() {
                                    var name = "陈楚生"
                                    var id: Number = 2124
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                },
                                object : UTSJSONObject() {
                                    var name = "王赫野"
                                    var id: Number = 47091532
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                            )
                            var album = object : UTSJSONObject() {
                                var name = "天赐的声音第五季 第6期"
                                var id: Number = 197888525
                                var type = "专辑"
                                var size: Number = 12
                                var picId: Number = 109951169638223100
                                var blurPicUrl = "http://p4.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                                var companyId: Number = 0
                                var pic: Number = 109951169638223100
                                var picUrl = "http://p3.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                                var publishTime: Number = 1717084800000
                                var description = ""
                                var tags = ""
                                var company = "浙江卫视"
                                var briefDesc = ""
                                var artist = object : UTSJSONObject() {
                                    var name = ""
                                    var id: Number = 0
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                                var songs = ""
                                var alias = ""
                                var status: Number = 1
                                var copyrightId: Number = 2712562
                                var commentThreadId = "R_AL_3_197888525"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var name = "天赐的声音"
                                        var id: Number = 34485896
                                        var picId: Number = 0
                                        var img1v1Id: Number = 0
                                        var briefDesc = ""
                                        var picUrl = ""
                                        var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                        var albumSize: Number = 0
                                        var alias = ""
                                        var trans = ""
                                        var musicSize: Number = 0
                                        var topicPerson: Number = 0
                                    }
                                )
                                var subType = "现场版"
                                var transName = null
                                var onSale = false
                                var mark: Number = 0
                                var gapless: Number = 0
                                var picId_str = "109951169638223106"
                            }
                            var starred = false
                            var popularity: Number = 100
                            var score: Number = 100
                            var starredNum: Number = 0
                            var duration: Number = 201306
                            var playedNum: Number = 0
                            var dayPlays: Number = 0
                            var hearTime: Number = 0
                            var sqMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309970
                                var size: Number = 25488081
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1012906
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58066
                            }
                            var hrMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309975
                                var size: Number = 44859627
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1782740
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58104
                            }
                            var ringtone = ""
                            var crbt = null
                            var audition = null
                            var copyFrom = ""
                            var commentThreadId = "R_SO_4_2161527760"
                            var rtUrl = null
                            var ftype: Number = 0
                            var rtUrls = ""
                            var copyright: Number = 0
                            var transName = null
                            var sign = null
                            var mark: Number = 0
                            var originCoverType: Number = 2
                            var originSongSimpleData = object : UTSJSONObject() {
                                var songId: Number = 2109988312
                                var name = "不如回家喝自来水"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var id: Number = 31255673
                                        var name = "刘烨溦"
                                    }
                                )
                                var albumMeta = object : UTSJSONObject() {
                                    var id: Number = 181445218
                                    var name = "不如回家喝自来水"
                                }
                            }
                            var single: Number = 0
                            var noCopyrightRcmd = null
                            var mvid: Number = 0
                            var hMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309979
                                var size: Number = 8054445
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 320000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58142
                            }
                            var mMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309972
                                var size: Number = 4832685
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 192000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -55602
                            }
                            var lMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309976
                                var size: Number = 3221805
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -54067
                            }
                            var bMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309976
                                var size: Number = 3221805
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -54067
                            }
                            var rtype: Number = 0
                            var rurl = null
                            var mp3Url = null
                            var privilege = object : UTSJSONObject() {
                                var id: Number = 2161527760
                                var fee: Number = 8
                                var payed: Number = 0
                                var st: Number = 0
                                var pl: Number = 320000
                                var dl: Number = 0
                                var sp: Number = 7
                                var cp: Number = 1
                                var subp: Number = 1
                                var cs = false
                                var maxbr: Number = 999000
                                var fl: Number = 320000
                                var toast = false
                                var flag: Number = 4
                                var preSell = false
                                var playMaxbr: Number = 999000
                                var downloadMaxbr: Number = 999000
                                var maxBrLevel = "hires"
                                var playMaxBrLevel = "hires"
                                var downloadMaxBrLevel = "hires"
                                var plLevel = "exhigh"
                                var dlLevel = "none"
                                var flLevel = "exhigh"
                                var rscl = null
                                var freeTrialPrivilege = object : UTSJSONObject() {
                                    var resConsumable = false
                                    var userConsumable = false
                                    var listenType = null
                                    var cannotListenReason = null
                                    var playReason = null
                                }
                                var rightSource: Number = 0
                                var chargeInfoList = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var rate: Number = 128000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 192000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 320000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 1999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    }
                                )
                            }
                        }
                        var alg = "server_doudi"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2161527760
                        var type: Number = 4
                        var name = "不如回家喝自来水 (Live版)"
                        var copywriter = null
                        var picUrl = "http://p1.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                        var canDislike = false
                        var trackNumberUpdateTime = null
                        var song = object : UTSJSONObject() {
                            var name = "不如回家喝自来水 (Live版)"
                            var id: Number = 2161527760
                            var position: Number = 0
                            var alias = ""
                            var status: Number = 0
                            var fee: Number = 8
                            var copyrightId: Number = 2712562
                            var disc = "01"
                            var no: Number = 1
                            var artists = utsArrayOf(
                                object : UTSJSONObject() {
                                    var name = "陈楚生"
                                    var id: Number = 2124
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                },
                                object : UTSJSONObject() {
                                    var name = "王赫野"
                                    var id: Number = 47091532
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                            )
                            var album = object : UTSJSONObject() {
                                var name = "天赐的声音第五季 第6期"
                                var id: Number = 197888525
                                var type = "专辑"
                                var size: Number = 12
                                var picId: Number = 109951169638223100
                                var blurPicUrl = "http://p4.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                                var companyId: Number = 0
                                var pic: Number = 109951169638223100
                                var picUrl = "http://p3.music.126.net/NCsnuLNwwh8u2GuiFOLsDg==/109951169638223106.jpg"
                                var publishTime: Number = 1717084800000
                                var description = ""
                                var tags = ""
                                var company = "浙江卫视"
                                var briefDesc = ""
                                var artist = object : UTSJSONObject() {
                                    var name = ""
                                    var id: Number = 0
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                                var songs = ""
                                var alias = ""
                                var status: Number = 1
                                var copyrightId: Number = 2712562
                                var commentThreadId = "R_AL_3_197888525"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var name = "天赐的声音"
                                        var id: Number = 34485896
                                        var picId: Number = 0
                                        var img1v1Id: Number = 0
                                        var briefDesc = ""
                                        var picUrl = ""
                                        var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                        var albumSize: Number = 0
                                        var alias = ""
                                        var trans = ""
                                        var musicSize: Number = 0
                                        var topicPerson: Number = 0
                                    }
                                )
                                var subType = "现场版"
                                var transName = null
                                var onSale = false
                                var mark: Number = 0
                                var gapless: Number = 0
                                var picId_str = "109951169638223106"
                            }
                            var starred = false
                            var popularity: Number = 100
                            var score: Number = 100
                            var starredNum: Number = 0
                            var duration: Number = 201306
                            var playedNum: Number = 0
                            var dayPlays: Number = 0
                            var hearTime: Number = 0
                            var sqMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309970
                                var size: Number = 25488081
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1012906
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58066
                            }
                            var hrMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309975
                                var size: Number = 44859627
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1782740
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58104
                            }
                            var ringtone = ""
                            var crbt = null
                            var audition = null
                            var copyFrom = ""
                            var commentThreadId = "R_SO_4_2161527760"
                            var rtUrl = null
                            var ftype: Number = 0
                            var rtUrls = ""
                            var copyright: Number = 0
                            var transName = null
                            var sign = null
                            var mark: Number = 0
                            var originCoverType: Number = 2
                            var originSongSimpleData = object : UTSJSONObject() {
                                var songId: Number = 2109988312
                                var name = "不如回家喝自来水"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var id: Number = 31255673
                                        var name = "刘烨溦"
                                    }
                                )
                                var albumMeta = object : UTSJSONObject() {
                                    var id: Number = 181445218
                                    var name = "不如回家喝自来水"
                                }
                            }
                            var single: Number = 0
                            var noCopyrightRcmd = null
                            var mvid: Number = 0
                            var hMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309979
                                var size: Number = 8054445
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 320000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -58142
                            }
                            var mMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309972
                                var size: Number = 4832685
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 192000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -55602
                            }
                            var lMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309976
                                var size: Number = 3221805
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -54067
                            }
                            var bMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9236309976
                                var size: Number = 3221805
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 201306
                                var volumeDelta: Number = -54067
                            }
                            var rtype: Number = 0
                            var rurl = null
                            var mp3Url = null
                            var privilege = object : UTSJSONObject() {
                                var id: Number = 2161527760
                                var fee: Number = 8
                                var payed: Number = 0
                                var st: Number = 0
                                var pl: Number = 320000
                                var dl: Number = 0
                                var sp: Number = 7
                                var cp: Number = 1
                                var subp: Number = 1
                                var cs = false
                                var maxbr: Number = 999000
                                var fl: Number = 320000
                                var toast = false
                                var flag: Number = 4
                                var preSell = false
                                var playMaxbr: Number = 999000
                                var downloadMaxbr: Number = 999000
                                var maxBrLevel = "hires"
                                var playMaxBrLevel = "hires"
                                var downloadMaxBrLevel = "hires"
                                var plLevel = "exhigh"
                                var dlLevel = "none"
                                var flLevel = "exhigh"
                                var rscl = null
                                var freeTrialPrivilege = object : UTSJSONObject() {
                                    var resConsumable = false
                                    var userConsumable = false
                                    var listenType = null
                                    var cannotListenReason = null
                                    var playReason = null
                                }
                                var rightSource: Number = 0
                                var chargeInfoList = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var rate: Number = 128000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 192000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 320000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 1999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    }
                                )
                            }
                        }
                        var alg = "server_doudi"
                    },
                    object : UTSJSONObject() {
                        var id: Number = 2156439313
                        var type: Number = 4
                        var name = "虹之间 (Live版)"
                        var copywriter = null
                        var picUrl = "http://p1.music.126.net/DzkD7eQvZgAk58dbRa230Q==/109951169597295003.jpg"
                        var canDislike = false
                        var trackNumberUpdateTime = null
                        var song = object : UTSJSONObject() {
                            var name = "虹之间 (Live版)"
                            var id: Number = 2156439313
                            var position: Number = 0
                            var alias = ""
                            var status: Number = 0
                            var fee: Number = 8
                            var copyrightId: Number = 2712562
                            var disc = "01"
                            var no: Number = 5
                            var artists = utsArrayOf(
                                object : UTSJSONObject() {
                                    var name = "王赫野"
                                    var id: Number = 47091532
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                },
                                object : UTSJSONObject() {
                                    var name = "姚晓棠"
                                    var id: Number = 33709222
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                            )
                            var album = object : UTSJSONObject() {
                                var name = "天赐的声音第五季 第4期"
                                var id: Number = 196072242
                                var type = "专辑"
                                var size: Number = 10
                                var picId: Number = 109951169597295000
                                var blurPicUrl = "http://p4.music.126.net/DzkD7eQvZgAk58dbRa230Q==/109951169597295003.jpg"
                                var companyId: Number = 0
                                var pic: Number = 109951169597295000
                                var picUrl = "http://p4.music.126.net/DzkD7eQvZgAk58dbRa230Q==/109951169597295003.jpg"
                                var publishTime: Number = 1715875200000
                                var description = ""
                                var tags = ""
                                var company = "浙江卫视"
                                var briefDesc = ""
                                var artist = object : UTSJSONObject() {
                                    var name = ""
                                    var id: Number = 0
                                    var picId: Number = 0
                                    var img1v1Id: Number = 0
                                    var briefDesc = ""
                                    var picUrl = ""
                                    var img1v1Url = "http://p4.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                    var albumSize: Number = 0
                                    var alias = ""
                                    var trans = ""
                                    var musicSize: Number = 0
                                    var topicPerson: Number = 0
                                }
                                var songs = ""
                                var alias = ""
                                var status: Number = 1
                                var copyrightId: Number = 2712562
                                var commentThreadId = "R_AL_3_196072242"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var name = "天赐的声音"
                                        var id: Number = 34485896
                                        var picId: Number = 0
                                        var img1v1Id: Number = 0
                                        var briefDesc = ""
                                        var picUrl = ""
                                        var img1v1Url = "http://p3.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg"
                                        var albumSize: Number = 0
                                        var alias = ""
                                        var trans = ""
                                        var musicSize: Number = 0
                                        var topicPerson: Number = 0
                                    }
                                )
                                var subType = "现场版"
                                var transName = null
                                var onSale = false
                                var mark: Number = 0
                                var gapless: Number = 0
                                var picId_str = "109951169597295003"
                            }
                            var starred = false
                            var popularity: Number = 100
                            var score: Number = 100
                            var starredNum: Number = 0
                            var duration: Number = 207574
                            var playedNum: Number = 0
                            var dayPlays: Number = 0
                            var hearTime: Number = 0
                            var sqMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9180531413
                                var size: Number = 22486482
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 866636
                                var playTime: Number = 207574
                                var volumeDelta: Number = -35754
                            }
                            var hrMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9180531414
                                var size: Number = 42452785
                                var extension = "flac"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 1636144
                                var playTime: Number = 207574
                                var volumeDelta: Number = -35953
                            }
                            var ringtone = ""
                            var crbt = null
                            var audition = null
                            var copyFrom = ""
                            var commentThreadId = "R_SO_4_2156439313"
                            var rtUrl = null
                            var ftype: Number = 0
                            var rtUrls = ""
                            var copyright: Number = 0
                            var transName = null
                            var sign = null
                            var mark: Number = 0
                            var originCoverType: Number = 2
                            var originSongSimpleData = object : UTSJSONObject() {
                                var songId: Number = 28219176
                                var name = "虹之间"
                                var artists = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var id: Number = 827163
                                        var name = "金贵晟"
                                    }
                                )
                                var albumMeta = object : UTSJSONObject() {
                                    var id: Number = 2755020
                                    var name = "爱情公寓4 电视原声带"
                                }
                            }
                            var single: Number = 0
                            var noCopyrightRcmd = null
                            var mvid: Number = 0
                            var hMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9180531415
                                var size: Number = 8305005
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 320000
                                var playTime: Number = 207574
                                var volumeDelta: Number = -35956
                            }
                            var mMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9180531417
                                var size: Number = 4983021
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 192000
                                var playTime: Number = 207574
                                var volumeDelta: Number = -33342
                            }
                            var lMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9180531412
                                var size: Number = 3322029
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 207574
                                var volumeDelta: Number = -31608
                            }
                            var bMusic = object : UTSJSONObject() {
                                var name = null
                                var id: Number = 9180531412
                                var size: Number = 3322029
                                var extension = "mp3"
                                var sr: Number = 48000
                                var dfsId: Number = 0
                                var bitrate: Number = 128000
                                var playTime: Number = 207574
                                var volumeDelta: Number = -31608
                            }
                            var rtype: Number = 0
                            var rurl = null
                            var mp3Url = null
                            var privilege = object : UTSJSONObject() {
                                var id: Number = 2156439313
                                var fee: Number = 8
                                var payed: Number = 0
                                var st: Number = 0
                                var pl: Number = 320000
                                var dl: Number = 0
                                var sp: Number = 7
                                var cp: Number = 1
                                var subp: Number = 1
                                var cs = false
                                var maxbr: Number = 999000
                                var fl: Number = 320000
                                var toast = false
                                var flag: Number = 4
                                var preSell = false
                                var playMaxbr: Number = 999000
                                var downloadMaxbr: Number = 999000
                                var maxBrLevel = "hires"
                                var playMaxBrLevel = "hires"
                                var downloadMaxBrLevel = "hires"
                                var plLevel = "exhigh"
                                var dlLevel = "none"
                                var flLevel = "exhigh"
                                var rscl = null
                                var freeTrialPrivilege = object : UTSJSONObject() {
                                    var resConsumable = false
                                    var userConsumable = false
                                    var listenType = null
                                    var cannotListenReason = null
                                    var playReason = null
                                }
                                var rightSource: Number = 0
                                var chargeInfoList = utsArrayOf(
                                    object : UTSJSONObject() {
                                        var rate: Number = 128000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 192000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 320000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 0
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    },
                                    object : UTSJSONObject() {
                                        var rate: Number = 1999000
                                        var chargeUrl = null
                                        var chargeMessage = null
                                        var chargeType: Number = 1
                                    }
                                )
                            }
                        }
                        var alg = "server_doudi"
                    }
                )
            };
            return fun(): Any? {
                return createElementVNode("view", utsMapOf("class" to "newMusic"), utsArrayOf(
                    createElementVNode("text", utsMapOf("class" to "title"), "推荐新音乐"),
                    createElementVNode(Fragment, null, RenderHelpers.renderList(data.result, fun(it, _, _, _): VNode {
                        return createElementVNode("view", utsMapOf("class" to "item"), utsArrayOf(
                            createElementVNode("image", utsMapOf("class" to "itemImg", "src" to it["picUrl"], "mode" to ""), null, 8, utsArrayOf(
                                "src"
                            )),
                            createElementVNode("text", utsMapOf("class" to "name"), toDisplayString(it["name"]), 1),
                            createElementVNode("image", utsMapOf("class" to "play", "src" to "/static/play.png", "mode" to ""))
                        ));
                    }
                    ), 256)
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
                return utsMapOf("newMusic" to padStyleMapOf(utsMapOf("marginTop" to "24rpx", "marginRight" to "24rpx", "marginBottom" to "24rpx", "marginLeft" to "24rpx")), "title" to utsMapOf(".newMusic " to utsMapOf("marginTop" to "20rpx", "marginRight" to 0, "marginBottom" to "20rpx", "marginLeft" to 0)), "item" to utsMapOf(".newMusic " to utsMapOf("display" to "flex", "flexDirection" to "row", "alignItems" to "center", "marginTop" to "10rpx", "marginRight" to "10rpx", "marginBottom" to "10rpx", "marginLeft" to "10rpx")), "itemImg" to utsMapOf(".newMusic .item " to utsMapOf("height" to "150rpx", "marginRight" to "20rpx", "width" to "150rpx")), "name" to utsMapOf(".newMusic .item " to utsMapOf("fontSize" to "24rpx", "flex" to 1)), "play" to utsMapOf(".newMusic .item " to utsMapOf("width" to "60rpx", "height" to "60rpx")));
            }
        var inheritAttrs = true;
        var inject: Map<String, Map<String, Any?>> = utsMapOf();
        var emits: Map<String, Any?> = utsMapOf();
        var props = normalizePropsOptions(utsMapOf());
        var propsNeedCastKeys: UTSArray<String> = utsArrayOf();
        var components: Map<String, CreateVueComponent> = utsMapOf();
    }
}
