# Bank Account - Unit Testing dan GitHub Actions

Project latihan Java 17, Maven, JUnit 5, dan JaCoCo.

## Fitur
- `deposit(double amount)` menambah saldo; amount negatif ditolak.
- `withdraw(double amount)` mengurangi saldo; amount negatif atau melebihi saldo ditolak.
- `getBalance()` mengembalikan saldo saat ini.
- Unit test mencakup saldo awal, deposit, withdraw, validasi input, dan saldo terbaru.

## Menjalankan test
Pastikan Java 17 dan Maven sudah terpasang, lalu jalankan:
```bash
mvn test
mvn jacoco:report
```
Laporan coverage tersedia di `target/site/jacoco/index.html`.

## GitHub Actions
Workflow berada di `.github/workflows/java-unit-test.yml`. Workflow berjalan pada push ke `main`/`develop` dan pull request ke `main`. Artifact laporan coverage bernama `jacoco-report`.

## Upload ke GitHub
Buat repository GitHub bernama `latihan-git-[NIM]` atau nama yang ditentukan dosen. Di folder project, jalankan:
```bash
git init
git add .
git commit -m "feat: add BankAccount unit tests and CI"
git branch -M main
git remote add origin https://github.com/USERNAME/NAMA-REPO.git
git push -u origin main
```
Ganti `USERNAME` dan `NAMA-REPO` sesuai repository milik sendiri. Setelah push, buka tab **Actions** untuk melihat workflow. Jangan menuliskan link repository atau screenshot sukses sebelum workflow benar-benar dijalankan.
