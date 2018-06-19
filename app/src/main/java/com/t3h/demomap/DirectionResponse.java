package com.t3h.demomap;

import java.util.List;

/**
 * Created by Admins on 6/17/2018.
 */

public class DirectionResponse {


    /**
     * geocoded_waypoints : [{"geocoder_status":"OK","place_id":"ChIJv9WS4ldUNDERmkN0TcmRrCA","types":["establishment","point_of_interest","university"]},{"geocoder_status":"OK","place_id":"ChIJ122rzHasNTERA32pB1sq6VU","types":["establishment","point_of_interest","university"]}]
     * routes : [{"bounds":{"northeast":{"lat":21.055047,"lng":105.84157},"southwest":{"lat":21.0042042,"lng":105.7316843}},"copyrights":"Map data ©2018 Google","fare":{"currency":"VND","text":"\u20ab7,000","value":7000},"legs":[{"arrival_time":{"text":"7:13pm","time_zone":"Asia/Saigon","value":1529237600},"departure_time":{"text":"6:08pm","time_zone":"Asia/Saigon","value":1529233727},"distance":{"text":"15.6 km","value":15612},"duration":{"text":"1 hour 5 mins","value":3873},"end_address":"1 Đại Cồ Việt, Bách Khoa, Hai Bà Trưng, Hà Nội, Vietnam","end_location":{"lat":21.0050711,"lng":105.8414819},"start_address":"298, Hà Nội 100000, Vietnam","start_location":{"lat":21.0530159,"lng":105.7350895},"steps":[{"distance":{"text":"0.7 km","value":720},"duration":{"text":"9 mins","value":557},"end_location":{"lat":21.053398,"lng":105.7337273},"html_instructions":"Walk to ĐH Công Nghiệp HN","polyline":{"points":"k|n_CikjdSXNmAlBoBhDQXu@nAEF_CzDc@z@ZV~AgC|@_B|@uAD?D?F?`@q@Zi@"},"start_location":{"lat":21.0530159,"lng":105.7350895},"steps":[{"distance":{"text":"16 m","value":16},"duration":{"text":"1 min","value":11},"end_location":{"lat":21.0528909,"lng":105.7350075},"html_instructions":"Head <b>southwest<\/b> toward <b>Đường Cầu Diễn<\/b>/<b>QL32<\/b>","polyline":{"points":"k|n_CikjdSXN"},"start_location":{"lat":21.0530159,"lng":105.7350895},"travel_mode":"WALKING"},{"distance":{"text":"0.4 km","value":410},"duration":{"text":"5 mins","value":309},"end_location":{"lat":21.055047,"lng":105.731805},"html_instructions":"Turn <b>right<\/b> onto <b>Đường Cầu Diễn<\/b>/<b>QL32<\/b><div style=\"font-size:0.9em\">Continue to follow QL32<\/div><div style=\"font-size:0.9em\">Pass by Xưởng thực hành Sơn và Sữa chữa Thân xe (on the right in 60&nbsp;m)<\/div>","maneuver":"turn-right","polyline":{"points":"q{n_CyjjdSmAlBoBhDQXu@nAEF_CzDc@z@"},"start_location":{"lat":21.0528909,"lng":105.7350075},"travel_mode":"WALKING"},{"distance":{"text":"0.2 km","value":225},"duration":{"text":"3 mins","value":171},"end_location":{"lat":21.0538059,"lng":105.7332727},"html_instructions":"Make a <b>U-turn<\/b> at Cửa Hàng Đèn Trường Thủy<div style=\"font-size:0.9em\">Pass by Thời Trang HienMode (on the right in 55&nbsp;m)<\/div>","maneuver":"uturn-left","polyline":{"points":"aio_CwvidSZV~AgC|@_B|@uA"},"start_location":{"lat":21.055047,"lng":105.731805},"travel_mode":"WALKING"},{"distance":{"text":"11 m","value":11},"duration":{"text":"1 min","value":18},"end_location":{"lat":21.0537086,"lng":105.7332748},"html_instructions":"Turn <b>right<\/b> at Mỹ phẩm thiên nhiên Mộc Hà onto <b>Tỉnh lộ 70A<\/b>","maneuver":"turn-right","polyline":{"points":"iao_C}_jdSD?D?F?"},"start_location":{"lat":21.0538059,"lng":105.7332727},"travel_mode":"WALKING"},{"distance":{"text":"58 m","value":58},"duration":{"text":"1 min","value":48},"end_location":{"lat":21.053398,"lng":105.7337273},"html_instructions":"Turn <b>left<\/b> at Mỹ phẩm thiên nhiên Mộc Hà<div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-left","polyline":{"points":"u`o_C}_jdS`@q@Zi@"},"start_location":{"lat":21.0537086,"lng":105.7332748},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"14.7 km","value":14719},"duration":{"text":"43 mins","value":2580},"end_location":{"lat":21.004897,"lng":105.841209},"html_instructions":"Bus towards Bến xe Giáp Bát","polyline":{"points":"u~n_CacjdSGIxBmDbCiEzGkLx@wBZiA|B_HPk@`@_BxAmFlDgM`D}KhC{IrDoMhAuDDO~AwG~AgG`@wAnC{JzDmNd@cBfBkHpA_EfEsPtAgGhBcI~AoIrCoN\\uB`AsFx@kDR{@zAwG\\mBNiABe@NgEDoABeCBqDCgA[qDDcDDkEHmLHaEJqGJcFJ_BBW?w@RkAtBwJ|@aE~AoGxAyGH_@t@}CTq@`@o@d@k@rAuAvC}CLO`HiHhB}BfAkBLFX@VENIJSBW?UIOxBmE\\_AbAmCbAyCE_@a@{@u@W_AiAy@oDg@cGUeDG{@m@gFSkBYqCu@oIMmBE_@KmCGq@BaCBsCo@wIQoCQ{Co@oIo@qGOkBYmDu@_Ji@mFoAkKBk@Lq@H_@TqAzBwLvAsHTmA|AsIRy@`AwDhAaH^uB`AoFnAiGhJHpB@jMBzMH|EBtFDfKChJBzF@tSHvD@jA?xCA|BHnB?~CB`MBWD"},"start_location":{"lat":21.053394,"lng":105.733773},"transit_details":{"arrival_stop":{"location":{"lat":21.004897,"lng":105.841209},"name":"62-64 Giải Phóng"},"arrival_time":{"text":"7:11pm","time_zone":"Asia/Saigon","value":1529237465},"departure_stop":{"location":{"lat":21.053394,"lng":105.733773},"name":"ĐH Công Nghiệp HN"},"departure_time":{"text":"6:28pm","time_zone":"Asia/Saigon","value":1529234885},"headsign":"Bến xe Giáp Bát","headway":600,"line":{"agencies":[{"name":"Xí nghiệp xe buýt cầu Bươu","url":"http://doanhnghiepmoi.vn/company/Xi-Nghiep-Xe-Buyt-Cau-Buou-Chi-Nhanh-Tong-Cong-Ty-Van-Tai-Ha-Noi-05d2a.html"}],"color":"#ffffff","name":"Tuyến 32 - Bến xe Giáp Bát đi Nhổn","text_color":"#000000","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":25},"travel_mode":"TRANSIT"},{"distance":{"text":"0.2 km","value":173},"duration":{"text":"2 mins","value":134},"end_location":{"lat":21.0050711,"lng":105.8414819},"html_instructions":"Walk to 1 Đại Cồ Việt, Bách Khoa, Hai Bà Trưng, Hà Nội, Vietnam","polyline":{"points":"aoe_Cwb_eSzA@P?J?_@e@gA?cAKA?"},"start_location":{"lat":21.004809,"lng":105.841244},"steps":[{"distance":{"text":"67 m","value":67},"duration":{"text":"1 min","value":49},"end_location":{"lat":21.0042042,"lng":105.841229},"html_instructions":"Head <b>south<\/b> on <b>Giải Phóng<\/b> toward <b>Phương Mai<\/b>","polyline":{"points":"aoe_Cwb_eSzA@P?J?"},"start_location":{"lat":21.004809,"lng":105.841244},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":106},"duration":{"text":"1 min","value":85},"end_location":{"lat":21.0050711,"lng":105.8414819},"html_instructions":"Make a <b>U-turn<\/b> at Công Ty Tnhh Thiết Bị Y Tế Công Nghệ Mới<div style=\"font-size:0.9em\">Pass by Dịch Vụ In - Photocopy Quảng Doanh (on the right in 43&nbsp;m)<\/div>","maneuver":"uturn-left","polyline":{"points":"gke_Cub_eS_@e@gA?cAKA?"},"start_location":{"lat":21.0042042,"lng":105.841229},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}],"traffic_speed_entry":[],"via_waypoint":[]}],"overview_polyline":{"points":"k|n_CikjdSXNmAlBaCbE{@vAcDvFZV~AgC|@_B|@uAJ?F?`@q@Zi@@GGIxBmD~KuRx@wBZiAnCkIzBmInIeZ|HkXnAeE~D_PrKe`@fBkHpA_EfEsPtAgGhBcI~AoIrCoN\\uB`AsFx@kDnBsIl@wDRmFHuEBqDCgA[qDDcDNyRTsMJcFJ_BBoARkAtBwJ|@aE~AoGbByHt@}CTq@fA{AzOmPhB}BfAkBLFX@VENIJSBW?UIOxBmE\\_AfCgHE_@a@{@u@W_AiAy@oDg@cG]aFaAsIoAaNSmCS_EFuGcCs]_A}JoAmOi@mFoAkKBk@Lq@^qBrEkVrBaLtAqFhBwK`AoFnAiGzMJf\\LrMHfKChJBp[JbG@xCA|BHnGB`MBWDPEzA@\\?_@e@gA?eAK"},"summary":"","warnings":["Walking directions are in beta.    Use caution \u2013 This route may be missing sidewalks or pedestrian paths."],"waypoint_order":[]}]
     * status : OK
     */

    private String status;
    private List<GeocodedWaypointsBean> geocoded_waypoints;
    private List<RoutesBean> routes;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<GeocodedWaypointsBean> getGeocoded_waypoints() {
        return geocoded_waypoints;
    }

    public void setGeocoded_waypoints(List<GeocodedWaypointsBean> geocoded_waypoints) {
        this.geocoded_waypoints = geocoded_waypoints;
    }

    public List<RoutesBean> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RoutesBean> routes) {
        this.routes = routes;
    }

    public static class GeocodedWaypointsBean {
        /**
         * geocoder_status : OK
         * place_id : ChIJv9WS4ldUNDERmkN0TcmRrCA
         * types : ["establishment","point_of_interest","university"]
         */

        private String geocoder_status;
        private String place_id;
        private List<String> types;

        public String getGeocoder_status() {
            return geocoder_status;
        }

        public void setGeocoder_status(String geocoder_status) {
            this.geocoder_status = geocoder_status;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }
    }

    public static class RoutesBean {
        /**
         * bounds : {"northeast":{"lat":21.055047,"lng":105.84157},"southwest":{"lat":21.0042042,"lng":105.7316843}}
         * copyrights : Map data ©2018 Google
         * fare : {"currency":"VND","text":"\u20ab7,000","value":7000}
         * legs : [{"arrival_time":{"text":"7:13pm","time_zone":"Asia/Saigon","value":1529237600},"departure_time":{"text":"6:08pm","time_zone":"Asia/Saigon","value":1529233727},"distance":{"text":"15.6 km","value":15612},"duration":{"text":"1 hour 5 mins","value":3873},"end_address":"1 Đại Cồ Việt, Bách Khoa, Hai Bà Trưng, Hà Nội, Vietnam","end_location":{"lat":21.0050711,"lng":105.8414819},"start_address":"298, Hà Nội 100000, Vietnam","start_location":{"lat":21.0530159,"lng":105.7350895},"steps":[{"distance":{"text":"0.7 km","value":720},"duration":{"text":"9 mins","value":557},"end_location":{"lat":21.053398,"lng":105.7337273},"html_instructions":"Walk to ĐH Công Nghiệp HN","polyline":{"points":"k|n_CikjdSXNmAlBoBhDQXu@nAEF_CzDc@z@ZV~AgC|@_B|@uAD?D?F?`@q@Zi@"},"start_location":{"lat":21.0530159,"lng":105.7350895},"steps":[{"distance":{"text":"16 m","value":16},"duration":{"text":"1 min","value":11},"end_location":{"lat":21.0528909,"lng":105.7350075},"html_instructions":"Head <b>southwest<\/b> toward <b>Đường Cầu Diễn<\/b>/<b>QL32<\/b>","polyline":{"points":"k|n_CikjdSXN"},"start_location":{"lat":21.0530159,"lng":105.7350895},"travel_mode":"WALKING"},{"distance":{"text":"0.4 km","value":410},"duration":{"text":"5 mins","value":309},"end_location":{"lat":21.055047,"lng":105.731805},"html_instructions":"Turn <b>right<\/b> onto <b>Đường Cầu Diễn<\/b>/<b>QL32<\/b><div style=\"font-size:0.9em\">Continue to follow QL32<\/div><div style=\"font-size:0.9em\">Pass by Xưởng thực hành Sơn và Sữa chữa Thân xe (on the right in 60&nbsp;m)<\/div>","maneuver":"turn-right","polyline":{"points":"q{n_CyjjdSmAlBoBhDQXu@nAEF_CzDc@z@"},"start_location":{"lat":21.0528909,"lng":105.7350075},"travel_mode":"WALKING"},{"distance":{"text":"0.2 km","value":225},"duration":{"text":"3 mins","value":171},"end_location":{"lat":21.0538059,"lng":105.7332727},"html_instructions":"Make a <b>U-turn<\/b> at Cửa Hàng Đèn Trường Thủy<div style=\"font-size:0.9em\">Pass by Thời Trang HienMode (on the right in 55&nbsp;m)<\/div>","maneuver":"uturn-left","polyline":{"points":"aio_CwvidSZV~AgC|@_B|@uA"},"start_location":{"lat":21.055047,"lng":105.731805},"travel_mode":"WALKING"},{"distance":{"text":"11 m","value":11},"duration":{"text":"1 min","value":18},"end_location":{"lat":21.0537086,"lng":105.7332748},"html_instructions":"Turn <b>right<\/b> at Mỹ phẩm thiên nhiên Mộc Hà onto <b>Tỉnh lộ 70A<\/b>","maneuver":"turn-right","polyline":{"points":"iao_C}_jdSD?D?F?"},"start_location":{"lat":21.0538059,"lng":105.7332727},"travel_mode":"WALKING"},{"distance":{"text":"58 m","value":58},"duration":{"text":"1 min","value":48},"end_location":{"lat":21.053398,"lng":105.7337273},"html_instructions":"Turn <b>left<\/b> at Mỹ phẩm thiên nhiên Mộc Hà<div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-left","polyline":{"points":"u`o_C}_jdS`@q@Zi@"},"start_location":{"lat":21.0537086,"lng":105.7332748},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"14.7 km","value":14719},"duration":{"text":"43 mins","value":2580},"end_location":{"lat":21.004897,"lng":105.841209},"html_instructions":"Bus towards Bến xe Giáp Bát","polyline":{"points":"u~n_CacjdSGIxBmDbCiEzGkLx@wBZiA|B_HPk@`@_BxAmFlDgM`D}KhC{IrDoMhAuDDO~AwG~AgG`@wAnC{JzDmNd@cBfBkHpA_EfEsPtAgGhBcI~AoIrCoN\\uB`AsFx@kDR{@zAwG\\mBNiABe@NgEDoABeCBqDCgA[qDDcDDkEHmLHaEJqGJcFJ_BBW?w@RkAtBwJ|@aE~AoGxAyGH_@t@}CTq@`@o@d@k@rAuAvC}CLO`HiHhB}BfAkBLFX@VENIJSBW?UIOxBmE\\_AbAmCbAyCE_@a@{@u@W_AiAy@oDg@cGUeDG{@m@gFSkBYqCu@oIMmBE_@KmCGq@BaCBsCo@wIQoCQ{Co@oIo@qGOkBYmDu@_Ji@mFoAkKBk@Lq@H_@TqAzBwLvAsHTmA|AsIRy@`AwDhAaH^uB`AoFnAiGhJHpB@jMBzMH|EBtFDfKChJBzF@tSHvD@jA?xCA|BHnB?~CB`MBWD"},"start_location":{"lat":21.053394,"lng":105.733773},"transit_details":{"arrival_stop":{"location":{"lat":21.004897,"lng":105.841209},"name":"62-64 Giải Phóng"},"arrival_time":{"text":"7:11pm","time_zone":"Asia/Saigon","value":1529237465},"departure_stop":{"location":{"lat":21.053394,"lng":105.733773},"name":"ĐH Công Nghiệp HN"},"departure_time":{"text":"6:28pm","time_zone":"Asia/Saigon","value":1529234885},"headsign":"Bến xe Giáp Bát","headway":600,"line":{"agencies":[{"name":"Xí nghiệp xe buýt cầu Bươu","url":"http://doanhnghiepmoi.vn/company/Xi-Nghiep-Xe-Buyt-Cau-Buou-Chi-Nhanh-Tong-Cong-Ty-Van-Tai-Ha-Noi-05d2a.html"}],"color":"#ffffff","name":"Tuyến 32 - Bến xe Giáp Bát đi Nhổn","text_color":"#000000","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":25},"travel_mode":"TRANSIT"},{"distance":{"text":"0.2 km","value":173},"duration":{"text":"2 mins","value":134},"end_location":{"lat":21.0050711,"lng":105.8414819},"html_instructions":"Walk to 1 Đại Cồ Việt, Bách Khoa, Hai Bà Trưng, Hà Nội, Vietnam","polyline":{"points":"aoe_Cwb_eSzA@P?J?_@e@gA?cAKA?"},"start_location":{"lat":21.004809,"lng":105.841244},"steps":[{"distance":{"text":"67 m","value":67},"duration":{"text":"1 min","value":49},"end_location":{"lat":21.0042042,"lng":105.841229},"html_instructions":"Head <b>south<\/b> on <b>Giải Phóng<\/b> toward <b>Phương Mai<\/b>","polyline":{"points":"aoe_Cwb_eSzA@P?J?"},"start_location":{"lat":21.004809,"lng":105.841244},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":106},"duration":{"text":"1 min","value":85},"end_location":{"lat":21.0050711,"lng":105.8414819},"html_instructions":"Make a <b>U-turn<\/b> at Công Ty Tnhh Thiết Bị Y Tế Công Nghệ Mới<div style=\"font-size:0.9em\">Pass by Dịch Vụ In - Photocopy Quảng Doanh (on the right in 43&nbsp;m)<\/div>","maneuver":"uturn-left","polyline":{"points":"gke_Cub_eS_@e@gA?cAKA?"},"start_location":{"lat":21.0042042,"lng":105.841229},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}],"traffic_speed_entry":[],"via_waypoint":[]}]
         * overview_polyline : {"points":"k|n_CikjdSXNmAlBaCbE{@vAcDvFZV~AgC|@_B|@uAJ?F?`@q@Zi@@GGIxBmD~KuRx@wBZiAnCkIzBmInIeZ|HkXnAeE~D_PrKe`@fBkHpA_EfEsPtAgGhBcI~AoIrCoN\\uB`AsFx@kDnBsIl@wDRmFHuEBqDCgA[qDDcDNyRTsMJcFJ_BBoARkAtBwJ|@aE~AoGbByHt@}CTq@fA{AzOmPhB}BfAkBLFX@VENIJSBW?UIOxBmE\\_AfCgHE_@a@{@u@W_AiAy@oDg@cG]aFaAsIoAaNSmCS_EFuGcCs]_A}JoAmOi@mFoAkKBk@Lq@^qBrEkVrBaLtAqFhBwK`AoFnAiGzMJf\\LrMHfKChJBp[JbG@xCA|BHnGB`MBWDPEzA@\\?_@e@gA?eAK"}
         * summary :
         * warnings : ["Walking directions are in beta.    Use caution \u2013 This route may be missing sidewalks or pedestrian paths."]
         * waypoint_order : []
         */

        private BoundsBean bounds;
        private String copyrights;
        private FareBean fare;
        private OverviewPolylineBean overview_polyline;
        private String summary;
        private List<LegsBean> legs;
        private List<String> warnings;
        private List<?> waypoint_order;

        public BoundsBean getBounds() {
            return bounds;
        }

        public void setBounds(BoundsBean bounds) {
            this.bounds = bounds;
        }

        public String getCopyrights() {
            return copyrights;
        }

        public void setCopyrights(String copyrights) {
            this.copyrights = copyrights;
        }

        public FareBean getFare() {
            return fare;
        }

        public void setFare(FareBean fare) {
            this.fare = fare;
        }

        public OverviewPolylineBean getOverview_polyline() {
            return overview_polyline;
        }

        public void setOverview_polyline(OverviewPolylineBean overview_polyline) {
            this.overview_polyline = overview_polyline;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<LegsBean> getLegs() {
            return legs;
        }

        public void setLegs(List<LegsBean> legs) {
            this.legs = legs;
        }

        public List<String> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<String> warnings) {
            this.warnings = warnings;
        }

        public List<?> getWaypoint_order() {
            return waypoint_order;
        }

        public void setWaypoint_order(List<?> waypoint_order) {
            this.waypoint_order = waypoint_order;
        }

        public static class BoundsBean {
            /**
             * northeast : {"lat":21.055047,"lng":105.84157}
             * southwest : {"lat":21.0042042,"lng":105.7316843}
             */

            private NortheastBean northeast;
            private SouthwestBean southwest;

            public NortheastBean getNortheast() {
                return northeast;
            }

            public void setNortheast(NortheastBean northeast) {
                this.northeast = northeast;
            }

            public SouthwestBean getSouthwest() {
                return southwest;
            }

            public void setSouthwest(SouthwestBean southwest) {
                this.southwest = southwest;
            }

            public static class NortheastBean {
                /**
                 * lat : 21.055047
                 * lng : 105.84157
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class SouthwestBean {
                /**
                 * lat : 21.0042042
                 * lng : 105.7316843
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }
        }

        public static class FareBean {
            /**
             * currency : VND
             * text : ₫7,000
             * value : 7000
             */

            private String currency;
            private String text;
            private int value;

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }

        public static class OverviewPolylineBean {

            private String points;

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }
        }

        public static class LegsBean {
            /**
             * arrival_time : {"text":"7:13pm","time_zone":"Asia/Saigon","value":1529237600}
             * departure_time : {"text":"6:08pm","time_zone":"Asia/Saigon","value":1529233727}
             * distance : {"text":"15.6 km","value":15612}
             * duration : {"text":"1 hour 5 mins","value":3873}
             * end_address : 1 Đại Cồ Việt, Bách Khoa, Hai Bà Trưng, Hà Nội, Vietnam
             * end_location : {"lat":21.0050711,"lng":105.8414819}
             * start_address : 298, Hà Nội 100000, Vietnam
             * start_location : {"lat":21.0530159,"lng":105.7350895}
             * steps : [{"distance":{"text":"0.7 km","value":720},"duration":{"text":"9 mins","value":557},"end_location":{"lat":21.053398,"lng":105.7337273},"html_instructions":"Walk to ĐH Công Nghiệp HN","polyline":{"points":"k|n_CikjdSXNmAlBoBhDQXu@nAEF_CzDc@z@ZV~AgC|@_B|@uAD?D?F?`@q@Zi@"},"start_location":{"lat":21.0530159,"lng":105.7350895},"steps":[{"distance":{"text":"16 m","value":16},"duration":{"text":"1 min","value":11},"end_location":{"lat":21.0528909,"lng":105.7350075},"html_instructions":"Head <b>southwest<\/b> toward <b>Đường Cầu Diễn<\/b>/<b>QL32<\/b>","polyline":{"points":"k|n_CikjdSXN"},"start_location":{"lat":21.0530159,"lng":105.7350895},"travel_mode":"WALKING"},{"distance":{"text":"0.4 km","value":410},"duration":{"text":"5 mins","value":309},"end_location":{"lat":21.055047,"lng":105.731805},"html_instructions":"Turn <b>right<\/b> onto <b>Đường Cầu Diễn<\/b>/<b>QL32<\/b><div style=\"font-size:0.9em\">Continue to follow QL32<\/div><div style=\"font-size:0.9em\">Pass by Xưởng thực hành Sơn và Sữa chữa Thân xe (on the right in 60&nbsp;m)<\/div>","maneuver":"turn-right","polyline":{"points":"q{n_CyjjdSmAlBoBhDQXu@nAEF_CzDc@z@"},"start_location":{"lat":21.0528909,"lng":105.7350075},"travel_mode":"WALKING"},{"distance":{"text":"0.2 km","value":225},"duration":{"text":"3 mins","value":171},"end_location":{"lat":21.0538059,"lng":105.7332727},"html_instructions":"Make a <b>U-turn<\/b> at Cửa Hàng Đèn Trường Thủy<div style=\"font-size:0.9em\">Pass by Thời Trang HienMode (on the right in 55&nbsp;m)<\/div>","maneuver":"uturn-left","polyline":{"points":"aio_CwvidSZV~AgC|@_B|@uA"},"start_location":{"lat":21.055047,"lng":105.731805},"travel_mode":"WALKING"},{"distance":{"text":"11 m","value":11},"duration":{"text":"1 min","value":18},"end_location":{"lat":21.0537086,"lng":105.7332748},"html_instructions":"Turn <b>right<\/b> at Mỹ phẩm thiên nhiên Mộc Hà onto <b>Tỉnh lộ 70A<\/b>","maneuver":"turn-right","polyline":{"points":"iao_C}_jdSD?D?F?"},"start_location":{"lat":21.0538059,"lng":105.7332727},"travel_mode":"WALKING"},{"distance":{"text":"58 m","value":58},"duration":{"text":"1 min","value":48},"end_location":{"lat":21.053398,"lng":105.7337273},"html_instructions":"Turn <b>left<\/b> at Mỹ phẩm thiên nhiên Mộc Hà<div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-left","polyline":{"points":"u`o_C}_jdS`@q@Zi@"},"start_location":{"lat":21.0537086,"lng":105.7332748},"travel_mode":"WALKING"}],"travel_mode":"WALKING"},{"distance":{"text":"14.7 km","value":14719},"duration":{"text":"43 mins","value":2580},"end_location":{"lat":21.004897,"lng":105.841209},"html_instructions":"Bus towards Bến xe Giáp Bát","polyline":{"points":"u~n_CacjdSGIxBmDbCiEzGkLx@wBZiA|B_HPk@`@_BxAmFlDgM`D}KhC{IrDoMhAuDDO~AwG~AgG`@wAnC{JzDmNd@cBfBkHpA_EfEsPtAgGhBcI~AoIrCoN\\uB`AsFx@kDR{@zAwG\\mBNiABe@NgEDoABeCBqDCgA[qDDcDDkEHmLHaEJqGJcFJ_BBW?w@RkAtBwJ|@aE~AoGxAyGH_@t@}CTq@`@o@d@k@rAuAvC}CLO`HiHhB}BfAkBLFX@VENIJSBW?UIOxBmE\\_AbAmCbAyCE_@a@{@u@W_AiAy@oDg@cGUeDG{@m@gFSkBYqCu@oIMmBE_@KmCGq@BaCBsCo@wIQoCQ{Co@oIo@qGOkBYmDu@_Ji@mFoAkKBk@Lq@H_@TqAzBwLvAsHTmA|AsIRy@`AwDhAaH^uB`AoFnAiGhJHpB@jMBzMH|EBtFDfKChJBzF@tSHvD@jA?xCA|BHnB?~CB`MBWD"},"start_location":{"lat":21.053394,"lng":105.733773},"transit_details":{"arrival_stop":{"location":{"lat":21.004897,"lng":105.841209},"name":"62-64 Giải Phóng"},"arrival_time":{"text":"7:11pm","time_zone":"Asia/Saigon","value":1529237465},"departure_stop":{"location":{"lat":21.053394,"lng":105.733773},"name":"ĐH Công Nghiệp HN"},"departure_time":{"text":"6:28pm","time_zone":"Asia/Saigon","value":1529234885},"headsign":"Bến xe Giáp Bát","headway":600,"line":{"agencies":[{"name":"Xí nghiệp xe buýt cầu Bươu","url":"http://doanhnghiepmoi.vn/company/Xi-Nghiep-Xe-Buyt-Cau-Buou-Chi-Nhanh-Tong-Cong-Ty-Van-Tai-Ha-Noi-05d2a.html"}],"color":"#ffffff","name":"Tuyến 32 - Bến xe Giáp Bát đi Nhổn","text_color":"#000000","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":25},"travel_mode":"TRANSIT"},{"distance":{"text":"0.2 km","value":173},"duration":{"text":"2 mins","value":134},"end_location":{"lat":21.0050711,"lng":105.8414819},"html_instructions":"Walk to 1 Đại Cồ Việt, Bách Khoa, Hai Bà Trưng, Hà Nội, Vietnam","polyline":{"points":"aoe_Cwb_eSzA@P?J?_@e@gA?cAKA?"},"start_location":{"lat":21.004809,"lng":105.841244},"steps":[{"distance":{"text":"67 m","value":67},"duration":{"text":"1 min","value":49},"end_location":{"lat":21.0042042,"lng":105.841229},"html_instructions":"Head <b>south<\/b> on <b>Giải Phóng<\/b> toward <b>Phương Mai<\/b>","polyline":{"points":"aoe_Cwb_eSzA@P?J?"},"start_location":{"lat":21.004809,"lng":105.841244},"travel_mode":"WALKING"},{"distance":{"text":"0.1 km","value":106},"duration":{"text":"1 min","value":85},"end_location":{"lat":21.0050711,"lng":105.8414819},"html_instructions":"Make a <b>U-turn<\/b> at Công Ty Tnhh Thiết Bị Y Tế Công Nghệ Mới<div style=\"font-size:0.9em\">Pass by Dịch Vụ In - Photocopy Quảng Doanh (on the right in 43&nbsp;m)<\/div>","maneuver":"uturn-left","polyline":{"points":"gke_Cub_eS_@e@gA?cAKA?"},"start_location":{"lat":21.0042042,"lng":105.841229},"travel_mode":"WALKING"}],"travel_mode":"WALKING"}]
             * traffic_speed_entry : []
             * via_waypoint : []
             */

            private ArrivalTimeBean arrival_time;
            private DepartureTimeBean departure_time;
            private DistanceBean distance;
            private DurationBean duration;
            private String end_address;
            private EndLocationBean end_location;
            private String start_address;
            private StartLocationBean start_location;
            private List<StepsBeanX> steps;
            private List<?> traffic_speed_entry;
            private List<?> via_waypoint;

            public ArrivalTimeBean getArrival_time() {
                return arrival_time;
            }

            public void setArrival_time(ArrivalTimeBean arrival_time) {
                this.arrival_time = arrival_time;
            }

            public DepartureTimeBean getDeparture_time() {
                return departure_time;
            }

            public void setDeparture_time(DepartureTimeBean departure_time) {
                this.departure_time = departure_time;
            }

            public DistanceBean getDistance() {
                return distance;
            }

            public void setDistance(DistanceBean distance) {
                this.distance = distance;
            }

            public DurationBean getDuration() {
                return duration;
            }

            public void setDuration(DurationBean duration) {
                this.duration = duration;
            }

            public String getEnd_address() {
                return end_address;
            }

            public void setEnd_address(String end_address) {
                this.end_address = end_address;
            }

            public EndLocationBean getEnd_location() {
                return end_location;
            }

            public void setEnd_location(EndLocationBean end_location) {
                this.end_location = end_location;
            }

            public String getStart_address() {
                return start_address;
            }

            public void setStart_address(String start_address) {
                this.start_address = start_address;
            }

            public StartLocationBean getStart_location() {
                return start_location;
            }

            public void setStart_location(StartLocationBean start_location) {
                this.start_location = start_location;
            }

            public List<StepsBeanX> getSteps() {
                return steps;
            }

            public void setSteps(List<StepsBeanX> steps) {
                this.steps = steps;
            }

            public List<?> getTraffic_speed_entry() {
                return traffic_speed_entry;
            }

            public void setTraffic_speed_entry(List<?> traffic_speed_entry) {
                this.traffic_speed_entry = traffic_speed_entry;
            }

            public List<?> getVia_waypoint() {
                return via_waypoint;
            }

            public void setVia_waypoint(List<?> via_waypoint) {
                this.via_waypoint = via_waypoint;
            }

            public static class ArrivalTimeBean {
                /**
                 * text : 7:13pm
                 * time_zone : Asia/Saigon
                 * value : 1529237600
                 */

                private String text;
                private String time_zone;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getTime_zone() {
                    return time_zone;
                }

                public void setTime_zone(String time_zone) {
                    this.time_zone = time_zone;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DepartureTimeBean {
                /**
                 * text : 6:08pm
                 * time_zone : Asia/Saigon
                 * value : 1529233727
                 */

                private String text;
                private String time_zone;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getTime_zone() {
                    return time_zone;
                }

                public void setTime_zone(String time_zone) {
                    this.time_zone = time_zone;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DistanceBean {
                /**
                 * text : 15.6 km
                 * value : 15612
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class DurationBean {
                /**
                 * text : 1 hour 5 mins
                 * value : 3873
                 */

                private String text;
                private int value;

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }
            }

            public static class EndLocationBean {
                /**
                 * lat : 21.0050711
                 * lng : 105.8414819
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StartLocationBean {
                /**
                 * lat : 21.0530159
                 * lng : 105.7350895
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class StepsBeanX {
                /**
                 * distance : {"text":"0.7 km","value":720}
                 * duration : {"text":"9 mins","value":557}
                 * end_location : {"lat":21.053398,"lng":105.7337273}
                 * html_instructions : Walk to ĐH Công Nghiệp HN
                 * polyline : {"points":"k|n_CikjdSXNmAlBoBhDQXu@nAEF_CzDc@z@ZV~AgC|@_B|@uAD?D?F?`@q@Zi@"}
                 * start_location : {"lat":21.0530159,"lng":105.7350895}
                 * steps : [{"distance":{"text":"16 m","value":16},"duration":{"text":"1 min","value":11},"end_location":{"lat":21.0528909,"lng":105.7350075},"html_instructions":"Head <b>southwest<\/b> toward <b>Đường Cầu Diễn<\/b>/<b>QL32<\/b>","polyline":{"points":"k|n_CikjdSXN"},"start_location":{"lat":21.0530159,"lng":105.7350895},"travel_mode":"WALKING"},{"distance":{"text":"0.4 km","value":410},"duration":{"text":"5 mins","value":309},"end_location":{"lat":21.055047,"lng":105.731805},"html_instructions":"Turn <b>right<\/b> onto <b>Đường Cầu Diễn<\/b>/<b>QL32<\/b><div style=\"font-size:0.9em\">Continue to follow QL32<\/div><div style=\"font-size:0.9em\">Pass by Xưởng thực hành Sơn và Sữa chữa Thân xe (on the right in 60&nbsp;m)<\/div>","maneuver":"turn-right","polyline":{"points":"q{n_CyjjdSmAlBoBhDQXu@nAEF_CzDc@z@"},"start_location":{"lat":21.0528909,"lng":105.7350075},"travel_mode":"WALKING"},{"distance":{"text":"0.2 km","value":225},"duration":{"text":"3 mins","value":171},"end_location":{"lat":21.0538059,"lng":105.7332727},"html_instructions":"Make a <b>U-turn<\/b> at Cửa Hàng Đèn Trường Thủy<div style=\"font-size:0.9em\">Pass by Thời Trang HienMode (on the right in 55&nbsp;m)<\/div>","maneuver":"uturn-left","polyline":{"points":"aio_CwvidSZV~AgC|@_B|@uA"},"start_location":{"lat":21.055047,"lng":105.731805},"travel_mode":"WALKING"},{"distance":{"text":"11 m","value":11},"duration":{"text":"1 min","value":18},"end_location":{"lat":21.0537086,"lng":105.7332748},"html_instructions":"Turn <b>right<\/b> at Mỹ phẩm thiên nhiên Mộc Hà onto <b>Tỉnh lộ 70A<\/b>","maneuver":"turn-right","polyline":{"points":"iao_C}_jdSD?D?F?"},"start_location":{"lat":21.0538059,"lng":105.7332727},"travel_mode":"WALKING"},{"distance":{"text":"58 m","value":58},"duration":{"text":"1 min","value":48},"end_location":{"lat":21.053398,"lng":105.7337273},"html_instructions":"Turn <b>left<\/b> at Mỹ phẩm thiên nhiên Mộc Hà<div style=\"font-size:0.9em\">Destination will be on the left<\/div>","maneuver":"turn-left","polyline":{"points":"u`o_C}_jdS`@q@Zi@"},"start_location":{"lat":21.0537086,"lng":105.7332748},"travel_mode":"WALKING"}]
                 * travel_mode : WALKING
                 * transit_details : {"arrival_stop":{"location":{"lat":21.004897,"lng":105.841209},"name":"62-64 Giải Phóng"},"arrival_time":{"text":"7:11pm","time_zone":"Asia/Saigon","value":1529237465},"departure_stop":{"location":{"lat":21.053394,"lng":105.733773},"name":"ĐH Công Nghiệp HN"},"departure_time":{"text":"6:28pm","time_zone":"Asia/Saigon","value":1529234885},"headsign":"Bến xe Giáp Bát","headway":600,"line":{"agencies":[{"name":"Xí nghiệp xe buýt cầu Bươu","url":"http://doanhnghiepmoi.vn/company/Xi-Nghiep-Xe-Buyt-Cau-Buou-Chi-Nhanh-Tong-Cong-Ty-Van-Tai-Ha-Noi-05d2a.html"}],"color":"#ffffff","name":"Tuyến 32 - Bến xe Giáp Bát đi Nhổn","text_color":"#000000","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}},"num_stops":25}
                 */

                private DistanceBeanX distance;
                private DurationBeanX duration;
                private EndLocationBeanX end_location;
                private String html_instructions;
                private PolylineBean polyline;
                private StartLocationBeanX start_location;
                private String travel_mode;
                private TransitDetailsBean transit_details;
                private List<StepsBean> steps;

                public DistanceBeanX getDistance() {
                    return distance;
                }

                public void setDistance(DistanceBeanX distance) {
                    this.distance = distance;
                }

                public DurationBeanX getDuration() {
                    return duration;
                }

                public void setDuration(DurationBeanX duration) {
                    this.duration = duration;
                }

                public EndLocationBeanX getEnd_location() {
                    return end_location;
                }

                public void setEnd_location(EndLocationBeanX end_location) {
                    this.end_location = end_location;
                }

                public String getHtml_instructions() {
                    return html_instructions;
                }

                public void setHtml_instructions(String html_instructions) {
                    this.html_instructions = html_instructions;
                }

                public PolylineBean getPolyline() {
                    return polyline;
                }

                public void setPolyline(PolylineBean polyline) {
                    this.polyline = polyline;
                }

                public StartLocationBeanX getStart_location() {
                    return start_location;
                }

                public void setStart_location(StartLocationBeanX start_location) {
                    this.start_location = start_location;
                }

                public String getTravel_mode() {
                    return travel_mode;
                }

                public void setTravel_mode(String travel_mode) {
                    this.travel_mode = travel_mode;
                }

                public TransitDetailsBean getTransit_details() {
                    return transit_details;
                }

                public void setTransit_details(TransitDetailsBean transit_details) {
                    this.transit_details = transit_details;
                }

                public List<StepsBean> getSteps() {
                    return steps;
                }

                public void setSteps(List<StepsBean> steps) {
                    this.steps = steps;
                }

                public static class DistanceBeanX {
                    /**
                     * text : 0.7 km
                     * value : 720
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class DurationBeanX {
                    /**
                     * text : 9 mins
                     * value : 557
                     */

                    private String text;
                    private int value;

                    public String getText() {
                        return text;
                    }

                    public void setText(String text) {
                        this.text = text;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }

                public static class EndLocationBeanX {
                    /**
                     * lat : 21.053398
                     * lng : 105.7337273
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class PolylineBean {
                    /**
                     * points : k|n_CikjdSXNmAlBoBhDQXu@nAEF_CzDc@z@ZV~AgC|@_B|@uAD?D?F?`@q@Zi@
                     */

                    private String points;

                    public String getPoints() {
                        return points;
                    }

                    public void setPoints(String points) {
                        this.points = points;
                    }
                }

                public static class StartLocationBeanX {
                    /**
                     * lat : 21.0530159
                     * lng : 105.7350895
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class TransitDetailsBean {
                    /**
                     * arrival_stop : {"location":{"lat":21.004897,"lng":105.841209},"name":"62-64 Giải Phóng"}
                     * arrival_time : {"text":"7:11pm","time_zone":"Asia/Saigon","value":1529237465}
                     * departure_stop : {"location":{"lat":21.053394,"lng":105.733773},"name":"ĐH Công Nghiệp HN"}
                     * departure_time : {"text":"6:28pm","time_zone":"Asia/Saigon","value":1529234885}
                     * headsign : Bến xe Giáp Bát
                     * headway : 600
                     * line : {"agencies":[{"name":"Xí nghiệp xe buýt cầu Bươu","url":"http://doanhnghiepmoi.vn/company/Xi-Nghiep-Xe-Buyt-Cau-Buou-Chi-Nhanh-Tong-Cong-Ty-Van-Tai-Ha-Noi-05d2a.html"}],"color":"#ffffff","name":"Tuyến 32 - Bến xe Giáp Bát đi Nhổn","text_color":"#000000","vehicle":{"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}}
                     * num_stops : 25
                     */

                    private ArrivalStopBean arrival_stop;
                    private ArrivalTimeBeanX arrival_time;
                    private DepartureStopBean departure_stop;
                    private DepartureTimeBeanX departure_time;
                    private String headsign;
                    private int headway;
                    private LineBean line;
                    private int num_stops;

                    public ArrivalStopBean getArrival_stop() {
                        return arrival_stop;
                    }

                    public void setArrival_stop(ArrivalStopBean arrival_stop) {
                        this.arrival_stop = arrival_stop;
                    }

                    public ArrivalTimeBeanX getArrival_time() {
                        return arrival_time;
                    }

                    public void setArrival_time(ArrivalTimeBeanX arrival_time) {
                        this.arrival_time = arrival_time;
                    }

                    public DepartureStopBean getDeparture_stop() {
                        return departure_stop;
                    }

                    public void setDeparture_stop(DepartureStopBean departure_stop) {
                        this.departure_stop = departure_stop;
                    }

                    public DepartureTimeBeanX getDeparture_time() {
                        return departure_time;
                    }

                    public void setDeparture_time(DepartureTimeBeanX departure_time) {
                        this.departure_time = departure_time;
                    }

                    public String getHeadsign() {
                        return headsign;
                    }

                    public void setHeadsign(String headsign) {
                        this.headsign = headsign;
                    }

                    public int getHeadway() {
                        return headway;
                    }

                    public void setHeadway(int headway) {
                        this.headway = headway;
                    }

                    public LineBean getLine() {
                        return line;
                    }

                    public void setLine(LineBean line) {
                        this.line = line;
                    }

                    public int getNum_stops() {
                        return num_stops;
                    }

                    public void setNum_stops(int num_stops) {
                        this.num_stops = num_stops;
                    }

                    public static class ArrivalStopBean {
                        /**
                         * location : {"lat":21.004897,"lng":105.841209}
                         * name : 62-64 Giải Phóng
                         */

                        private LocationBean location;
                        private String name;

                        public LocationBean getLocation() {
                            return location;
                        }

                        public void setLocation(LocationBean location) {
                            this.location = location;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public static class LocationBean {
                            /**
                             * lat : 21.004897
                             * lng : 105.841209
                             */

                            private double lat;
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }
                        }
                    }

                    public static class ArrivalTimeBeanX {
                        /**
                         * text : 7:11pm
                         * time_zone : Asia/Saigon
                         * value : 1529237465
                         */

                        private String text;
                        private String time_zone;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getTime_zone() {
                            return time_zone;
                        }

                        public void setTime_zone(String time_zone) {
                            this.time_zone = time_zone;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class DepartureStopBean {
                        /**
                         * location : {"lat":21.053394,"lng":105.733773}
                         * name : ĐH Công Nghiệp HN
                         */

                        private LocationBeanX location;
                        private String name;

                        public LocationBeanX getLocation() {
                            return location;
                        }

                        public void setLocation(LocationBeanX location) {
                            this.location = location;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public static class LocationBeanX {
                            /**
                             * lat : 21.053394
                             * lng : 105.733773
                             */

                            private double lat;
                            private double lng;

                            public double getLat() {
                                return lat;
                            }

                            public void setLat(double lat) {
                                this.lat = lat;
                            }

                            public double getLng() {
                                return lng;
                            }

                            public void setLng(double lng) {
                                this.lng = lng;
                            }
                        }
                    }

                    public static class DepartureTimeBeanX {
                        /**
                         * text : 6:28pm
                         * time_zone : Asia/Saigon
                         * value : 1529234885
                         */

                        private String text;
                        private String time_zone;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public String getTime_zone() {
                            return time_zone;
                        }

                        public void setTime_zone(String time_zone) {
                            this.time_zone = time_zone;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class LineBean {
                        /**
                         * agencies : [{"name":"Xí nghiệp xe buýt cầu Bươu","url":"http://doanhnghiepmoi.vn/company/Xi-Nghiep-Xe-Buyt-Cau-Buou-Chi-Nhanh-Tong-Cong-Ty-Van-Tai-Ha-Noi-05d2a.html"}]
                         * color : #ffffff
                         * name : Tuyến 32 - Bến xe Giáp Bát đi Nhổn
                         * text_color : #000000
                         * vehicle : {"icon":"//maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png","name":"Bus","type":"BUS"}
                         */

                        private String color;
                        private String name;
                        private String text_color;
                        private VehicleBean vehicle;
                        private List<AgenciesBean> agencies;

                        public String getColor() {
                            return color;
                        }

                        public void setColor(String color) {
                            this.color = color;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getText_color() {
                            return text_color;
                        }

                        public void setText_color(String text_color) {
                            this.text_color = text_color;
                        }

                        public VehicleBean getVehicle() {
                            return vehicle;
                        }

                        public void setVehicle(VehicleBean vehicle) {
                            this.vehicle = vehicle;
                        }

                        public List<AgenciesBean> getAgencies() {
                            return agencies;
                        }

                        public void setAgencies(List<AgenciesBean> agencies) {
                            this.agencies = agencies;
                        }

                        public static class VehicleBean {
                            /**
                             * icon : //maps.gstatic.com/mapfiles/transit/iw2/6/bus2.png
                             * name : Bus
                             * type : BUS
                             */

                            private String icon;
                            private String name;
                            private String type;

                            public String getIcon() {
                                return icon;
                            }

                            public void setIcon(String icon) {
                                this.icon = icon;
                            }

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public String getType() {
                                return type;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }
                        }

                        public static class AgenciesBean {
                            /**
                             * name : Xí nghiệp xe buýt cầu Bươu
                             * url : http://doanhnghiepmoi.vn/company/Xi-Nghiep-Xe-Buyt-Cau-Buou-Chi-Nhanh-Tong-Cong-Ty-Van-Tai-Ha-Noi-05d2a.html
                             */

                            private String name;
                            private String url;

                            public String getName() {
                                return name;
                            }

                            public void setName(String name) {
                                this.name = name;
                            }

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }
                        }
                    }
                }

                public static class StepsBean {
                    /**
                     * distance : {"text":"16 m","value":16}
                     * duration : {"text":"1 min","value":11}
                     * end_location : {"lat":21.0528909,"lng":105.7350075}
                     * html_instructions : Head <b>southwest</b> toward <b>Đường Cầu Diễn</b>/<b>QL32</b>
                     * polyline : {"points":"k|n_CikjdSXN"}
                     * start_location : {"lat":21.0530159,"lng":105.7350895}
                     * travel_mode : WALKING
                     * maneuver : turn-right
                     */

                    private DistanceBeanXX distance;
                    private DurationBeanXX duration;
                    private EndLocationBeanXX end_location;
                    private String html_instructions;
                    private PolylineBeanX polyline;
                    private StartLocationBeanXX start_location;
                    private String travel_mode;
                    private String maneuver;

                    public DistanceBeanXX getDistance() {
                        return distance;
                    }

                    public void setDistance(DistanceBeanXX distance) {
                        this.distance = distance;
                    }

                    public DurationBeanXX getDuration() {
                        return duration;
                    }

                    public void setDuration(DurationBeanXX duration) {
                        this.duration = duration;
                    }

                    public EndLocationBeanXX getEnd_location() {
                        return end_location;
                    }

                    public void setEnd_location(EndLocationBeanXX end_location) {
                        this.end_location = end_location;
                    }

                    public String getHtml_instructions() {
                        return html_instructions;
                    }

                    public void setHtml_instructions(String html_instructions) {
                        this.html_instructions = html_instructions;
                    }

                    public PolylineBeanX getPolyline() {
                        return polyline;
                    }

                    public void setPolyline(PolylineBeanX polyline) {
                        this.polyline = polyline;
                    }

                    public StartLocationBeanXX getStart_location() {
                        return start_location;
                    }

                    public void setStart_location(StartLocationBeanXX start_location) {
                        this.start_location = start_location;
                    }

                    public String getTravel_mode() {
                        return travel_mode;
                    }

                    public void setTravel_mode(String travel_mode) {
                        this.travel_mode = travel_mode;
                    }

                    public String getManeuver() {
                        return maneuver;
                    }

                    public void setManeuver(String maneuver) {
                        this.maneuver = maneuver;
                    }

                    public static class DistanceBeanXX {
                        /**
                         * text : 16 m
                         * value : 16
                         */

                        private String text;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class DurationBeanXX {
                        /**
                         * text : 1 min
                         * value : 11
                         */

                        private String text;
                        private int value;

                        public String getText() {
                            return text;
                        }

                        public void setText(String text) {
                            this.text = text;
                        }

                        public int getValue() {
                            return value;
                        }

                        public void setValue(int value) {
                            this.value = value;
                        }
                    }

                    public static class EndLocationBeanXX {
                        /**
                         * lat : 21.0528909
                         * lng : 105.7350075
                         */

                        private double lat;
                        private double lng;

                        public double getLat() {
                            return lat;
                        }

                        public void setLat(double lat) {
                            this.lat = lat;
                        }

                        public double getLng() {
                            return lng;
                        }

                        public void setLng(double lng) {
                            this.lng = lng;
                        }
                    }

                    public static class PolylineBeanX {
                        /**
                         * points : k|n_CikjdSXN
                         */

                        private String points;

                        public String getPoints() {
                            return points;
                        }

                        public void setPoints(String points) {
                            this.points = points;
                        }
                    }

                    public static class StartLocationBeanXX {
                        /**
                         * lat : 21.0530159
                         * lng : 105.7350895
                         */

                        private double lat;
                        private double lng;

                        public double getLat() {
                            return lat;
                        }

                        public void setLat(double lat) {
                            this.lat = lat;
                        }

                        public double getLng() {
                            return lng;
                        }

                        public void setLng(double lng) {
                            this.lng = lng;
                        }
                    }
                }
            }
        }
    }
}
