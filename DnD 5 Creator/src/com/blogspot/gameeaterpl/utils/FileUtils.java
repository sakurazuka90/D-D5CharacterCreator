/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Sakurazuka
 */
public final class FileUtils {

    public static final String DESCRIPTION_URL = "com/blogspot/gameeaterpl/ui/resources/descriptions/";
    
    /**
     * Czyta plik do Stringa. Wymaga Javy 7
     * @param path
     * @param encoding
     * @return
     * @throws IOException
     * @throws URISyntaxException 
     */
    public static String readFile(URL path, Charset encoding) throws IOException, URISyntaxException {
        byte[] encoded = Files.readAllBytes(Paths.get(path.toURI()));
        return new String(encoded, encoding);
    }
}
