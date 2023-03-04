package com.example.mobilechuong6;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData() {
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0, "https://images.unsplash.com/photo-1595535373192-fc8935bacd89?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8cGVyZnVtZXxlbnwwfHwwfHw%3D&w=1000&q=80", "Product 1", "Ancient texts and archaeological excavations show the use of perfumes in some of the earliest human civilizations. Modern perfumery began in the late 19th century with the commercial synthesis of aroma compounds such as vanillin or coumarin, which allowed for the composition of perfumes with smells previously unattainable solely from natural aromatics."));
        photos.add(new Photo(1, "https://images.unsplash.com/photo-1557827983-012eb6ea8dc1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fHBlcmZ1bWVzfGVufDB8fDB8fA%3D%3D&w=1000&q=80", "Product 2", "Perfume types reflect the concentration of aromatic compounds in a solvent, which in fine fragrance is typically ethanol or a mix of water and ethanol. Various sources differ considerably in the definitions of perfume types. The intensity and longevity of a perfume is based on the concentration, intensity, and longevity of the aromatic compounds, or perfume oils, used. As the percentage of aromatic compounds increases, so does the intensity and longevity of the scent. "));
        photos.add(new Photo(2, "https://images.unsplash.com/photo-1615108395437-df128ad79e80?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8cGVyZnVtZXN8ZW58MHx8MHx8&w=1000&q=80", "Product 3", "There is much confusion over the term \"cologne\", which has three meanings. The first and oldest definition refers to a family of fresh, citrus-based fragrances distilled using extracts from citrus, floral, and woody ingredients."));
        photos.add(new Photo(3, "https://media.istockphoto.com/id/1302870417/photo/glass-bottle-of-fragrant-eau-de-toilette-against-a-background-of-pink-peonies-female-perfume.jpg?b=1&s=170667a&w=0&k=20&c=MvbxFwRBbwbu80_4zzjuCnNTyOmZUSapBfe9SOx7JS0=", "Product 4", "Finally, the term \"cologne\" has entered the English language as a generic, overarching term to denote a fragrance typically worn by a man as opposed to a woman, regardless of its concentration. The actual product worn by a man may technically be an eau de toilette, but he may still say that he \"wears cologne\"."));
        photos.add(new Photo(4, "https://images.unsplash.com/photo-1595425959632-34f2822322ce?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTR8fHBlcmZ1bWV8ZW58MHx8MHx8&w=1000&q=80", "Product 5", "Classical colognes first appeared in Europe in the 17th century. The first fragrance labeled a \"parfum\" extract with a high concentration of aromatic compounds was Guerlain's Jicky in 1889. Eau de toilette appeared alongside parfum around the turn of the century."));

        return photos;
    }

    public static Photo getPhotoFromId(int id) {
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i < phs.size(); i++) {
            if (phs.get(i).getId() == id) {
                return phs.get(i);
            }

        }
        return null;
    }
}
