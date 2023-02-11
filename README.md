# Javalin .mjs MIME type

This project reproduces an issue I've discovered with Javalin
returning no `Content-Type` header for .mjs files.

## Instructions

* `mvn exec:java`
* `curl -I -X GET http://localhost:7070/test.js`
  * Observe header: `Content-Type: application/javascript`
* `curl -I -X GET http://localhost:7070/test.mjs`
  * Observe no `Content-Type` header

Expected behaviour: `.mjs` should have `Content-Type: application/javascript` header