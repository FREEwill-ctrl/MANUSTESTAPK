# Panduan Kontribusi

Terima kasih atas minat Anda untuk berkontribusi pada Notes Todo App! Kami sangat menghargai kontribusi dari komunitas.

## Cara Berkontribusi

### 1. Fork Repository
- Klik tombol "Fork" di halaman GitHub repository
- Clone fork Anda ke komputer lokal:
```bash
git clone https://github.com/username-anda/notes_todo_app.git
cd notes_todo_app
```

### 2. Buat Branch Baru
```bash
git checkout -b feature/nama-fitur-anda
```

### 3. Lakukan Perubahan
- Pastikan kode mengikuti konvensi yang ada
- Tambahkan test jika diperlukan
- Update dokumentasi jika diperlukan

### 4. Test Perubahan
```bash
./gradlew test
./gradlew lintDebug
```

### 5. Commit dan Push
```bash
git add .
git commit -m "feat: deskripsi singkat perubahan"
git push origin feature/nama-fitur-anda
```

### 6. Buat Pull Request
- Buka GitHub dan buat Pull Request
- Berikan deskripsi yang jelas tentang perubahan
- Tunggu review dari maintainer

## Konvensi Kode

### Kotlin Style Guide
- Ikuti [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Gunakan 4 spasi untuk indentasi
- Maksimal 120 karakter per baris

### Commit Message
Gunakan format conventional commits:
- `feat:` untuk fitur baru
- `fix:` untuk perbaikan bug
- `docs:` untuk perubahan dokumentasi
- `style:` untuk perubahan formatting
- `refactor:` untuk refactoring kode
- `test:` untuk menambah atau memperbaiki test

### Struktur File
- Letakkan file sesuai dengan package yang tepat
- Gunakan nama file yang deskriptif
- Pisahkan UI components, data models, dan business logic

## Jenis Kontribusi yang Diterima

### Bug Reports
- Gunakan template issue yang tersedia
- Sertakan langkah reproduksi yang jelas
- Sertakan informasi environment (Android version, device, dll)

### Feature Requests
- Jelaskan use case yang ingin dipecahkan
- Berikan mockup atau deskripsi UI jika relevan
- Diskusikan implementasi di issue sebelum mulai coding

### Code Contributions
- Perbaikan bug
- Fitur baru
- Peningkatan performa
- Refactoring kode
- Penambahan test

### Documentation
- Perbaikan README
- Penambahan komentar kode
- Tutorial atau guide
- API documentation

## Review Process

1. **Automated Checks**: CI/CD akan menjalankan test dan lint
2. **Code Review**: Maintainer akan review kode Anda
3. **Discussion**: Mungkin ada diskusi untuk perbaikan
4. **Approval**: Setelah semua check passed, PR akan di-merge

## Development Setup

### Prerequisites
- Android Studio Arctic Fox atau lebih baru
- JDK 17
- Android SDK 24+

### Setup
1. Clone repository
2. Buka di Android Studio
3. Sync project dengan Gradle
4. Jalankan test untuk memastikan setup benar

### Running Tests
```bash
# Unit tests
./gradlew test

# Instrumented tests
./gradlew connectedAndroidTest

# Lint check
./gradlew lintDebug
```

## Code of Conduct

- Bersikap hormat dan profesional
- Terima kritik konstruktif dengan baik
- Fokus pada apa yang terbaik untuk komunitas
- Hindari bahasa yang menyinggung atau diskriminatif

## Pertanyaan?

Jika Anda memiliki pertanyaan tentang kontribusi, silakan:
- Buat issue dengan label "question"
- Hubungi maintainer melalui email
- Diskusi di forum komunitas

Terima kasih atas kontribusi Anda! 🎉

