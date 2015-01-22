/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.gameeaterpl.character.Spells;

import java.io.FileInputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author sakurazuka
 */
public class SpellXmlParser extends DefaultHandler {

    /**
     * Zwraca listę zaklęć podanej klasy i danego poziomu.
     *
     * @param pmClass
     * @param lvLevel
     * @return
     */
    public static ArrayList<Spell> getSpellListByClassAndLevel(String pmClass, Integer lvLevel) {
        ArrayList<Spell> lvSpellList = new ArrayList<>();

        //parser xml
        DocumentBuilderFactory builderFactory
                = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = builderFactory.newDocumentBuilder();
            Document lvDocument = builder.parse(new FileInputStream(System.getProperty("user.dir") + "/res/spells.xml"));
            lvDocument.normalize();
            //NodeList lvDocumentList = lvDocument.getElementsByTagName("Spell");

            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile("/Spell_List/Spell[Level[@Class='" + pmClass + "' and @Value='" + lvLevel + "']]");

            NodeList nl = (NodeList) expr.evaluate(lvDocument, XPathConstants.NODESET);

            for (int i = 0; i < nl.getLength(); i++) {
                Element lvSpell = (Element) nl.item(i);
                //System.out.print(((Element)lvSpell.getElementsByTagName("Name").item(0)).getTextContent());
                lvSpellList.add(new Spell(lvSpell));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lvSpellList;
    }

    public static Spell getSpellListBySpellName(String pmSpellName) {
        Spell lvSpell = null;

        //parser xml
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = builderFactory.newDocumentBuilder();
            Document lvDocument = builder.parse(new FileInputStream(System.getProperty("user.dir") + "/res/spells.xml"));
            lvDocument.normalize();

            XPathFactory xPathfactory = XPathFactory.newInstance();
            XPath xpath = xPathfactory.newXPath();
            XPathExpression expr = xpath.compile("/Spell_List/Spell[Name[text()='"+pmSpellName+"']]");

            NodeList nl = (NodeList) expr.evaluate(lvDocument, XPathConstants.NODESET);
            if(nl.getLength() > 0)
            lvSpell = new Spell((Element) nl.item(0));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lvSpell;
    }

}
