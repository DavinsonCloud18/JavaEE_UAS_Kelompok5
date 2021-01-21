<?php include('functions.php') ?>
<!DOCTYPE html>
<html>
<head>
	<title>Registration system PHP and MySQL - Create user</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<style>
		.header {
			background: #003366;
		}
		button[name=register_btn] {
			background: #003366;
		}
	</style>
</head>
<body>
	<div class="header">
		<h2> Create Account</h2>
	</div>
	
	<form method="post" action="create_user.php">

		<?php echo display_error(); ?>

		<div class="input-group">
			<label>Nama Lengkap</label>
			<input type="text" name="nama_lengkap" value="<?php echo $nama_lengkap; ?>">
		</div>
		<div class="input-group">
			<label>Email</label>
			<input type="email" name="email" value="<?php echo $email; ?>">
		</div>
		
		<div class="input-group">
			<label>Password</label>
			<input type="password" name="password_1">
		</div>
		<div class="input-group">
			<label>Confirm password</label>
			<input type="password" name="password_2">
		</div>
		<div class="input-group">
			<label>Role</label>
			<select name="role" id="role" >
				<option value=""></option>
				<option value="user">User</option>
			</select>
		</div>
		<div class="input-group">
			<label>No Ktp</label>
			<input type="text" name="no_ktp" value="<?php echo $noktp; ?>">
		</div>
		<div class="input-group">
			<label>No Hp</label>
			<input type="text" name="no_hp" value="<?php echo $nohp; ?>">
		</div>
		<div class="input-group">
			<label>Saldo</label>
			<input type="text" name="saldo" value="<?php echo $saldo; ?>">
		</div>
		<div class="input-group">
			<button type="submit" class="btn" name="register_btn"> + Create Account</button>
		</div>
	</form>
</body>
</html>