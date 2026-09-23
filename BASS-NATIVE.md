# BASS native libraries

`src/un4seen/bass/BASS.java` loads the native library named `bass`. Place the matching
BASS 2.4 JNI library in the JVM native-library path (or rename the supplied
`Bass32.dll`/`Bass64.dll` to `bass.dll`), and run the JVM with the corresponding
32-bit or 64-bit architecture. The Java player now loads MOD/XM/S3M/IT data
through `BASS_MusicLoad`; ZIP soundtracks are unpacked in memory and are not
passed to the old module decoder.
