# Panduan Push ke GitHub

Ikuti langkah-langkah berikut untuk meng-upload proyek Notes Todo App ke GitHub repository Anda:

## Langkah 1: Persiapan Repository GitHub

1. **Buat Repository Baru di GitHub:**
   - Login ke GitHub.com
   - Klik tombol "New" atau "+" untuk membuat repository baru
   - Nama repository: `notes-todo-app` (atau sesuai keinginan)
   - Deskripsi: "Aplikasi Android offline untuk Notes dan Todo List dengan Kotlin & Jetpack Compose"
   - Pilih "Public" atau "Private" sesuai kebutuhan
   - **JANGAN** centang "Add a README file" (karena kita sudah punya)
   - Klik "Create repository"

## Langkah 2: Inisialisasi Git di Proyek Lokal

Buka terminal/command prompt di folder `notes_todo_app` dan jalankan:

```bash
# Inisialisasi git repository
git init

# Tambahkan semua file ke staging area
git add .

# Buat commit pertama
git commit -m "Initial commit: Notes Todo App with Kotlin & Jetpack Compose"

# Tambahkan remote origin (ganti dengan URL repository Anda)
git remote add origin https://github.com/username-anda/notes-todo-app.git

# Rename branch default ke main (jika perlu)
git branch -M main

# Push ke GitHub
git push -u origin main
```

## Langkah 3: Verifikasi Upload

1. Refresh halaman repository GitHub Anda
2. Pastikan semua file sudah ter-upload
3. Cek apakah README.md tampil dengan baik
4. Verifikasi GitHub Actions workflow sudah aktif di tab "Actions"

## Langkah 4: Setup GitHub Actions (Otomatis)

GitHub Actions workflow sudah dikonfigurasi dan akan otomatis:
- Menjalankan test setiap ada push/pull request
- Build APK debug dan release
- Upload APK sebagai artifacts

Workflow akan berjalan otomatis setelah push pertama.

## Langkah 5: Clone untuk Development

Untuk development selanjutnya, clone repository:

```bash
git clone https://github.com/username-anda/notes-todo-app.git
cd notes-todo-app
```

## Tips Tambahan

### Untuk Update Selanjutnya:
```bash
git add .
git commit -m "feat: deskripsi perubahan"
git push origin main
```

### Untuk Membuat Branch Fitur Baru:
```bash
git checkout -b feature/nama-fitur
# ... lakukan perubahan ...
git add .
git commit -m "feat: tambah fitur baru"
git push origin feature/nama-fitur
# Buat Pull Request di GitHub
```

### Untuk Sinkronisasi dengan Remote:
```bash
git pull origin main
```

## Troubleshooting

### Error: "remote origin already exists"
```bash
git remote remove origin
git remote add origin https://github.com/username-anda/notes-todo-app.git
```

### Error: "failed to push some refs"
```bash
git pull origin main --allow-unrelated-histories
git push origin main
```

### Error: Authentication
- Gunakan Personal Access Token (PAT) sebagai password
- Atau setup SSH key untuk authentication

## Struktur Repository yang Ter-upload

```
notes-todo-app/
├── .github/
│   └── workflows/
│       └── android.yml          # GitHub Actions workflow
├── app/
│   ├── build.gradle.kts         # App-level build configuration
│   └── src/
│       ├── main/
│       │   ├── java/            # Source code Kotlin
│       │   ├── res/             # Resources (layouts, strings, etc.)
│       │   └── AndroidManifest.xml
│       ├── test/                # Unit tests
│       └── androidTest/         # Instrumented tests
├── .gitignore                   # Git ignore rules
├── build.gradle.kts             # Project-level build configuration
├── gradle.properties           # Gradle properties
├── settings.gradle.kts          # Gradle settings
├── README.md                    # Dokumentasi utama
├── LICENSE                      # MIT License
├── CONTRIBUTING.md              # Panduan kontribusi
└── PUSH_TO_GITHUB.md           # Panduan ini
```

## Selamat! 🎉

Proyek Notes Todo App Anda sekarang sudah tersedia di GitHub dengan:
- ✅ Source code lengkap
- ✅ Dokumentasi komprehensif
- ✅ GitHub Actions untuk CI/CD
- ✅ Struktur proyek yang rapi
- ✅ Lisensi MIT

Anda bisa mulai development, menerima kontribusi, atau men-deploy aplikasi sesuai kebutuhan!

