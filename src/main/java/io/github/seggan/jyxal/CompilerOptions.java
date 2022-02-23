package io.github.seggan.jyxal;

import java.util.EnumSet;
import java.util.Set;

public enum CompilerOptions {

    VYXAL_CODEPAGE('v'),
    PRINT_DEBUG_TREE('d'),
    DONT_OPTIMISE('o');
    ;

    public static Set<CompilerOptions> OPTIONS = EnumSet.noneOf(CompilerOptions.class);

    char c;

    CompilerOptions(char c) {
        this.c = c;
    }

    public static void fromString(String s) {
        for (char c : s.toCharArray()) {
            for (CompilerOptions option : CompilerOptions.values()) {
                if (option.c == c) {
                    OPTIONS.add(option);
                }
            }
        }
    }
}
