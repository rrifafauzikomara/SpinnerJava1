<?php 
	include_once "koneksi.php";

	class usr{}

	$nama = $_POST["nama"];
	$lng = $_POST["lng"];
	$lat = $_POST["lat"];
	$idk = $_POST["kendaraan"];
	$query = mysqli_query($con, "INSERT INTO tb_spiner (id, nama, lng, lat, kendaraan) VALUES(0, '".$nama."', '".$lng."', '".$lat."', '".$idk."')");
	if ($query){
		 	$response = new usr();
		 	$response->success = 1;
		 	$response->message = "Tambah Lokasi berhasil";
		 	die(json_encode($response));

		 } else {
		 	$response = new usr();
		 	$response->success = 0;
		 	$response->message = "Tambah Lokasi gagal";
		 	die(json_encode($response));
		 } 
		
		mysqli_close($con);
 ?>