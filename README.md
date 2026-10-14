
# Local Book Reader

A pure on-device Android book reader for local PDF libraries, built with Kotlin, Jetpack Compose, Room, WorkManager, and Android Text-to-Speech.

## Features
- Import local text PDFs from device storage
- Display a book library view
- Background indexing and searchable local text storage
- Full-text search across imported books
- Clickable search results that open the matching page
- Text-to-speech for current page or selected text
- Built for large books and local-only use

## Tech stack
- Kotlin + Jetpack Compose
- Room + SQLite FTS
- WorkManager for background indexing
- Android PDFBox for parsing locally
- Android TTS

## Notes
This project is intentionally designed as a local-first Android app that works without a remote server. The indexing workflow is structured for large PDFs and can be expanded later with richer page-level text extraction, highlight overlays, and PDF page navigation.

## Local setup
1. Install Android Studio Ladybug or later.
2. Open the project in Android Studio.
3. Let Gradle sync downloads complete.
4. Run the `app` configuration on an emulator or physical device.

## Minimum requirements
- Android SDK 34
- minSdk: 23
- Java 17

## License
This project is licensed under the GNU Affero General Public License v3.0 (AGPL-3.0).
