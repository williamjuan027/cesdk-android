# `editor-core` depends upon `camera-core` as `compileOnly`.
# Without adding the below rule, consumers of `editor-core` get a `Missing classes detected while running R8.` error if they don't include the camera module.
-dontwarn ly.img.camera.core.**