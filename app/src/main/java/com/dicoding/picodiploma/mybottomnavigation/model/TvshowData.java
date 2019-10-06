package com.dicoding.picodiploma.mybottomnavigation.model;

import java.util.ArrayList;

public class TvshowData {

    public static String[][] dataTv = new String[][]{
            {"The Simpsons","Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/yTZQkSsxUFJZJe67IenRM0AEklc.jpg"},
            {"Family Guy","Sick, twisted, politically incorrect and Freakin Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/gBGUL1UTUNmdRQT8gA1LUV4yg39.jpg"},
            {"Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/mo0FP1GxOFZT4UDde7RFDz5APXF.jpg"},
            {"Fear the Walking Dead","What did the world look like as it was transforming into the horrifying apocalypse depicted in \"The Walking Dead\"? This spin-off set in Los Angeles, following new characters as they face the beginning of the end of the world, will answer that question.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/lZMb3R3e5vqukPbeDMeyYGf2ZNG.jpg"},
            {"The Flash","After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/wHa6KOJAoNTFLFtp7wguUJKSnju.jpg"},
            {"Marvel's Agents of S.H.I.E.L.D.","Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/cXiETfFK1BTLest5fhTLfDLRdL6.jpg"},
            {"Naruto Shippūden","Naruto Shippuuden is the continuation of the original animated TV series Naruto.The story revolves around an older and slightly more matured Uzumaki Naruto and his quest to save his friend Uchiha Sasuke from the grips of the snake-like Shinobi, Orochimaru. After 2 and a half years Naruto finally returns to his village of Konoha, and sets about putting his ambitions to work, though it will not be easy, as He has amassed a few (more dangerous) enemies, in the likes of the shinobi organization; Akatsuki.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/zAYRe2bJxpWTVrwwmBc00VFkAf4.jpg"},
            {"American Horror Story","An anthology horror drama series centering on different characters and locations, including a house with a murderous past, an asylum, a witch coven, a freak show, a hotel, a farmhouse in Roanoke and a cult.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/uR2K0Ui9UsOqnzb5IrV6tLUcUHl.jpg"},
            {"Dragon Ball Z","Five years have passed since the fight with Piccolo Jr. and Goku now has a son, Gohan. The peace is interrupted when an alien named Raditz arrives on Earth in a spacecraft and tracks down Goku, revealing to him that that they are members of a near-extinct warrior race called the Saiyans.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/lCvOCn1Hq0ugBL6T8SyMoaCWNOc.jpg"},
            {"One-Punch Man","Saitama is a hero who only became a hero for fun. After three years of “special” training, though, he’s become so strong that he’s practically invincible. In fact, he’s too strong—even his mightiest opponents are taken out with a single punch, and it turns out that being devastatingly powerful is actually kind of a bore. With his passion for being a hero lost along with his hair, yet still faced with new enemies every day, how much longer can he keep it going?","https://image.tmdb.org/t/p/w600_and_h900_bestv2/iE3s0lG5QVdEHOEZnoAxjmMtvne.jpg"},

    };

    public static ArrayList<TvShow> getList(){
        ArrayList<TvShow> list = new ArrayList<>();
        for (String [] mData: dataTv){
            TvShow tvShow = new TvShow();
            tvShow.setJudul(mData[0]);
            tvShow.setDeskripsiTv(mData[1]);
            tvShow.setPhoto(mData[2]);

            list.add(tvShow);
        }

        return list;
    }
}
