#!/usr/bin/env pwsh
$jarPath = "C:\Users\Admin\OneDrive\Desktop\bkwcw-spring_labs\library\target\library-0.0.1-SNAPSHOT.jar"
Write-Host "Starting Spring Boot server..." -ForegroundColor Green
Write-Host "JAR path: $jarPath" -ForegroundColor Cyan
java -jar $jarPath
