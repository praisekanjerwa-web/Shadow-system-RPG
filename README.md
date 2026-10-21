# Shadow System RPG — Android project

This project packages the included standalone HTML hunter RPG inside a simple Android WebView app. The app uses no external JavaScript libraries or downloaded game assets.

## Build an APK using GitHub Actions (phone-friendly)

1. Download and unzip `Shadow_System_Android_Project.zip`.
2. Create a new GitHub repository.
3. Upload the **contents** of this folder to the repository root, keeping the `.github/workflows/build-apk.yml` path.
4. Open the repository's **Actions** tab and choose **Build Shadow System APK**.
5. Tap **Run workflow** if it has not started automatically, then open the completed run.
6. In **Artifacts**, download `Shadow-System-debug-APK` and unzip it to get `app-debug.apk`.
7. Open the APK on your Android phone to install it. Android may ask you to allow installation from the app used to open the download; only install builds you created or trust.

The first build can take a few minutes because GitHub downloads the Android build tools and dependencies.

## Included gameplay

- Turn-based dungeon combat, enemy counterattacks, a special attack and guarding.
- Coins and XP from victories, level-ups and hunter ranks.
- Five unlockable dungeons, stronger enemies and boss rooms.
- A shop with weapons, armor, two potion types, shadow soldiers and a coin bonus charm.
- Inventory, equipment, permanent shadow companions, daily challenges and achievements.
- Local save support plus save export/import controls in the game's System menu.

## Notes

- This project builds a **debug APK** for testing. A public app-store release needs a separate signed release build.
- Shadow System is an original hunter-fantasy game inspired by dungeon-progression anime. It is unofficial and does not include official anime images or copied character art.
