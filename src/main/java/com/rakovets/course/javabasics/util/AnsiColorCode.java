package com.rakovets.course.javabasics.util;

public enum AnsiColorCode {
    RESET("\033[0m"),

    FG_BLACK("\033[0;30m"),
    FG_RED("\033[0;31m"),
    FG_GREEN("\033[0;32m"),
    FG_YELLOW("\033[0;33m"),
    FG_BLUE("\033[0;34m"),
    FG_MAGENTA("\033[0;35m"),
    FG_CYAN("\033[0;36m"),
    FG_WHITE("\033[0;37m"),

    FG_BLACK_BOLD("\033[1;30m"),
    FG_RED_BOLD("\033[1;31m"),
    FG_GREEN_BOLD("\033[1;32m"),
    FG_YELLOW_BOLD("\033[1;33m"),
    FG_BLUE_BOLD("\033[1;34m"),
    FG_MAGENTA_BOLD("\033[1;35m"),
    FG_CYAN_BOLD("\033[1;36m"),
    FG_WHITE_BOLD("\033[1;37m"),

    FG_BLACK_UNDERLINED("\033[4;30m"),
    FG_RED_UNDERLINED("\033[4;31m"),
    FG_GREEN_UNDERLINED("\033[4;32m"),
    FG_YELLOW_UNDERLINED("\033[4;33m"),
    FG_BLUE_UNDERLINED("\033[4;34m"),
    FG_MAGENTA_UNDERLINED("\033[4;35m"),
    FG_CYAN_UNDERLINED("\033[4;36m"),
    FG_WHITE_UNDERLINED("\033[4;37m"),

    FG_BLACK_BRIGHT("\033[0;90m"),
    FG_RED_BRIGHT("\033[0;91m"),
    FG_GREEN_BRIGHT("\033[0;92m"),
    FG_YELLOW_BRIGHT("\033[0;93m"),
    FG_BLUE_BRIGHT("\033[0;94m"),
    FG_MAGENTA_BRIGHT("\033[0;95m"),
    FG_CYAN_BRIGHT("\033[0;96m"),
    FG_WHITE_BRIGHT("\033[0;97m"),

    FG_BLACK_BOLD_BRIGHT("\033[1;90m"),
    FG_RED_BOLD_BRIGHT("\033[1;91m"),
    FG_GREEN_BOLD_BRIGHT("\033[1;92m"),
    FG_YELLOW_BOLD_BRIGHT("\033[1;93m"),
    FG_BLUE_BOLD_BRIGHT("\033[1;94m"),
    FG_MAGENTA_BOLD_BRIGHT("\033[1;95m"),
    FG_CYAN_BOLD_BRIGHT("\033[1;96m"),
    FG_WHITE_BOLD_BRIGHT("\033[1;97m"),

    BG_BLACK("\033[40m"),
    BG_RED("\033[41m"),
    BG_GREEN("\033[42m"),
    BG_YELLOW("\033[43m"),
    BG_BLUE("\033[44m"),
    BG_MAGENTA("\033[45m"),
    BG_CYAN("\033[46m"),
    BG_WHITE("\033[47m"),

    BG_BLACK_BRIGHT("\033[0;100m"),
    BG_RED_BRIGHT("\033[0;101m"),
    BG_GREEN_BRIGHT("\033[0;102m"),
    BG_YELLOW_BRIGHT("\033[0;103m"),
    BG_BLUE_BRIGHT("\033[0;104m"),
    BG_MAGENTA_BRIGHT("\033[0;105m"),
    BG_CYAN_BRIGHT("\033[0;106m"),
    BG_WHITE_BRIGHT("\033[0;107m");

    private final String code;

    AnsiColorCode(String code) {
        this.code = code;
    }

    public static AnsiColorCode getRandom() {
        AnsiColorCode randomColor = values()[(int) (Math.random() * values().length)];
        if (randomColor.name().contains("BLACK") || randomColor.name().contains("WHITE")) {
            randomColor = getRandom();
        }
        return randomColor;
    }

    @Override
    public String toString() {
        return code;
    }
}
