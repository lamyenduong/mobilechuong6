package com.example.mobilechuong6;

import android.content.Context;
import android.content.res.Resources;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(Context context) {
        ArrayList<Photo> photos = new ArrayList<>();
        try {
            File file = new File("photodata.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            NodeList photoNodes = doc.getElementsByTagName("photos");

            for (int i = 0; i < photoNodes.getLength(); i++) {
                Node photoNode = photoNodes.item(i);
                int id = Integer.parseInt(photoNode.getAttributes().getNamedItem("id").getTextContent());
                String url = photoNode.getAttributes().getNamedItem("url").getTextContent();
                String title = photoNode.getAttributes().getNamedItem("title").getTextContent();
                String description = photoNode.getAttributes().getNamedItem("caption").getTextContent();
                photos.add(new Photo(id, url, title, description));
            }
        } catch (IOException | ParserConfigurationException e) {
            return null;
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
        return photos;
    }

    public static Photo getPhotoFromId(int id, Context context) {
        ArrayList<Photo> phs = generatePhotoData(context);
        for (int i = 0; i < phs.size(); i++) {
            if (phs.get(i).getId() == id) {
                return phs.get(i);
            }
        }
        return null;
    }
}


