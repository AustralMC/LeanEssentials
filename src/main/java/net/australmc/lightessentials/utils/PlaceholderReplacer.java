package net.australmc.lightessentials.utils;

import org.apache.commons.lang.text.StrSubstitutor;

import java.util.Map;

public class PlaceholderReplacer {
    private static final String PLACEHOLDER_PREFIX = "{";
    private static final String PLACEHOLDER_SUFFIX = "}";

    public static String replace(final String template, final Map<String, String> placeholders) {
        return StrSubstitutor.replace(template, placeholders, PLACEHOLDER_PREFIX, PLACEHOLDER_SUFFIX);
    }
}
