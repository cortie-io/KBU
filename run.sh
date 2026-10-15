#!/usr/bin/env bash
# 사용법: ./run.sh week07/report04-2   (폴더 안 src/Main.java 를 바로 실행)
dir="${1:-.}"
[ -f "$dir/src/Main.java" ] && cd "$dir/src" || cd "$dir"
exec java Main.java
