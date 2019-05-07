package erhanhepyasar.ismek.cocukhikayeleri;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvStoryName, tvStoryText, tvAndersen, tvEzop, tvLaFontaine, tvDedeKorkut, tvKeloglan;
    ImageView ivStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStoryName = findViewById(R.id.tvStoryName);
        tvStoryText = findViewById(R.id.tvStoryText);

        tvAndersen = findViewById(R.id.tvAndersen);
        tvEzop = findViewById(R.id.tvEzop);
        tvLaFontaine = findViewById(R.id.tvLafontaine);
        tvDedeKorkut = findViewById(R.id.tvDedeKorkut);
        tvKeloglan = findViewById(R.id.tvKeloglan);

        ivStory = findViewById(R.id.ivStory);
        tvStoryName.setTextColor(Color.WHITE);


        tvAndersen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String part1 = "Bir varmış, bir yokmuş. Bir zamanlar, periler ülkesinde bahçenin tam ortasında bir gül ağacı varmış. " +
                        "Güllerle dolu bu ağacın üzerinde bir gül perisi yaşıyormuş. Peri öylesine küçükmüş ki kimse onu göremiyormuş. " +
                        "Kanatları omuzlarından ayaklarına kadar iniyormuş. Bu minik sevimli perinin her gül yaprağının altında minik bir " +
                        "yatağı varmış. Gülün incecik yapraklarından oluşan odaları mis gibi gül kokarmış.\n\n" +
                        "Gül Perisi yazın, ılık güneşin altında incecik kanatlarıyla çiçekten çiçeğe uçar; kelebeğin kanatları üzerinde dans eder; " +
                        "ıhlamur yapraklarında koşup oynarken akşam olurmuş.\n\n" +
                        "Gül perisi en çok yaz mevsimi seviyormuş, çünkü yazın havalar sıcak oluyor ve bütün çiçek arkadaşlarıyla daha çok " +
                        "vakit geçirebiliyor, oyunlar oynuyormuş. Gül perisinin bu düşüncelerini duyan yağmur damlacıkları ise çok üzülmüş,";

                String part2 = "Gül perisi beni ve bulutları sevmiyor, diye düşünmüş ve uzun süre gül perisinin yanına yağmur damlacıkları" +
                        " olarak gelmemiş,\n\n" +
                        "Bir gün gül perisinin kanatları çok kirlenmiş ve yağmur damlacıklarına ihtiyacını olduğu anlamış, ama onları ne " +
                        "zamandır görmediğini fark etmiş ve seslenmiş;\n\n" +
                        "– Heyyy, yağmur damlacıkları nerdesiniz?\n\n" +
                        "Gül perisi cevap alamamış ve meraklanmış tekrardan;\n\n" +
                        "-Yağmur damlacıkları sizi özledim, haydi gelinde dans edelim’ demiş.";

                String part3 = "Yağmur damlacıkları gül perisi duyuyormuş ama gül perisine dargınmış,\n\n" +
                        "– Çok işim var gül perisi şimdi gelmeyeceğim, seninle ile Sonbaharda görüşürüz demiş.\n\n" +
                        "Gül perisi yağmur damlacıklarının kalbini kırdığından habersiz, yağmur damlacıkları ise gül perisini yanlış " +
                        "anladığını farkına varmadan uzun zaman birbirlerini göremeden yaşamışlar. Özlemişler birbirlerini ama bu masal " +
                        "burada böyle bitmiş.";

                tvStoryName.setText("Gül Perisi Masalı (Anderson)");
                tvStoryName.setBackgroundColor(0xFF0099CC);
                tvStoryText.setText(part1 + part2 + part3);
                ivStory.setImageResource(R.drawable.gulperisi);

            }
        });


        tvEzop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String part1 = "Günlerden bir gün, yaşlı bir eşek ile hilebaz tilki arkadaş olmuşlar, beraber dolaşır, " +
                        "beraber yer içerlermiş. Bir gün, ormanda gezerlerken karşılarına bir aslan çıkmış. Her ikisi de korkudan " +
                        "bir yere kıpırdayamamış, tilki usulca aslanın kulağına fısıldamış;\n\n" +
                        "-“Bana karışmazsan bu eşeği sana yem ederim.” demiş.\n\n" +
                        "Aslan bu teklifi kabul etmiş, avını beklemeye başlamış. Tilki, eşeği daha önceden bildiği bir tuzağa " +
                        "götürüp onu çukurun içine düşürmüş, sonra aslanı çağırmış;\n";

                String part2 = "-” Kral hazretleri! Buraya gelin, avınız hazır.” demiş.\n\n" +
                        "Aslan bakmış ki, eşek o çukurdan çıkamayacak, zaten eşeği avladım sayılır, ben şu tilkiyi de avlayayım" +
                        " da güzel bir ziyafet çekeyim demiş. Tilki ne kadar aman dilemişse de aslan dinlememiş;\n\n" +
                        "-” Arkadaşına ihanet edip tuzak kuranlar, aynı zamanda kendi sonlarını da hazırlarlar.” demiş. Tilkiyi " +
                        "bir pençede eşeğin bulunduğu çukura yuvarlamış.";

                tvStoryName.setText("Aslan, Tilki ve Eşek (Ezop)");
                tvStoryName.setBackgroundColor(0xFF669900);
                tvStoryText.setText(part1 + part2);
                ivStory.setImageResource(R.drawable.aslantilkiveesek);

            }
        });

        tvLaFontaine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String part1 = "Bir zamanlar uzak bir şehirde güzel mi güzel bir şehir faresi yaşarmış. Yalnızlıktan sıkılan şehir " +
                        "faresi, arkadaş aramaya çıkmış. Bir tarlada rastladığı tarla faresi ile arkadaş olmuş. İkisi birbirlerini " +
                        "çok sevmişler. Aralarında güzel bir dostluk kurulmuş. Şehir faresi sık sık tarla faresini ziyaret edermiş. " +
                        "Birlikte kırlarda güle oynaya vakit geçirirlermiş. Diledikleri kadar koşar, zıplar, yuvarlanırlarmış…\n\n" +
                        "Bir gün şehir faresi arkadaşını yemeğe davet etmiş.\n\n" +
                        "-Bu akşam bize gel. Sana güzel bir sofra hazırlayayım. Azıcık miden bayram etsin, demiş.";

                String part2 = "Bu davete tarla faresi çok sevinmiş. Yiyeceği yemeklerin hayalini kurmaya başlamış. Bütün gece rüyasında " +
                        "peynirler, tatlılar, pastalar görmüş. Bu arada şehir faresinin evinde bir telaş bir telaş… Çeşit çeşit " +
                        "yiyecekler, pastalar hazırlanmış. Bütün gün koşturup durmuş.\n\n" +
                        "Akşam tarla faresi kalkıp gelmiş. Bakmış, masanın üzeri çeşit çeşit yiyeceklerle dolu. Masada hiçbir şey eksik " +
                        "değilmiş. Hemen sofraya oturmuşlar. Ziyafet neşeli başlamış. Tarla faresi önce pastadan bir lokma alacakmış. " +
                        "Tam çatalını uzatmış, dışarıdan sesler gelmiş.\n\n" +
                        "Şehir faresi hemen deliğine kaçmış. Ardından da tarla faresi kendini zor atmış deliğe. Korkudan kalpleri küt " +
                        "küt atıyormuş.";

                String part3 = "Tarla faresi sormuş:\n" +
                        "-Evin kedisi olabilir mi?\n\n" +
                        "Şehir faresi cevap vermiş:\n" +
                        "-Sanırım onun gürültüsüydü.\n\n" +
                        "Yeniden sofraya oturmuşlar. Ama artık neşeleri kaçmış, tedirgin olmuşlar. Tarla faresi bu kez çatalını böreğe " +
                        "uzatmış. Tam lokmayı ağzına atacakmış, yine sesler işitmişler.Apar topar ikisi de kendilerini deliğe atmış. " +
                        "Yüzleri korkudan sapsarı olmuş. Korkudan tir tir titriyorlarmış.\n\n" +
                        "Tarla faresi sormuş:\n" +
                        "-Evin hanımı olabilir mi?";

                String part4 = "Şehir faresi cevaplamış:\n" +
                        "-Belki odur bilemem.\n\n" +
                        "Sesler kesilince delikten çıkmışlar.\n\n" +
                        "Şehir faresi:\n" +
                        "-Kusura bakma. Bazen böyle şeyler oluyor. Haydi yemeğimize devam edelim, demiş.\n\n" +
                        "Tarla faresi:\n" +
                        "-Bu kadar yeter! Korku içinde yemek istemem, demiş. Yarın sen bana gel. Kuru ekmek yeriz belki ama kimse de bizi " +
                        "korkutamaz.";

                tvStoryName.setText("Tarla Faresi ile Şehir Faresi (La Fontaine)");
                tvStoryName.setBackgroundColor(0xFFFF4444);
                tvStoryText.setText(part1 + part2 + part3 + part4);
                ivStory.setImageResource(R.drawable.tarlafaresiilesehirfaresi);

            }
        });

        tvKeloglan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String part1 = "Bir varmış, bir yokmuş. Evvel zaman içinde, kalbur zaman içinde develer tellal iken, pireler " +
                        "berber iken, ben annemin beşiğini tıngır mıngır sallarken; ülkenin birinde bir kasaba varmış. Bu kasabanın " +
                        "kenar mahallelerindeki bir kulübede, çok fakir bir keloğlan ile ihtiyar annesi yaşamakta imiş. Keloğlan " +
                        "çok akıllı ve becerikli olmasına rağmen çalışmaktan hoşlanmaz, tembel tembel evde oturmayı, ne buldu ise " +
                        "yiyip, içmeyi ve uyumayı severmiş. Tembel mi tembel, saçsız kafası ile de çok çirkin olduğu için herkes ona " +
                        "keloğlan dermiş. Keloğlanın ihtiyar annesi ise el çamaşırı yıkar, hem kendini, hem de tembel keloğlanı beslemeye çalışır, zorluklar içinde geçinirlermiş.";

                String part2 = "Her nasılsa Keloğlanın canı çarşıya çıkıp dolaşmak istemiş. Bir de bakmış ki, uzakta bir kalabalık var. " +
                        "Kalabalığın ortasında bir adam bağıra bağıra bir şeyler söylüyor. Kalabalıktaki insanlarda onu dinlermiş. Bizim " +
                        "Keloğlanda kalabalığa sokularak bu adamın dediklerini dinlemiş. Adam meğer şehrin tellallarından biriymiş. " +
                        "Keloğlanın dinlemekte olduğu tellal şöyle demekteydi.\n\n" +
                        "-Ağır bir iş için bir adama ihtiyaç vardır. Bu işi görecek adama yüz altın verilecektir. Talip olacak kimse " +
                        "varsa ortaya çıksın….";

                String part3 = "Keloğlan etrafta toplanan kalabalıktan ses seda çıkmadığını görünce ve bu işin sonunda yüz de altın " +
                        "verileceğini öğrenince tellala:\n\n" +
                        "-Bu işi ben yaparım, yalnız bu yapılacak işi hemen bana söyle, demiş.\n\n" +
                        "Tellal Keloğlanı şöyle bir süzdükten sonra, gözü tutmamış olacak ki:\n\n" +
                        "-Oğlum, sen bu işi yapamazsın, iş çok zordur. Bunu ancak akıllı, becerikli ve cesur adamlar başarabilir. " +
                        "Ben bunları sende göremiyorum, deyince; Keloğlan:\n\n" +
                        "-Ummadığın taş baş yarar. Ben bu işi başarırım, diye cevap vermiş. Etrafta toplanan kalabalıktan alaylı " +
                        "gülüşmeler yükselmiş. Bu sırada tellal onun biraz da fakir haline acıyarak:";

                String part4 = "-Pekala oğlum…Madem ki kendine güveniyorsun sana şimdi yapacağın işi tarif edeyim…Uzak bir ülkeden mal " +
                        "getirmeye gidilecek… Yolculuk at sırtında olacak, ama sen bu yolculuğa katlanabilecek misin?.. diye sorunca.\n\n" +
                        "Keloğlan:\n\n" +
                        "-Ben yaparım dediğim her şeyi yaparım. Elbette katlanırım, karşılığını vermiş. Tellal:\n\n" +
                        "-Madem ki bu kadar güvenin var, bende sana bu işi veriyorum…Paranı şimdi mi, yoksa dönüşte mi istersin? Keloğlan da:\n\n" +
                        "-Şimdi verinde birazı yanımda bulunsun, geri kalanını anneme harçlık bırakırım, der.\n\n" +
                        "Bu şartlarla anlaşmaya varan Keloğlan sevinçle annesine koşarak durumu anlatır ve\n\n" +
                        "yanındaki parayı annesine bırakarak veda edip yapacağı işe gider.";

                String part5 = "Toplantı yerine gelen Keloğlan, yolculuğun hazır olduğunu ve kafilenin kendisini beklemekte olduğunu görür. " +
                        "Kafile başkanı Keloğlana hazır olup olmadığını sorar. hazır olduğunu öğrenince küçük kafile hemen atlara binerek yola " +
                        "koyulur… İki gün durup dinlenmeden yol alırlar. Üçüncü gün Keloğlanın at sırtındaki yolculuktan vücudunun her tarafı " +
                        "ağrımaya başlar. Ama verdiği sözü ve aldığı parayı düşünerek sabırla yola devam eder. Artık akşam yaklaşmıştır. Kafile" +
                        " başkanı mola için kervanı durdurur. Keloğlan biraz dinleneceği için sevinmiştir. Ama bu sevinci çok sürmez. Atlar " +
                        "bağlandıktan sonra kafile başkanı kendini çağırır.\n\n" +
                        "Keloğlana der ki:\n\n" +
                        "-Keloğlan, şurada bir kuyu görüyorsun…\n\n" +
                        "-Evet, der bizim Keloğlan.\n\n" +
                        "-İşte şimdi, o kuyuya ineceksin… Korkmazsın değil mi?…\n\n" +
                        "Keloğlan kuyunun yanına gider bir sağına, bir soluna ve eğilip içine bakar, kafile başkanına dönerek:";

                String part6 = "-Ne var bunda korkacak, elbette inerim. der. keloğlan korksa bile korktuğunu belli etmemeğe çalışarak " +
                        "kuyuya inme hazırlığına başlar. Etrafını saran yol arkadaşları Keloğlan’ın beline kalın bir ip bağlarlar, " +
                        "kuyuya sarkıtırlar.\n\n" +
                        "Keloğlan kuyunun yarısına gelince sağ tarafında karanlıkta aniden bir kapı açılır. Adamın biri Keloğlan’ı " +
                        "kucakladığı gibi bu kapıdan içeri çeker… Neye uğradığını anlayamayan Keloğlan kendine gelince, bir de ne " +
                        "görsün!.. Geniş bir bahçe ve bu bahçenin ortasında büyük bir saray durmuyor mu?.. Sarayın bahçesinde güllerin" +
                        " arasında Dünya güzeli bir kız oturmuş, arkasında bir dudağı yerde, bir dudağı gökte iri ve koyu siyah renkte " +
                        "bir zenci ayakta durmakta. çiçeklerin arasında bir tavus kuşu dolaşmaktadır. Şaşkınlıkla bunları seyre dalan " +
                        "Keloğlan birden arkasında gürleyen bir sesle aklı başından gider. Dönüp bakınca, ne görsün?… Koca bir dev. " +
                        "Arkasında durmuyor mu!.. Dev korkunç bir sesle:";

                String part7 = "-Eyyyy, adem oğlu!… Söyle bakalım, şu gördüklerinden hangisi daha güzel?..\n\n" +
                        "Keloğlan korkudan tir tir titremeye başlar. Ne cevap vereceğini şaşırır ama, biraz sonra aklı başına " +
                        "gelir ve biraz düşündükten sonra:\n\n" +
                        "-Gönül neyi severse güzel odur sultanım, der.\n\n" +
                        "Dev, aldığı cevaptan memnun gibi görünür ve Keloğlan’a tekrar sorar.\n\n" +
                        "-Şu kız çok güzel, şu tavus kuşu çok hoş ama, şu zenci çok çirkin, çok kötü!.. Buna ne dersin?..\n\n" +
                        "Keloğlan artık ilk şaşkınlık ve korkudan kurtulmuştur. Yine cevabı yapıştırır:\n\n" +
                        "-Gönül neyi severse, güzel odur sultanım, diye tekrar aynı cevabı yapıştırır.\n\n" +
                        "Aldığı cevaptan çok hoşlanan dev, Keloğlan’a:";

                String part8 = "-Aferin, sen akıllı bir çocuğa benziyorsun diye Keloğlan’a hemen yanındaki, ağaçtan kopardığı üç tane " +
                        "büyük narı verir. Ve:\n\n" +
                        "-Al bu narları. Dönüşte annenle birlikte yersin, diyerek Keloğlan’ın yanından ayrılmış.\n\n" +
                        "Meğer Dev, her kuyuya inen insana bu soruları sorar fakat, bir türlü istediği akıllıca cevabı alamayınca çok " +
                        "kızar, hemen kellesini uçurur, sonra da etlerini yer, kafa tasını sarayın duvarlarına asarmış. Böylece kuyuya " +
                        "inenlerin çoğu, Dev’in bu soruları karşısında kimi kız güzel, kimi tavus kuşu diye Dev’e cevap verirlermiş. " +
                        "Bu cevaplardan memnun kalmadığı için kuyuya inen bir daha yukarı çıkamazmış. Dev’in yanından ayrılan Keloğlan " +
                        "tekrar çıkış kapısına gelip yukarı nasıl çıkacağını düşünürken birden yukarıdan, su almak için sarkıtılmış bir " +
                        "kovanın kendisine doğru geldiğini görünce, Keloğlan hemen bu kovadan tutarak yukarı çıkar.\n\n" +
                        "Keloğlan’ı sapasağlam yukarı çıktığını gören arkadaşları, şaşkınlıktan ağızları bir karış açık, gözlerine " +
                        "inanamazlar ve birbirlerine bakışırlar. Zira kervancılar bu kuyudan su almak istedikleri zaman her seferinde " +
                        "Dev’e bir insanı kurban vermeleri adetmiş. Yol arkadaşları onu böyle sapasağlam, güler yüzlü görünce tabii " +
                        "şaşkınlıktan kendilerini alamamışlar. Kafile başkanı merakını yenemeyerek ";

                String part9 = "Keloğlan’a:\n\n" +
                        "-Şimdiye kadar bu kuyuya salladığımız adamlardan hiçbiri geri dönmemiştir. Sen nasıl oldu da bu kuyudan " +
                        "sağlam çıktın evlat?…\n\n" +
                        "Keloğlan güler yüzle şu cevabı verir:\n\n" +
                        "-Nasıl çıktıysam çıktım.. Çıktım ya!… Siz ona bakın.\n\n" +
                        "Yeniden kafile yola koyulmuş. Varacakları o uzak ülkeye varmış.Atlara malları yükleyerek memlekete dönmüşler.\n\n" +
                        "Keloğlan elindeki Narları sevinçle evine dönünce, annesi yine her zamanki gibi, el çamaşırı yıkamakta bulur. " +
                        "Annesi de oğlu geldiği için sevinmiştir. Yemekler yenir.Yemekten sonra da Keloğlan, Dev’in verdiği Narlardan " +
                        "birini çıkarıp yemek için ikiye böler. Bir de ne görsün? Dev’in verdiği Nar tanelerinin her biri meğer çok " +
                        "kıymetli birer mücevher değilmiymiş… Bunun değerini anlayan Keloğlan, zaman zaman bunların her birini azar " +
                        "azar satmış.. Ve Keloğlan öylesine zengin olmuş ki, artık ne kelliği kalmıştır, ne de çirkinliği, ne de" +
                        " annesinin çamaşırcılığı. Mutlu bir hayata kavuşmuşlar..";

                tvStoryName.setText("Keloğlan ve Kuyudaki Dev");
                tvStoryName.setBackgroundColor(0xFFAA66CC);
                tvStoryText.setText(part1 + part2 + part3 + part4 + part5 + part6 + part7 + part8 + part9);
                ivStory.setImageResource(R.drawable.keloglan);

            }
        });

        tvDedeKorkut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String part1 = "Basat, Uruz Bey'in Oğuzlar'ın göçü sırasında düşürülüp bir aslan tarafından büyütülen oğludur. " +
                        "Uruz'un çobanı Oğuzlar'ın yaylaya göç ettikleri sırada bir peri kızıyla çiftleşir. Peri kızı, bunun " +
                        "acısını Tepegöz'ü (çobandan olan çocuğu) Oğuzlar'ın içine salarak çıkarır. Tepegöz, çocukların kulaklarını, " +
                        "burunlarını yer; adamları yiyerek öldürür. Basat'ın kardeşi Kıyan Selçuk da Tepegöz yüzünden ölmüştür. " +
                        "Basat gider ve kardeşi uğruna Tepegöz ile savaşır. Önce gözünü yok eder; sonra da öldürür.";

                tvStoryName.setText("Basat'ın Tepegözü Öldürmesi (Dede Korkut)");
                tvStoryName.setBackgroundColor(0xFFFF8800);
                tvStoryText.setText(part1);
                ivStory.setImageResource(R.drawable.tepegoz);

            }
        });

        tvAndersen.performClick();

    }

}
