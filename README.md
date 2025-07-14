# Notes Todo App

Aplikasi Android offline untuk mengelola catatan (Notes) dan daftar tugas (Todo List) yang dibangun dengan Kotlin dan Jetpack Compose.

## Fitur Utama

### 📝 Notes (Catatan)
- Membuat catatan baru dengan judul dan konten
- Mengedit catatan yang sudah ada
- Menghapus catatan
- Melihat daftar semua catatan dengan timestamp terakhir dimodifikasi
- Penyimpanan offline menggunakan Room Database

### ✅ Todo List (Daftar Tugas)
- Menambah tugas baru dengan judul dan deskripsi
- Menandai tugas sebagai selesai/belum selesai
- Menghapus tugas
- Melihat daftar semua tugas dengan status penyelesaian
- Penyimpanan offline menggunakan Room Database

## Teknologi yang Digunakan

- **Kotlin** - Bahasa pemrograman utama
- **Jetpack Compose** - UI toolkit modern untuk Android
- **Room Database** - Penyimpanan data lokal
- **ViewModel & LiveData** - Arsitektur MVVM
- **Coroutines** - Pemrograman asinkron
- **Material Design 3** - Desain UI yang konsisten

## Arsitektur Aplikasi

Aplikasi ini menggunakan arsitektur MVVM (Model-View-ViewModel) dengan komponen-komponen berikut:

### Model Layer
- `TodoItem.kt` - Data class untuk item todo
- `Note.kt` - Data class untuk catatan
- `AppDao.kt` - Data Access Object untuk operasi database
- `AppDatabase.kt` - Konfigurasi Room Database

### View Layer (UI)
- `MainScreen.kt` - Layar utama dengan navigasi tab
- `TodoListScreen.kt` - Layar daftar todo
- `NotesListScreen.kt` - Layar daftar catatan
- `Theme.kt`, `Color.kt`, `Type.kt` - Konfigurasi tema aplikasi

### ViewModel Layer
- `AppViewModel.kt` - ViewModel untuk mengelola data dan logika bisnis
- `AppViewModelFactory.kt` - Factory untuk membuat instance ViewModel

## Struktur Proyek

```
notes_todo_app/
├── app/
│   ├── build.gradle.kts
│   └── src/
│       ├── main/
│       │   ├── java/com/example/notes_todo_app/
│       │   │   ├── data/
│       │   │   │   ├── TodoItem.kt
│       │   │   │   ├── Note.kt
│       │   │   │   ├── AppDao.kt
│       │   │   │   └── AppDatabase.kt
│       │   │   ├── ui/
│       │   │   │   ├── MainScreen.kt
│       │   │   │   ├── TodoListScreen.kt
│       │   │   │   ├── NotesListScreen.kt
│       │   │   │   └── theme/
│       │   │   │       ├── Theme.kt
│       │   │   │       ├── Color.kt
│       │   │   │       └── Type.kt
│       │   │   ├── viewmodel/
│       │   │   │   └── AppViewModel.kt
│       │   │   └── MainActivity.kt
│       │   ├── AndroidManifest.xml
│       │   └── res/
│       ├── test/
│       └── androidTest/
├── build.gradle.kts
├── gradle.properties
└── settings.gradle.kts
```

## Persyaratan Sistem

- Android Studio Arctic Fox atau lebih baru
- Android SDK 24 (Android 7.0) atau lebih tinggi
- Kotlin 1.9.0 atau lebih baru
- Gradle 8.1.2 atau lebih baru

## Cara Menjalankan Aplikasi

### 1. Clone Repository
```bash
git clone <repository-url>
cd notes_todo_app
```

### 2. Buka di Android Studio
- Buka Android Studio
- Pilih "Open an existing Android Studio project"
- Navigasi ke folder `notes_todo_app` dan pilih

### 3. Sync Project
- Android Studio akan otomatis melakukan sync Gradle
- Tunggu hingga proses sync selesai

### 4. Jalankan Aplikasi
- Hubungkan perangkat Android atau jalankan emulator
- Klik tombol "Run" (▶️) di Android Studio
- Pilih perangkat target dan tunggu aplikasi ter-install

## Cara Build APK

### Debug APK
```bash
./gradlew assembleDebug
```

### Release APK
```bash
./gradlew assembleRelease
```

APK yang dihasilkan akan berada di `app/build/outputs/apk/`

## Testing

### Unit Tests
```bash
./gradlew test
```

### Instrumented Tests
```bash
./gradlew connectedAndroidTest
```

## Kontribusi

1. Fork repository ini
2. Buat branch fitur baru (`git checkout -b feature/AmazingFeature`)
3. Commit perubahan (`git commit -m 'Add some AmazingFeature'`)
4. Push ke branch (`git push origin feature/AmazingFeature`)
5. Buat Pull Request

## Lisensi

Proyek ini dilisensikan di bawah MIT License - lihat file [LICENSE](LICENSE) untuk detail.

## Pengembang

Dibuat dengan ❤️ menggunakan Kotlin dan Jetpack Compose

## Roadmap

- [ ] Fitur pencarian untuk notes dan todos
- [ ] Kategori/tag untuk organisasi yang lebih baik
- [ ] Pengingat/notifikasi untuk todos
- [ ] Export/import data
- [ ] Dark mode toggle
- [ ] Widget untuk home screen
- [ ] Sinkronisasi cloud (opsional)

## Screenshot

*Screenshot akan ditambahkan setelah aplikasi selesai dibangun*

## FAQ

**Q: Apakah data tersimpan secara offline?**
A: Ya, semua data disimpan secara lokal menggunakan Room Database dan tidak memerlukan koneksi internet.

**Q: Apakah aplikasi mendukung dark mode?**
A: Ya, aplikasi mengikuti pengaturan sistem untuk dark/light mode.

**Q: Bagaimana cara backup data?**
A: Saat ini belum ada fitur backup built-in, namun data tersimpan di internal storage aplikasi.

