package com.common.util;

public class Test {
	public static void main(String[] args) {
        /**
         * 北京市：经度：116.40   纬度：39.90
         * 上海市：经度：121.47   纬度：31.23
         */
		String lon1 = "116.40";
        String lat1 = "39.90";
        String lon2 = "121.47";
        String lat2 = "31.23";
        String distance = calculateDistanceByPoint(lon1, lat1, lon2, lat2);
        System.out.println("两点之间的距离：" + distance);
	}

	/**
	 * calculate distance by longitude and latitude
	 * @param lon1 经度1
	 * @param lat1 纬度1
	 * @param lon2 经度2
	 * @param lat2 纬度2
	 * @return
	 */
	private static String calculateDistanceByPoint(String lonStr1, String latStr1, String lonStr2, String latStr2){
		String result = null;
		double lon1 = (Math.PI / 180) * Double.parseDouble(lonStr1);
		double lat1 = (Math.PI / 180) * Double.parseDouble(latStr1);
		double lon2 = (Math.PI / 180) * Double.parseDouble(lonStr2);
		double lat2 = (Math.PI / 180) * Double.parseDouble(latStr2);
		// 地球半径，单位：千米
		double R = 6371;

		double distanceAdress =
				Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon2 - lon1)) * R;

		return  String.valueOf(distanceAdress);

	}
}
