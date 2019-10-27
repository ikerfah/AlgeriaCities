package com.ikerfah.algeriacities

import com.ikerfah.algeriacities.models.Commune
import com.ikerfah.algeriacities.models.LatLng
import com.ikerfah.algeriacities.models.Wilaya

class AlgeriaCities {

    companion object {
        /**
         * @return Wilaya that match the id , or return null if non
         */
        fun getWilayaById(wilayaId: Int): Wilaya? {
            for (wilaya in wilayas) {
                if (wilaya.id == wilayaId) {
                    return wilaya
                }
            }
            return null
        }

        /**
         * @param wilayaName It's can be french or arabic name
         * @return Wilaya that match the name , or return null if non
         */
        fun getWilayaByName(wilayaName: String): Wilaya? {
            for (wilaya in wilayas) {
                if (wilaya.nomAr.equals(wilayaName,true) || wilaya.nomFr.equals(wilayaName,true)) {
                    return wilaya
                }
            }
            return null
        }

        /**
         * @return ArrayList of commune that belong to the wilaya passed by param, This function return empty arraylist if non commune found
         */
        fun getCommunesByWilayaId(wilayaId: Int): ArrayList<Commune> {
            val tmp = arrayListOf<Commune>()
            for (commune in communes) {
                if (commune.wilayaId == wilayaId) {
                    tmp.add(commune)
                }
            }
            return tmp
        }

        /**
         * @return Return all wilaya list
         */
        fun getAllWilaya():ArrayList<Wilaya>{
            return wilayas
        }


        private val wilayas: ArrayList<Wilaya> by lazy {arrayListOf(
            Wilaya(1, "Adrar", "أدرار"),
            Wilaya(2, "Chlef", "الشلف"),
            Wilaya(3, "Laghouat", "الأغواط"),
            Wilaya(4, "Oum El Bouaghi", "أم البواقي"),
            Wilaya(5, "Batna", "باتنة"),
            Wilaya(6, "Béjaïa", "بجاية"),
            Wilaya(7, "Biskra", "بسكرة"),
            Wilaya(8, "Béchar", "بشار"),
            Wilaya(9, "Blida", "البليدة"),
            Wilaya(10, "Bouira", "البويرة"),
            Wilaya(11, "Tamanrasset", "تمنراست"),
            Wilaya(12, "Tébessa", "تبسة"),
            Wilaya(13, "Tlemcen", "تلمسان"),
            Wilaya(14, "Tiaret", "تيارت"),
            Wilaya(15, "Tizi Ouzou", "تيزي وزو"),
            Wilaya(16, "Alger", "الجزائر"),
            Wilaya(17, "Djelfa", "الجلفة"),
            Wilaya(18, "Jijel", "جيجل"),
            Wilaya(19, "Sétif", "سطيف"),
            Wilaya(20, "Saïda", "سعيدة"),
            Wilaya(21, "Skikda", "سكيكيدة"),
            Wilaya(22, "Sidi Bel Abbès", "سيدي بلعباس"),
            Wilaya(23, "Annaba", "عنابة"),
            Wilaya(24, "Guelma", "قالمة"),
            Wilaya(25, "Constantine", "قسنطينة"),
            Wilaya(26, "Médéa", "المدية"),
            Wilaya(27, "Mostaganem", "مستغانم"),
            Wilaya(28, "M'Sila", "المسيلة"),
            Wilaya(29, "Mascara", "معسكر"),
            Wilaya(30, "Ouargla", "ورقلة"),
            Wilaya(31, "Oran", "وهران"),
            Wilaya(32, "El Bayadh", "البيض"),
            Wilaya(33, "Illizi", "إليزي"),
            Wilaya(34, "Bordj Bou Arreridj", "برج بوعريريج"),
            Wilaya(35, "Boumerdès", "بومرداس"),
            Wilaya(36, "El Tarf", "الطارف"),
            Wilaya(37, "Tindouf", "تندوف"),
            Wilaya(38, "Tissemsilt", "تسمسيلت"),
            Wilaya(39, "El Oued", "الوادي"),
            Wilaya(40, "Khenchela", "خنشلة"),
            Wilaya(41, "Souk Ahras", "سوق الأهراس"),
            Wilaya(42, "Tipaza", "تيبازة"),
            Wilaya(43, "Mila", "ميلة"),
            Wilaya(44, "Aïn Defla", "عين الدفلى"),
            Wilaya(45, "Naâma", "النعامة"),
            Wilaya(46, "Aïn Témouchent", "عين تموشنت"),
            Wilaya(47, "Ghardaïa", "غرداية"),
            Wilaya(48, "Relizane", "غليزان")
        )}

        private val communes: ArrayList<Commune> by lazy { arrayListOf(

            Commune(
                1,
                "أدرار‎",
                "Adrar",
                LatLng("27.8745133", "-0.2842163"),
                1001,
                1
            ),
            Commune(
                2,
                "تامست",
                "Tamest",
                LatLng("27.4538889", "-0.2602777999999999"),
                1002,
                1
            ),
            Commune(
                3,
                "شروين",
                "Charouine",
                LatLng("29.0195565", "-0.259657"),
                1003,
                1
            ),
            Commune(
                4,
                "رڨان",
                "Reggane",
                LatLng("25.2759633", "-1.5208624"),
                1004,
                1
            ),
            Commune(
                5,
                "إينوزغمير",
                "Inozghmir",
                LatLng("27.97048", "-0.188863"),
                1005,
                1
            ),
            Commune(
                6,
                "تــيـــت",
                "Tit",
                LatLng("26.936237", "1.4869856"),
                1006,
                1
            ),
            Commune(
                7,
                "قصر قدور",
                "Ksar Kaddour",
                LatLng("29.5827395", "0.3724815"),
                1007,
                1
            ),
            Commune(
                8,
                "تسابيت",
                "Tsabit",
                LatLng("28.3504036", "-0.2186041"),
                1008,
                1
            ),
            Commune(
                9,
                "تيميمون",
                "Timimoun",
                LatLng("29.26092170000001", "0.2385387"),
                1009,
                1
            ),
            Commune(
                10,
                "أولاد سعيد",
                "Ouled Said",
                LatLng("29.4206093", "0.2455769"),
                1010,
                1
            ),
            Commune(
                11,
                "زاوية كنتة",
                "Zaouiet Kounta",
                LatLng("27.2263135", "-0.2010233"), 1011,
                1
            ),
            Commune(
                12,
                "أولف",
                "Aoulef",
                LatLng("26.9752935", "1.0729818"),
                1012,
                1
            ),
            Commune(
                13,
                "تيمقتن",
                "Timokten",
                LatLng("27.0225931", "1.0442502"),
                1013,
                1
            ),
            Commune(
                14,
                "تامنطيت",
                "Tamentit",
                LatLng("27.7664008", "-0.266699"),
                1014,
                1
            ),
            Commune(
                15,
                "فنوغيل",
                "Fenoughil",
                LatLng("27.6490194", "-0.3042778"),
                1015,
                1
            ),
            Commune(
                16,
                "زاوية دباغ",
                "Tinerkouk",
                LatLng("29.711749", "0.7105267"),
                1016,
                1
            ),
            Commune(
                17,
                "دلدول",
                "Deldoul",
                LatLng("28.0167", "-0.433333"),
                1017,
                1
            ),
            Commune(
                18,
                "سالى",
                "Sali",
                LatLng("27.0363493", "-0.0877444"),
                1018,
                1
            ),
            Commune(
                19,
                "أقبلي",
                "Akabli",
                LatLng("26.7018955", "1.3613923"),
                1019,
                1
            ),
            Commune(
                20,
                "المطارفة",
                "Metarfa",
                LatLng("28.5972281", "-0.1448182"),
                1020,
                1
            ),
            Commune(
                21,
                "أحمد تيمي",
                "O Ahmed Timmi",
                LatLng("27.851346", "-0.280972"),
                1021,
                1
            ),
            Commune(
                22,
                "الحي الثاني",
                "Bouda",
                LatLng("27.8746051", "-0.2930077999999999"), 1022,
                1
            ),
            Commune(
                23,
                "أوقروت",
                "Aougrout",
                LatLng("28.75000000000001", "0.2500000000000001"), 1023,
                1
            ),
            Commune(
                24,
                "تلمين",
                "Talmine",
                LatLng("29.3314", "-0.4975"),
                1024,
                1
            ),
            Commune(
                25,
                "برج باجي مختار",
                "B Badji Mokhtar",
                LatLng("21.3289", "0.954167"), 1025,
                1
            ),
            Commune(
                26,
                "السبع",
                "Sbaa",
                LatLng("28.211617", "-0.1729106"),
                1026,
                1
            ),
            Commune(
                27,
                "أولاد عيسى",
                "Ouled Aissa",
                LatLng("29.4237071", "-0.08869479999999999"), 1027,
                1
            ),
            Commune(
                28,
                "تيمياوين",
                "Timiaouine",
                LatLng("20.8948062", "1.6760691"),
                1028,
                1
            ),
            Commune(
                29,
                "الشلف",
                "Chlef",
                LatLng("36.1548171", "1.3256957"),
                2001,
                2
            ),
            Commune(
                30,
                "تنس",
                "Tenes",
                LatLng("36.50490379999999", "1.3180042"),
                2002,
                2
            ),
            Commune(
                31,
                "بنايرية",
                "Benairia",
                LatLng("36.3540039", "1.374987"),
                2003,
                2
            ),
            Commune(
                32,
                "الكريمية",
                "El Karimia",
                LatLng("36.08997910000001", "1.5693045"), 2004,
                2
            ),
            Commune(
                33,
                "تاجنة",
                "Tadjna",
                LatLng("36.32545570000001", "1.1377008"),
                2005,
                2
            ),
            Commune(
                34,
                "تاوقريت",
                "Taougrite",
                LatLng("36.2459846", "0.9223635999999998"), 2006,
                2
            ),
            Commune(
                35,
                "بني حواء",
                "Beni Haoua",
                LatLng("36.4914417", "1.5402327"),
                2007,
                2
            ),
            Commune(
                36,
                "صبحة",
                "Sobha",
                LatLng("36.1100346", "1.110123"),
                2008,
                2
            ),
            Commune(
                37,
                "حرشون",
                "Harchoun",
                LatLng("36.1126987", "1.4918235"),
                2009,
                2
            ),
            Commune(
                38,
                "أولاد فارس",
                "Ouled Fares",
                LatLng("36.2316052", "1.236999"),
                2010,
                2
            ),
            Commune(
                39,
                "سيدي عكاشة",
                "Sidi Akacha",
                LatLng("36.4505105", "1.3469247"),
                2011,
                2
            ),
            Commune(
                40,
                "بوقدير",
                "Boukadir",
                LatLng("36.0569401", "1.1209121"),
                2012,
                2
            ),
            Commune(
                41,
                "بني راشد",
                "Beni Rached",
                LatLng("36.2753891", "1.5015009"),
                2013,
                2
            ),
            Commune(
                42,
                "تلعصة",
                "Talassa",
                LatLng("36.4288223", "1.0849592"),
                2014,
                2
            ),
            Commune(
                43,
                "الهرنفة",
                "Herenfa",
                LatLng("36.2449244", "1.0514312"),
                2015,
                2
            ),
            Commune(
                44,
                "واد ڨوسين",
                "Oued Goussine",
                LatLng("36.5033408", "1.4531355"),
                2016,
                2
            ),
            Commune(
                45,
                "الظهرة",
                "Dahra",
                LatLng("36.25736", "0.8508345"),
                2017,
                2
            ),
            Commune(
                46,
                "أولاد عباس",
                "Ouled Abbes",
                LatLng("36.22127750000001", "1.4918235"), 2018,
                2
            ),
            Commune(
                47,
                "سنجاس",
                "Sendjas",
                LatLng("36.0591718", "1.4241426"),
                2019,
                2
            ),
            Commune(
                48,
                "الزبوجة",
                "Zeboudja",
                LatLng("36.4058679", "1.4628042"),
                2020,
                2
            ),
            Commune(
                49,
                "واد سلي",
                "Oued Sly",
                LatLng("36.10477969999999", "1.2313618"),
                2021,
                2
            ),
            Commune(
                50,
                "أبو الحسن",
                "Abou El Hassen",
                LatLng("36.4088563", "1.1929114"),
                2022,
                2
            ),
            Commune(
                51,
                "المرصى",
                "El Marsa",
                LatLng("36.4031597", "0.9175910999999999"),
                2023,
                2
            ),
            Commune(
                52,
                "الشطية",
                "Chettia",
                LatLng("36.1589988", "1.2409799"),
                2024,
                2
            ),
            Commune(
                53,
                "سيدي عبد الرحمان",
                "Sidi Abderrahmane",
                LatLng("36.49227659999999", "1.0957418"), 2025,
                2
            ),
            Commune(
                54,
                "مصدق",
                "Moussadek",
                LatLng("36.3536988", "1.0083637"),
                2026,
                2
            ),
            Commune(
                55,
                "الحجاج",
                "El Hadjadj",
                LatLng("36.01655520000001", "1.3469247"),
                2027,
                2
            ),
            Commune(
                56,
                "الأبيض مجاجة",
                "Labiod Medjadja",
                LatLng("36.2767832", "1.3855161"), 2028,
                2
            ),
            Commune(
                57,
                "واد الفضة",
                "Oued Fodda",
                LatLng("36.1988388", "1.5499211"),
                2029,
                2
            ),
            Commune(
                58,
                "أولاد بن عبد القادر",
                "Ouled Ben Abdelkader",
                LatLng("36.0173924", "1.2698475"), 2030,
                2
            ),
            Commune(
                59,
                "بوزغاية",
                "Bouzghaia",
                LatLng("36.3397492", "1.2417743"),
                2031,
                2
            ),
            Commune(
                60,
                "عين مران",
                "Ain Merane",
                LatLng("36.1608508", "0.9778686"),
                2032,
                2
            ),
            Commune(
                61,
                "أم الذروع",
                "Oum Drou",
                LatLng("36.200509", "1.4144827"),
                2033,
                2
            ),
            Commune(
                62,
                "بريرة",
                "Breira",
                LatLng("36.447678", "1.5789994"),
                2034,
                2
            ),
            Commune(
                63,
                "بني بوعتاب",
                "Beni Bouateb",
                LatLng("36.001251", "1.647175"),
                2035,
                2
            ),
            Commune(
                64,
                "الأغواط",
                "Laghouat",
                LatLng("33.8001282", "2.8697104"),
                3001,
                3
            ),
            Commune(
                65,
                "قصر الحيران",
                "Ksar El Hirane",
                LatLng("33.7847662", "3.1328011"), 3002,
                3
            ),
            Commune(
                66,
                " بن ناصر بن شهرة",
                "Bennaceur Benchohra",
                LatLng("33.752934", "3.001381"), 3003,
                3
            ),
            Commune(
                67,
                "سيدي مخلوف",
                "Sidi Makhlouf",
                LatLng("34.127625", "3.014780999999999"), 3004,
                3
            ),
            Commune(
                68,
                "حاسي دلاعة",
                "Hassi Delaa",
                LatLng("33.4186197", "3.548378099999999"), 3005,
                3
            ),
            Commune(
                69,
                "حاسي الرمل",
                "Hassi R Mel",
                LatLng("32.93499159999999", "3.268421499999999"), 3006,
                3
            ),
            Commune(
                70,
                "عــيــن مـــاضــي",
                "Ain Mahdi",
                LatLng("33.7946585", "2.299982099999999"), 3007,
                3
            ),
            Commune(
                71,
                "تاجموت",
                "Tadjmout",
                LatLng("33.8794929", "2.5272209"),
                3008,
                3
            ),
            Commune(
                72,
                "الخنق",
                "Kheneg",
                LatLng("33.7453939", "2.7954106"),
                3009,
                3
            ),
            Commune(
                73,
                "قلتة سيدي سعد",
                "Gueltat Sidi Saad",
                LatLng("34.2962822", "1.9416877"), 3010,
                3
            ),
            Commune(
                74,
                "عين سيدي علي",
                "Ain Sidi Ali",
                LatLng("34.1508333", "1.545"),
                3011,
                3
            ),
            Commune(
                75,
                "بيضة",
                "Beidha",
                LatLng("34.472969", "2.17327"),
                3012,
                3
            ),
            Commune(
                76,
                "بريدة",
                "Brida",
                LatLng("33.9049713", "1.7842236"),
                3013,
                3
            ),
            Commune(
                77,
                "الغيشة",
                "El Ghicha",
                LatLng("33.9299401", "2.143796800000001"),
                3014,
                3
            ),
            Commune(
                78,
                "الحاج المشري",
                "Hadj Mechri",
                LatLng("33.95712960000001", "1.5992068"), 3015,
                3
            ),
            Commune(
                79,
                "سبقاق",
                "Sebgag",
                LatLng("34.02958", "1.92798"),
                3016,
                3
            ),
            Commune(
                80,
                "تاويالة",
                "Taouiala",
                LatLng("33.8689577", "1.8635409"),
                3017,
                3
            ),
            Commune(
                81,
                "تاجرونة",
                "Tadjrouna",
                LatLng("33.503632", "2.101217"),
                3018,
                3
            ),
            Commune(
                82,
                "أفلو",
                "Aflou",
                LatLng("34.10748640000001", "2.1008486"),
                3019,
                3
            ),
            Commune(
                83,
                "العسافية",
                "El Assafia",
                LatLng("33.824559", "2.990057"),
                3020,
                3
            ),
            Commune(
                84,
                "وادي مرة",
                "Oued Morra",
                LatLng("34.1666669", "2.3166669"),
                3021,
                3
            ),
            Commune(
                85,
                "وادي مزي",
                "Oued M Zi",
                LatLng("33.94231250000001", "2.9835878"), 3022,
                3
            ),
            Commune(
                86,
                "الحوايطة",
                "El Houita",
                LatLng("33.649707", "2.4542"),
                3023,
                3
            ),
            Commune(
                87,
                "سيدي بوزيد",
                "Sidi Bouzid",
                LatLng("34.3447424", "2.2640716"),
                3024,
                3
            ),
            Commune(
                88,
                "أم البواقي",
                "Oum El Bouaghi",
                LatLng("35.873056", "7.1197867"),
                4001,
                4
            ),
            Commune(
                89,
                "عين البيضاء",
                "Ain Beida",
                LatLng("35.7981327", "7.392173400000001"), 4002,
                4
            ),
            Commune(
                90,
                "عين مليلة",
                "Ainmlila",
                LatLng("36.0189518", "6.5569882"),
                4003,
                4
            ),
            Commune(
                91,
                "بحير شرقي",
                "Behir Chergui",
                LatLng("35.7940171", "7.7185878"), 4004,
                4
            ),
            Commune(
                92,
                "الاميرية",
                "El Amiria",
                LatLng("36.1101777", "6.904832099999999"),
                4005,
                4
            ),
            Commune(
                93,
                "سيقوس",
                "Sigus",
                LatLng("36.09368440000001", "6.770813800000001"), 4006,
                4
            ),
            Commune(
                94,
                "البلالة",
                "El Belala",
                LatLng("35.6653463", "7.788537400000001"), 4007,
                4
            ),
            Commune(
                95,
                "عين بابوش",
                "Ain Babouche",
                LatLng("35.9425396", "7.181720000000001"), 4008,
                4
            ),
            Commune(
                96,
                "بريش",
                "Berriche",
                LatLng("35.9144973", "7.3759671"),
                4009,
                4
            ),
            Commune(
                97,
                "أولاد حملة",
                "Ouled Hamla",
                LatLng("36.0669135", "6.471657999999999"), 4010,
                4
            ),
            Commune(
                98,
                "الضلعة",
                "Dhala",
                LatLng("35.4582557", "7.549096999999999"),
                4011,
                4
            ),
            Commune(
                99,
                "عين كرشة",
                "Ain Kercha",
                LatLng("35.93028350000001", "6.6905458"), 4012,
                4
            ),
            Commune(
                100,
                "هنشير تومغني",
                "Hanchir Toumghani",
                LatLng("35.9355726", "6.7413706"), 4013,
                4
            ),
            Commune(
                101,
                "الجازية",
                "El Djazia",
                LatLng("35.66315", "7.507954"),
                4014,
                4
            ),
            Commune(
                102,
                "عين ديس",
                "Ain Diss",
                LatLng("36.0168", "7.03005"),
                4015,
                4
            ),
            Commune(
                103,
                "فكرينة",
                "Fkirina",
                LatLng("35.6640497", "7.300360400000001"),
                4016,
                4
            ),
            Commune(
                104,
                "سوق نعمان",
                "Souk Naamane",
                LatLng("35.9414231", "6.386442799999999"), 4017,
                4
            ),
            Commune(
                105,
                "زرق",
                "Zorg",
                LatLng("35.786861", "7.467"),
                4018,
                4
            ),
            Commune(
                106,
                "الفجوج بوغرار",
                "El Fedjoudj Boughrar",
                LatLng("36.503971", "7.383816"), 4019,
                4
            ),
            Commune(
                107,
                "أولاد زواي",
                "Ouled Zouai",
                LatLng("35.8477341", "6.5143087"),
                4020,
                4
            ),
            Commune(
                108,
                "بئر الشهداء",
                "Bir Chouhada",
                LatLng("35.8966254", "6.2925058"), 4021,
                4
            ),
            Commune(
                109,
                "قصر صباحي",
                "Ksar Sbahi",
                LatLng("36.0841308", "7.2571943"),
                4022,
                4
            ),
            Commune(
                110,
                "وادي نيني",
                "Oued Nini",
                LatLng("35.57007610000001", "7.347604800000001"), 4023,
                4
            ),
            Commune(
                111,
                "مسكيانة",
                "Meskiana",
                LatLng("35.6328262", "7.671088900000002"), 4024,
                4
            ),
            Commune(
                112,
                "عين فكرون",
                "Ain Fekroune",
                LatLng("35.9736892", "6.8708486"),
                4025,
                4
            ),
            Commune(
                113,
                "الراحية",
                "Rahia",
                LatLng("35.716667", "7.666667"),
                4026,
                4
            ),
            Commune(
                114,
                "عين الزيتون",
                "Ain Zitoun",
                LatLng("35.6842651", "6.935674000000001"), 4027,
                4
            ),
            Commune(
                115,
                "اولاد قاسم",
                "Ouled Gacem",
                LatLng("35.870372", "7.111292"),
                4028,
                4
            ),
            Commune(
                116,
                "الحرملية",
                "El Harmilia",
                LatLng("35.9245726", "6.6223966"),
                4029,
                4
            ),
            Commune(
                117,
                "باتنة",
                "Batna",
                LatLng("35.56851839999999", "6.1871735"),
                5001,
                5
            ),
            Commune(
                118,
                "غسيرة",
                "Ghassira",
                LatLng("35.0777543", "6.216359699999999"),
                5002,
                5
            ),
            Commune(
                119,
                "معافة",
                "Maafa",
                LatLng("35.269936", "5.8775964"),
                5003,
                5
            ),
            Commune(
                120,
                "مروانة",
                "Merouana",
                LatLng("35.6287744", "5.9092754"),
                5004,
                5
            ),
            Commune(
                121,
                "سريانة",
                "Seriana",
                LatLng("35.6917406", "6.173911599999999"),
                5005,
                5
            ),
            Commune(
                122,
                "منعة",
                "Menaa",
                LatLng("35.1280608", "6.089103199999998"),
                5006,
                5
            ),
            Commune(
                123,
                "المعذر",
                "El Madher",
                LatLng("35.6371149", "6.386442799999999"), 5007,
                5
            ),
            Commune(
                124,
                "باتنة‎",
                "Tazoult",
                LatLng("35.5610218", "6.173911599999999"),
                5008,
                5
            ),
            Commune(
                125,
                "نڨاوس",
                "Ngaous",
                LatLng("35.5566128", "5.593238999999999"),
                5009,
                5
            ),
            Commune(
                126,
                "قيقبة",
                "Guigba",
                LatLng("35.7319601", "5.572229699999999"),
                5010,
                5
            ),
            Commune(
                127,
                "إينوغيسن",
                "Inoughissen",
                LatLng("35.2684424", "6.5463156"),
                5011,
                5
            ),
            Commune(
                128,
                "عيون العصافير",
                "Ouyoun El Assafir",
                LatLng("35.552203", "6.3438785"), 5012,
                5
            ),
            Commune(
                129,
                "جرمة",
                "Djerma",
                LatLng("35.6851412", "6.3013432"),
                5013,
                5
            ),
            Commune(
                130,
                "بيطام",
                "Bitam",
                LatLng("35.1408805", "5.352087599999999"),
                5014,
                5
            ),
            Commune(
                131,
                "متكاواك",
                "Metkaouak",
                LatLng("35.3687479", "5.183641000000001"), 5015,
                5
            ),
            Commune(
                132,
                "اريس",
                "Arris",
                LatLng("35.30053739999999", "6.3545169"),
                5016,
                5
            ),
            Commune(
                133,
                "كيمل",
                "Kimmel",
                LatLng("34.9766508", "6.471658"),
                5017,
                5
            ),
            Commune(
                134,
                "تيلاطو",
                "Tilatou",
                LatLng("35.28194149999999", "5.624766999999999"), 5018,
                5
            ),
            Commune(
                135,
                "عين جاسر",
                "Ain Djasser",
                LatLng("35.8308281", "6.004412099999999"), 5019,
                5
            ),
            Commune(
                136,
                "أولاد سلام",
                "Ouled Selam",
                LatLng("35.8411857", "5.7932008"),
                5020,
                5
            ),
            Commune(
                137,
                "تيغرغار",
                "Tigherghar",
                LatLng("35.0905115", "5.962110600000001"), 5021,
                5
            ),
            Commune(
                138,
                "عين ياقوت",
                "Ain Yagout",
                LatLng("35.8088781", "6.429036"),
                5022,
                5
            ),
            Commune(
                139,
                "فسديس",
                "Fesdis",
                LatLng("35.6127845", "6.2269763"),
                5023,
                5
            ),
            Commune(
                140,
                "سفيان",
                "Sefiane",
                LatLng("35.4255853", "5.593239"),
                5024,
                5
            ),
            Commune(
                141,
                "الرحبات",
                "Rahbat",
                LatLng("35.7280419", "5.6563119"),
                5025,
                5
            ),
            Commune(
                142,
                "تيغانمين",
                "Tighanimine",
                LatLng("35.1955527", "6.2694608"),
                5026,
                5
            ),
            Commune(
                143,
                "لمسان",
                "Lemsane",
                LatLng("35.63491279999999", "5.7826597"),
                5027,
                5
            ),
            Commune(
                144,
                "قصر بلازمة",
                "Ksar Belezma",
                LatLng("35.70656299999999", "5.8775964"), 5028,
                5
            ),
            Commune(
                145,
                "سقانة",
                "Seggana",
                LatLng("35.32959110000001", "5.540729900000001"), 5029,
                5
            ),
            Commune(
                146,
                "ايشمول",
                "Ichmoul",
                LatLng("35.285666", "6.429036"),
                5030,
                5
            ),
            Commune(
                147,
                "فم الطوب",
                "Foum Toub",
                LatLng("35.368536", "6.514308700000001"), 5031,
                5
            ),
            Commune(
                148,
                "بنى فضالة الحقانية",
                "Beni Foudhala El Hakania",
                LatLng("35.3928288", "6.046742899999999"), 5032,
                5
            ),
            Commune(
                149,
                "واد الماء",
                "Oued El Ma",
                LatLng("35.6567552", "6.0044121"),
                5033,
                5
            ),
            Commune(
                150,
                "تالخمت",
                "Talkhamt",
                LatLng("35.71267030000001", "5.751047499999999"), 5034,
                5
            ),
            Commune(
                151,
                "بوزينة",
                "Bouzina",
                LatLng("35.26989530000001", "6.0996978"),
                5035,
                5
            ),
            Commune(
                152,
                "الشمرة",
                "Chemora",
                LatLng("35.6256226", "6.5996963"),
                5036,
                5
            ),
            Commune(
                153,
                "واد الشعبة",
                "Oued Chaaba",
                LatLng("35.5238393", "6.0467429"),
                5037,
                5
            ),
            Commune(
                154,
                "تاكسلانت",
                "Taxlent",
                LatLng("35.5799027", "5.7932008"),
                5038,
                5
            ),
            Commune(
                155,
                "القصبات",
                "Gosbat",
                LatLng("35.6391967", "5.4568133"),
                5039,
                5
            ),
            Commune(
                156,
                "أولاد عوف",
                "Ouled Aouf",
                LatLng("35.450956", "5.751047499999999"), 5040,
                5
            ),
            Commune(
                157,
                "بــومقر",
                "Boumagueur",
                LatLng("35.4930629", "5.551228"),
                5041,
                5
            ),
            Commune(
                158,
                "بريكة",
                "Barika",
                LatLng("35.3845934", "5.2893433"),
                5042,
                5
            ),
            Commune(
                159,
                "الجزار",
                "Djezzar",
                LatLng("35.51389229999999", "5.3311652"),
                5043,
                5
            ),
            Commune(
                160,
                "تكوت",
                "Tkout",
                LatLng("35.1588259", "6.3438785"),
                5044,
                5
            ),
            Commune(
                161,
                "عين التوتة",
                "Ain Touta",
                LatLng("35.3991089", "5.9198387"),
                5045,
                5
            ),
            Commune(
                162,
                "حيدوسة",
                "Hidoussa",
                LatLng("35.5301294", "5.919838699999999"),
                5046,
                5
            ),
            Commune(
                163,
                "ثنیه العابد",
                "Teniet El Abed",
                LatLng("35.25", "6.183332999999999"), 5047,
                5
            ),
            Commune(
                164,
                "وادي الطاقة",
                "Oued Taga",
                LatLng("35.42128669999999", "6.3438785"), 5048,
                5
            ),
            Commune(
                165,
                "أولاد فاضل",
                "Ouled Fadel",
                LatLng("35.5337671", "6.685198199999999"), 5049,
                5
            ),
            Commune(
                166,
                "تيمقاد",
                "Timgad",
                LatLng("35.4995081", "6.5143087"),
                5050,
                5
            ),
            Commune(
                167,
                "رأس العيون",
                "Ras El Aioun",
                LatLng("35.6770224", "5.5827334"),
                5051,
                5
            ),
            Commune(
                168,
                "شير",
                "Chir",
                LatLng("35.2135627", "6.1314928"),
                5052,
                5
            ),
            Commune(
                169,
                "أولاد سي سليمان",
                "Ouled Si Slimane",
                LatLng("35.5859034", "5.666830600000001"), 5053,
                5
            ),
            Commune(
                170,
                "زانة البيضاء",
                "Zanat El Beida",
                LatLng("35.8037586", "6.110294299999999"), 5054,
                5
            ),
            Commune(
                171,
                "أمدوكال",
                "Amdoukal",
                LatLng("35.1270837", "5.1640605"),
                5055,
                5
            ),
            Commune(
                172,
                "أولاد عمار",
                "Ouled Ammar",
                LatLng("35.4774579", "5.1640605"),
                5056,
                5
            ),
            Commune(
                173,
                "الحاسي",
                "El Hassi",
                LatLng("35.7790971", "5.951539899999999"),
                5057,
                5
            ),
            Commune(
                174,
                "لازرو",
                "Lazrou",
                LatLng("35.7721622", "6.301343199999999"),
                5058,
                5
            ),
            Commune(
                175,
                "بومية",
                "Boumia",
                LatLng("35.7173264", "6.514308700000001"),
                5059,
                5
            ),
            Commune(
                176,
                "بولهيلات",
                "Boulhilat",
                LatLng("35.7538128", "6.642432999999999"), 5060,
                5
            ),
            Commune(
                177,
                "الاربعاء",
                "Larbaa",
                LatLng("35.54326799999999", "6.199772900000001"), 5061,
                5
            ),
            Commune(
                178,
                "بجاية",
                "Bejaia",
                LatLng("36.7508896", "5.056733299999999"),
                6001,
                6
            ),
            Commune(
                179,
                "اميزور",
                "Amizour",
                LatLng("36.6421159", "4.903334"),
                6002,
                6
            ),
            Commune(
                180,
                "فرعون",
                "Ferraoun",
                LatLng("36.55740470000001", "4.8647019"),
                6003,
                6
            ),
            Commune(
                181,
                "تاوريرت اغيل",
                "Taourirt Ighil",
                LatLng("36.72021549999999", "4.738101299999999"), 6004,
                6
            ),
            Commune(
                182,
                "شلاطة",
                "Chelata",
                LatLng("36.5135502", "4.510886200000001"),
                6005,
                6
            ),
            Commune(
                183,
                "تامقرة",
                "Tamokra",
                LatLng("36.3983738", "4.667343199999999"),
                6006,
                6
            ),
            Commune(
                184,
                "تيمزريت",
                "Timzrit",
                LatLng("36.6151583", "4.7749158"),
                6007,
                6
            ),
            Commune(
                185,
                "ﺳﻮق اﻻﺛﻨﻴﻦ",
                "Souk El Thenine",
                LatLng("36.6256524", "5.3360215"), 6008,
                6
            ),
            Commune(
                186,
                "مسيسنة",
                "Mcisna",
                LatLng("36.56340700000001", "4.710368"),
                6009,
                6
            ),
            Commune(
                187,
                "ثينبدير",
                "Thinabdher",
                LatLng("36.754597", "5.074636"),
                6010,
                6
            ),
            Commune(
                188,
                "تيشي",
                "Tichi",
                LatLng("36.6682721", "5.1550882"),
                6011,
                6
            ),
            Commune(
                189,
                "سمعون",
                "Semaoun",
                LatLng("36.61496100000001", "4.823662"),
                6012,
                6
            ),
            Commune(
                190,
                "كنديرة",
                "Kendira",
                LatLng("36.5404083", "5.0268199"),
                6013,
                6
            ),
            Commune(
                191,
                "تيفرة",
                "Tifra",
                LatLng("36.6667365", "4.6963496"),
                6014,
                6
            ),
            Commune(
                192,
                "إغرم",
                "Ighram",
                LatLng("36.46246610000001", "4.504893900000001"), 6015,
                6
            ),
            Commune(
                193,
                "امالو",
                "Amalou",
                LatLng("36.47746259999999", "4.632585300000001"), 6016,
                6
            ),
            Commune(
                194,
                "إغيل على",
                "Ighil Ali",
                LatLng("36.3379865", "4.4702131"),
                6017,
                6
            ),
            Commune(
                195,
                "افناين الماثن",
                "Ifelain Ilmathen",
                LatLng("36.6691075", "4.7680575"), 6018,
                6
            ),
            Commune(
                196,
                "توجة",
                "Toudja",
                LatLng("36.7490754", "4.8899903"),
                6019,
                6
            ),
            Commune(
                197,
                "درقينة",
                "Darguina",
                LatLng("36.5646323", "5.3059896"),
                6020,
                6
            ),
            Commune(
                198,
                "سيدي عياد",
                "Sidi Ayad",
                LatLng("36.6122273", "4.7159414"),
                6021,
                6
            ),
            Commune(
                199,
                "أوقاس",
                "Aokas",
                LatLng("36.6369535", "5.2440622"),
                6022,
                6
            ),
            Commune(
                200,
                "آيث جليل",
                "Beni Djellil",
                LatLng("36.57292710000001", "4.810768"), 6023,
                6
            ),
            Commune(
                201,
                "آدكار",
                "Adekar",
                LatLng("36.6942103", "4.669073"),
                6024,
                6
            ),
            Commune(
                202,
                "أقبو",
                "Akbou",
                LatLng("36.45901610000001", "4.5334783"),
                6025,
                6
            ),
            Commune(
                203,
                "صدوق",
                "Seddouk",
                LatLng("36.5446668", "4.6868666"),
                6026,
                6
            ),
            Commune(
                204,
                "تازمالت",
                "Tazmalt",
                LatLng("36.3878041", "4.407921300000001"),
                6027,
                6
            ),
            Commune(
                205,
                "آيت أرزين",
                "Ait Rizine",
                LatLng("36.3831907", "4.531502899999999"), 6028,
                6
            ),
            Commune(
                206,
                "شميني",
                "Chemini",
                LatLng("36.5956868", "4.615230799999999"),
                6029,
                6
            ),
            Commune(
                207,
                "سوق أوفلة",
                "Souk Oufella",
                LatLng("36.6114371", "4.6295394"),
                6030,
                6
            ),
            Commune(
                208,
                "تاسقريوت",
                "Taskriout",
                LatLng("36.5519437", "5.284117699999999"), 6031,
                6
            ),
            Commune(
                209,
                "طيبان",
                "Tibane",
                LatLng("36.6127223", "4.6513509"),
                6032,
                6
            ),
            Commune(
                210,
                "ثالة حمزة",
                "Tala Hamza",
                LatLng("36.6876795", "5.0078451"),
                6033,
                6
            ),
            Commune(
                211,
                "برباشة",
                "Barbacha",
                LatLng("36.5729398", "4.971239"),
                6034,
                6
            ),
            Commune(
                212,
                "بنى كسيلة",
                "Beni Ksila",
                LatLng("36.839681", "4.707061599999999"), 6035,
                6
            ),
            Commune(
                213,
                "أوزلاقن",
                "Ouzallaguen",
                LatLng("36.554343", "4.572759800000001"), 6036,
                6
            ),
            Commune(
                214,
                "بوحمزة",
                "Bouhamza",
                LatLng("36.4452822", "4.6853713"),
                6037,
                6
            ),
            Commune(
                215,
                "بني مليكيش",
                "Beni Melikeche",
                LatLng("36.433000", "4.400000"),
                6038,
                6
            ),
            Commune(
                216,
                "سيدي عيش",
                "Sidi Aich",
                LatLng("36.6090172", "4.6915484"),
                6039,
                6
            ),
            Commune(
                217,
                "القصر",
                "El Kseur",
                LatLng("36.6775642", "4.849324399999999"),
                6040,
                6
            ),
            Commune(
                218,
                "ملبو",
                "Melbou",
                LatLng("36.62827469999999", "5.383485400000001"), 6041,
                6
            ),
            Commune(
                219,
                "اكفادو",
                "Akfadou",
                LatLng("36.6307165", "4.6243989"),
                6042,
                6
            ),
            Commune(
                220,
                "لفلاى",
                "Leflaye",
                LatLng("36.6090298", "4.6714261"),
                6043,
                6
            ),
            Commune(
                221,
                "خراطة",
                "Kherrata",
                LatLng("36.49313770000001", "5.2781276"),
                6044,
                6
            ),
            Commune(
                222,
                "دراع قايد",
                "Draa Kaid",
                LatLng("36.417449", "5.227276"),
                6045,
                6
            ),
            Commune(
                223,
                "تامريجت",
                "Tamridjet",
                LatLng("36.5833119", "5.4253757"),
                6046,
                6
            ),
            Commune(
                224,
                "آيت سماعيل",
                "Ait Smail",
                LatLng("36.5463433", "5.2302325"),
                6047,
                6
            ),
            Commune(
                225,
                "بوخليفة",
                "Boukhelifa",
                LatLng("36.6698411", "5.0880839"),
                6048,
                6
            ),
            Commune(
                226,
                "تيزى نبربر",
                "Tizi Nberber",
                LatLng("36.6134619", "5.217631699999999"), 6049,
                6
            ),
            Commune(
                227,
                "بني معوش",
                "Beni Maouch",
                LatLng("36.50707850000001", "4.7578312"), 6050,
                6
            ),
            Commune(
                228,
                "وادي غير",
                "Oued Ghir",
                LatLng("36.7093915", "4.9795489"),
                6051,
                6
            ),
            Commune(
                229,
                "بوجليل",
                "Boudjellil",
                LatLng("36.3506738", "4.4111706"),
                6052,
                6
            ),
            Commune(
                230,
                "بسكرة",
                "Biskra",
                LatLng("34.8519835", "5.7314421"),
                7001,
                7
            ),
            Commune(
                231,
                "أوماش",
                "Oumache",
                LatLng("34.5936352", "5.772120399999999"),
                7002,
                7
            ),
            Commune(
                232,
                "البرانس",
                "Branis",
                LatLng("34.9669667", "5.7932008"),
                7003,
                7
            ),
            Commune(
                233,
                "شتمة",
                "Chetma",
                LatLng("34.87499", "5.8775964"),
                7004,
                7
            ),
            Commune(
                234,
                "أولاد جلال",
                "Ouled Djellal",
                LatLng("34.4466834", "5.1015225"), 7005,
                7
            ),
            Commune(
                235,
                "راس الميعاد",
                "Ras El Miaad",
                LatLng("33.97673169999999", "4.645034999999999"), 7006,
                7
            ),
            Commune(
                236,
                "بسباس",
                "Besbes",
                LatLng("34.1415665", "4.976654"),
                7007,
                7
            ),
            Commune(
                237,
                "سيدي خالد",
                "Sidi Khaled",
                LatLng("34.3862694", "4.955869600000001"), 7008,
                7
            ),
            Commune(
                238,
                "الدوسن",
                "Doucen",
                LatLng("34.6234715", "5.101522500000001"),
                7009,
                7
            ),
            Commune(
                239,
                "أولاد رحمة",
                "Ech Chaiba",
                LatLng("34.679416", "4.810595500000001"), 7010,
                7
            ),
            Commune(
                240,
                "سيدي عقبة",
                "Sidi Okba",
                LatLng("34.7849283", "5.9198387"),
                7011,
                7
            ),
            Commune(
                241,
                "مشونش",
                "Mchouneche",
                LatLng("34.9337006", "6.0255738"),
                7012,
                7
            ),
            Commune(
                242,
                "الحوش",
                "El Haouch",
                LatLng("34.5813972", "6.025573800000001"),
                7013,
                7
            ),
            Commune(
                243,
                "عين الناقة",
                "Ain Naga",
                LatLng("34.6611164", "6.195131999999999"), 7014,
                7
            ),
            Commune(
                244,
                "زريبة الوادي",
                "Zeribet El Oued",
                LatLng("34.6878171", "6.5038787"), 7015,
                7
            ),
            Commune(
                245,
                "الفيض",
                "El Feidh",
                LatLng("34.4668996", "6.5356449"),
                7016,
                7
            ),
            Commune(
                246,
                "القنطرة",
                "El Kantara",
                LatLng("35.192365", "5.666830600000001"), 7017,
                7
            ),
            Commune(
                247,
                "عين زعطوط",
                "Ain Zaatout",
                LatLng("35.1843701", "5.835383699999999"), 7018,
                7
            ),
            Commune(
                248,
                "لوطاية",
                "El Outaya",
                LatLng("34.9768124", "5.5827334"),
                7019,
                7
            ),
            Commune(
                249,
                "جمورة",
                "Djemorah",
                LatLng("35.1026843", "5.7089241"),
                7020,
                7
            ),
            Commune(
                250,
                "طولقة",
                "Tolga",
                LatLng("34.7291803", "5.3802134"),
                7021,
                7
            ),
            Commune(
                251,
                "لواء",
                "Lioua",
                LatLng("34.636809", "5.396132300000001"),
                7022,
                7
            ),
            Commune(
                252,
                "لشانة",
                "Lichana",
                LatLng("34.75287350000001", "5.4253757"),
                7023,
                7
            ),
            Commune(
                253,
                "أورلال",
                "Ourlal",
                LatLng("34.5381104", "5.5407299"),
                7024,
                7
            ),
            Commune(
                254,
                "مليلي",
                "Mlili",
                LatLng("34.5784354", "5.624766999999999"),
                7025,
                7
            ),
            Commune(
                255,
                "فوغالة",
                "Foughala",
                LatLng("34.7583947", "5.299795899999999"),
                7026,
                7
            ),
            Commune(
                256,
                "برج بن عزوز",
                "Bordj Ben Azzouz",
                LatLng("34.7062854", "5.3573194"), 7027,
                7
            ),
            Commune(
                257,
                "مزيرعة",
                "Meziraa",
                LatLng("34.8328954", "6.2800864"),
                7028,
                7
            ),
            Commune(
                258,
                "بوشقرون",
                "Bouchagroun",
                LatLng("34.72082810000001", "5.4665823"), 7029,
                7
            ),
            Commune(
                259,
                "مخادمة",
                "Mekhadma",
                LatLng("34.5533941", "5.4463322"),
                7030,
                7
            ),
            Commune(
                260,
                "الغروس",
                "El Ghrous",
                LatLng("34.70581900000001", "5.284393"),
                7031,
                7
            ),
            Commune(
                261,
                "الحاجب",
                "El Hadjab",
                LatLng("34.7989056", "5.624766999999999"), 7032,
                7
            ),
            Commune(
                262,
                "خنڨة سيدي ناجي",
                "Khanguet Sidinadji",
                LatLng("34.821721", "6.6958939"), 7033,
                7
            ),
            Commune(
                263,
                "بشار",
                "Bechar",
                LatLng("31.6167026", "-2.2194864"),
                8001,
                8
            ),
            Commune(
                264,
                "العبادلة",
                "Erg Ferradj",
                LatLng("31.0354027", "-2.79197"),
                8002,
                8
            ),
            Commune(
                265,
                "أولاد خدير",
                "Ouled Khoudir",
                LatLng("29.2555013", "-1.0598107"), 8003,
                8
            ),
            Commune(
                266,
                "مريجة",
                "Meridja",
                LatLng("31.5517416", "-2.945068"),
                8004,
                8
            ),
            Commune(
                267,
                "تيمودى",
                "Timoudi",
                LatLng("29.3188506", "-1.1269073"),
                8005,
                8
            ),
            Commune(
                268,
                "لحمر",
                "Lahmar",
                LatLng("31.9330162", "-2.2581158"),
                8006,
                8
            ),
            Commune(
                269,
                "بني عباس",
                "Beni Abbes",
                LatLng("30.1324686", "-2.1671288"),
                8007,
                8
            ),
            Commune(
                270,
                "بني يخلف",
                "Beni Ikhlef",
                LatLng("29.580219", "-1.604054"),
                8008,
                8
            ),
            Commune(
                271,
                "مشراع هوراي ب",
                "Mechraa Houari B",
                LatLng("30.932220", "-2.737500"), 8009,
                8
            ),
            Commune(
                272,
                "القنادسة",
                "Kenedsa",
                LatLng("31.5569451", "-2.4233417"),
                8010,
                8
            ),
            Commune(
                273,
                "إقلي",
                "Igli",
                LatLng("30.452471", "-2.2907524"),
                8011,
                8
            ),
            Commune(
                274,
                "تبلبالة",
                "Tabalbala",
                LatLng("29.4055402", "-3.2557384"),
                8012,
                8
            ),
            Commune(
                275,
                "تــــاغـيــث",
                "Taghit",
                LatLng("30.92010579999999", "-2.032217199999999"), 8013,
                8
            ),
            Commune(
                276,
                "الوطى",
                "El Ouata",
                LatLng("29.8515849", "-1.8269573"),
                8014,
                8
            ),
            Commune(
                277,
                "بوكايس",
                "Boukais",
                LatLng("31.923019", "-2.462650999999999"),
                8015,
                8
            ),
            Commune(
                278,
                "موغل",
                "Mogheul",
                LatLng("32.023248", "-2.2175179"),
                8016,
                8
            ),
            Commune(
                279,
                "العبادلة",
                "Abadla",
                LatLng("31.0102291", "-2.7431421"),
                8017,
                8
            ),
            Commune(
                280,
                "كرزاز",
                "Kerzaz",
                LatLng("29.4624252", "-1.4386366"),
                8018,
                8
            ),
            Commune(
                281,
                "قصابى",
                "Ksabi",
                LatLng("29.1006615", "-0.9725085"),
                8019,
                8
            ),
            Commune(
                282,
                "تامترت",
                "Tamtert",
                LatLng("29.91666699999999", "-1.899999999999999"), 8020,
                8
            ),
            Commune(
                283,
                "بني ونيف",
                "Beni Ounif",
                LatLng("32.0492426", "-1.2457898"),
                8021,
                8
            ),
            Commune(
                284,
                "البليدة‎",
                "Blida",
                LatLng("36.4757929", "2.8297576"),
                9001,
                9
            ),
            Commune(
                285,
                "ولاية البليدة",
                "Chebli",
                LatLng("36.5291612", "2.9775558"),
                9002,
                9
            ),
            Commune(
                286,
                "بوعينان",
                "Bouinan",
                LatLng("36.5181119", "2.9875565"),
                9003,
                9
            ),
            Commune(
                287,
                "واد العلايڨ",
                "Oued El Alleug",
                LatLng("36.5665832", "2.7680247"), 9004,
                9
            ),
            Commune(
                288,
                "اولاد يعيش",
                "Ouled Yaich",
                LatLng("36.5047206", "2.8726747"),
                9007,
                9
            ),
            Commune(
                289,
                "البليدة‎",
                "Chrea",
                LatLng("36.4757929", "2.8297576"),
                9008,
                9
            ),
            Commune(
                290,
                "العفرون",
                "El Affroun",
                LatLng("36.4604696", "2.6297844"),
                9010,
                9
            ),
            Commune(
                291,
                "الشفة",
                "Chiffa",
                LatLng("36.4594664", "2.728219"),
                9011,
                9
            ),
            Commune(
                292,
                "حمام ملوان",
                "Hammam Melouane",
                LatLng("36.4205919", "2.997559299999999"), 9012,
                9
            ),
            Commune(
                293,
                "بني خليل",
                "Ben Khlil",
                LatLng("36.6078803", "2.847737"),
                9013,
                9
            ),
            Commune(
                294,
                "صومعة",
                "Soumaa",
                LatLng("36.4984753", "2.9076094"),
                9014,
                9
            ),
            Commune(
                295,
                "موزاية",
                "Mouzaia",
                LatLng("36.4713985", "2.6785092"),
                9016,
                9
            ),
            Commune(
                296,
                "صوحان",
                "Souhane",
                LatLng("36.5329164", "3.2483058"),
                9017,
                9
            ),
            Commune(
                297,
                "مفتاح",
                "Meftah",
                LatLng("36.6197872", "3.2281983"),
                9018,
                9
            ),
            Commune(
                298,
                "أولاد سلامة",
                "Ouled Selama",
                LatLng("36.5145296", "3.1277854"), 9019,
                9
            ),
            Commune(
                299,
                "بوفاريك",
                "Boufarik",
                LatLng("36.5848591", "2.907609399999999"), 9020,
                9
            ),
            Commune(
                300,
                "الاربعاء",
                "Larbaa",
                LatLng("36.5893036", "3.1578875"),
                9021,
                9
            ),
            Commune(
                301,
                "واد جر",
                "Oued Djer",
                LatLng("36.4201457", "2.5495112"),
                9022,
                9
            ),
            Commune(
                302,
                "بني تامو",
                "Beni Tamou",
                LatLng("36.5435922", "2.8277963"),
                9023,
                9
            ),
            Commune(
                303,
                "بوعرفة",
                "Bouarfa",
                LatLng("36.4254203", "2.797901"),
                9024,
                9
            ),
            Commune(
                304,
                "بني مراد",
                "Beni Mered",
                LatLng("36.5268016", "2.8527235"),
                9025,
                9
            ),
            Commune(
                305,
                "بوڨرة",
                "Bougara",
                LatLng("36.47183770000001", "3.1077277"),
                9026,
                9
            ),
            Commune(
                306,
                "ڨرواو",
                "Guerrouaou",
                LatLng("36.4828707", "2.8826534"),
                9027,
                9
            ),
            Commune(
                307,
                "عين الرمانة",
                "Ain Romana",
                LatLng("36.39635689999999", "2.6487087"), 9028,
                9
            ),
            Commune(
                308,
                "جبابرة",
                "Djebabra",
                LatLng("36.5810764", "3.2633918"),
                9029,
                9
            ),
            Commune(
                309,
                "البويرة",
                "Bouira",
                LatLng("36.3740224", "3.8989856"),
                10001,
                10
            ),
            Commune(
                310,
                "ولاية البويرة",
                "El Asnam",
                LatLng("36.37393179999999", "3.898756799999999"),
                10002,
                10
            ),
            Commune(
                311,
                "قرومة",
                "Guerrouma",
                LatLng("36.4630499", "3.4296446"),
                10003,
                10
            ),
            Commune(
                312,
                "سوق الخميس",
                "Souk El Khemis",
                LatLng("36.3882249", "3.637535"),
                10004,
                10
            ),
            Commune(
                313,
                "قادرية",
                "Kadiria",
                LatLng("36.52002450000001", "3.6927531"),
                10005,
                10
            ),
            Commune(
                314,
                "احنيف",
                "Hanif",
                LatLng("36.2541817", "4.212833700000001"),
                10006,
                10
            ),
            Commune(
                315,
                "ديــرة",
                "Dirah",
                LatLng("35.9997826", "3.754582800000001"),
                10007,
                10
            ),
            Commune(
                316,
                "آيت لعزيز",
                "Ait Laaziz",
                LatLng("36.4494403", "3.8757119"),
                10008,
                10
            ),
            Commune(
                317,
                "تاغزوت",
                "Taghzout",
                LatLng("36.4251625", "3.957237399999999"),
                10009,
                10
            ),
            Commune(
                318,
                "الروراوة",
                "Raouraoua",
                LatLng("36.2190042", "3.6319131"),
                10010,
                10
            ),
            Commune(
                319,
                "مسدور",
                "Mezdour",
                LatLng("36.0863547", "4.0491077"),
                10011,
                10
            ),
            Commune(
                320,
                "حيزر",
                "Haizer",
                LatLng("36.4328965", "4.0491077"),
                10012,
                10
            ),
            Commune(
                321,
                "الأخضرية",
                "Lakhdaria",
                LatLng("36.5662811", "3.591393899999999"),
                10013,
                10
            ),
            Commune(
                322,
                "معالة",
                "Maala",
                LatLng("36.4428933", "3.869348100000001"),
                10014,
                10
            ),
            Commune(
                323,
                "الھاشمية",
                "El Hachimia",
                LatLng("36.2199413", "3.8153696"),
                10015,
                10
            ),
            Commune(
                324,
                "أعمر",
                "Aomar",
                LatLng("36.495896", "3.7739869"),
                10016,
                10
            ),
            Commune(
                325,
                "الشرفاء",
                "Chorfa",
                LatLng("36.3691831", "4.3256918"),
                10017,
                10
            ),
            Commune(
                326,
                "برج أوخريص",
                "Bordj Oukhriss",
                LatLng("36.0817064", "3.9736961"),
                10018,
                10
            ),
            Commune(
                327,
                "العجيبة",
                "El Adjiba",
                LatLng("36.3749965", "4.161614299999999"),
                10019,
                10
            ),
            Commune(
                328,
                "الحاكمية",
                "El Hakimia",
                LatLng("36.09149209999999", "3.7801961"),
                10020,
                10
            ),
            Commune(
                329,
                "الخبوزية",
                "El Khebouzia",
                LatLng("36.3174072", "3.6015207"),
                10021,
                10
            ),
            Commune(
                330,
                "أھل القصر",
                "Ahl El Ksar",
                LatLng("36.25982099999999", "4.049107699999999"),
                10022,
                10
            ),
            Commune(
                331,
                "بودربالة",
                "Bouderbala",
                LatLng("36.56927609999999", "3.4902391"),
                10023,
                10
            ),
            Commune(
                332,
                "زبربر",
                "Zbarbar",
                LatLng("36.4817207", "3.5306765"),
                10024,
                10
            ),
            Commune(
                333,
                "عين الحجر",
                "Ain El Hadjar",
                LatLng("36.36556369999999", "3.794315699999999"),
                10025,
                10
            ),
            Commune(
                334,
                "الجباحية",
                "Djebahia",
                LatLng("36.454596", "3.7130493"),
                10026,
                10
            ),
            Commune(
                335,
                "أغبالو",
                "Aghbalou",
                LatLng("36.43328009999999", "4.346237299999999"),
                10027,
                10
            ),
            Commune(
                336,
                "تاڨديت",
                "Taguedit",
                LatLng("35.9811329", "3.9470396"),
                10028,
                10
            ),
            Commune(
                337,
                "عين الترك",
                "Ain Turk",
                LatLng("36.40817209999999", "3.814652599999999"),
                10029,
                10
            ),
            Commune(
                338,
                "الصهاريج",
                "Saharidj",
                LatLng("36.4257962", "4.2538452"),
                10030,
                10
            ),
            Commune(
                339,
                "الدشمية",
                "Dechmia",
                LatLng("36.1305919", "3.576597699999999"),
                10031,
                10
            ),
            Commune(
                340,
                "ريدان",
                "Ridane",
                LatLng("36.0738504", "3.4619838"),
                10032,
                10
            ),
            Commune(
                341,
                "بشلول",
                "Bechloul",
                LatLng("36.3450193", "4.0899911"),
                10033,
                10
            ),
            Commune(
                342,
                "بوكرام",
                "Boukram",
                LatLng("36.5295755", "3.3691241"),
                10034,
                10
            ),
            Commune(
                343,
                "عين بسام",
                "Ain Bessam",
                LatLng("36.40023829999999", "3.723200499999999"),
                10035,
                10
            ),
            Commune(
                344,
                "بئر غبالو",
                "Bir Ghbalou",
                LatLng("36.2641708", "3.5711466"),
                10036,
                10
            ),
            Commune(
                345,
                "مشدا الله",
                "Mchedallah",
                LatLng("36.3713916", "4.264103"),
                10037,
                10
            ),
            Commune(
                346,
                "سور الغزلان",
                "Sour El Ghozlane",
                LatLng("36.14922309999999", "3.690155199999999"),
                10038,
                10
            ),
            Commune(
                347,
                "المعمورة",
                "Maamora",
                LatLng("36.03356669999999", "3.551855"),
                10039,
                10
            ),
            Commune(
                348,
                "أولاد راشد",
                "Ouled Rached",
                LatLng("36.1717506", "4.0899911"),
                10040,
                10
            ),
            Commune(
                349,
                "عين العلوي",
                "Ain Laloui",
                LatLng("36.3019154", "3.753666299999999"),
                10041,
                10
            ),
            Commune(
                350,
                "الحجرة الزرقاء",
                "Hadjera Zerga",
                LatLng("35.9191859", "3.845173100000001"),
                10042,
                10
            ),
            Commune(
                351,
                "آث منصور",
                "Ath Mansour",
                LatLng("36.2945728", "4.2948884"),
                10043,
                10
            ),
            Commune(
                352,
                "المقراني",
                "El Mokrani",
                LatLng("36.4360848", "3.6116494"),
                10044,
                10
            ),
            Commune(
                353,
                "وادى البردي",
                "Oued El Berdi",
                LatLng("36.2638925", "3.9266502"),
                10045,
                10
            ),
            Commune(
                354,
                "تمنراست",
                "Tamanghasset",
                LatLng("22.7888209", "5.525810699999999"),
                11001,
                11
            ),
            Commune(
                355,
                "أبليسة",
                "Abalessa",
                LatLng("22.7269444", "6.0052778"),
                11002,
                11
            ),
            Commune(
                356,
                "عـيـن غــار",
                "In Ghar",
                LatLng("27.1077421", "1.9050391"),
                11003,
                11
            ),
            Commune(
                357,
                "عين قزام",
                "In Guezzam",
                LatLng("19.5708544", "5.769384700000001"),
                11004,
                11
            ),
            Commune(
                358,
                "إدلس",
                "Idles",
                LatLng("23.8173973", "5.934366400000001"),
                11005,
                11
            ),
            Commune(
                359,
                "تازروق",
                "Tazrouk",
                LatLng("23.42251", "6.260949"),
                11006,
                11
            ),
            Commune(
                360,
                "تين زاوتين",
                "Tinzaouatine",
                LatLng("20.6784913", "3.4195527"),
                11007,
                11
            ),
            Commune(
                361,
                "عين صالح",
                "In Salah",
                LatLng("27.1927769", "2.4851463"),
                11008,
                11
            ),
            Commune(
                362,
                "ان أمقل",
                "In Amguel",
                LatLng("24.4857286", "3.4195527"),
                11009,
                11
            ),
            Commune(
                363,
                "فقارة الزاوية",
                "Foggaret Ezzaouia",
                LatLng("27.35923009999999", "2.845243899999999"),
                11010,
                11
            ),
            Commune(
                364,
                "تبسة‎",
                "Tebessa",
                LatLng("35.4142494", "8.101092000000001"),
                12001,
                12
            ),
            Commune(
                365,
                "بئر العاتر",
                "Bir El Ater",
                LatLng("34.7610886", "8.057429899999999"),
                12002,
                12
            ),
            Commune(
                366,
                "الــشــريــعـة",
                "Cheria",
                LatLng("35.2684831", "7.7471025"),
                12003,
                12
            ),
            Commune(
                367,
                "صطح غنطيس",
                "Stah Guentis",
                LatLng("34.998400", "7.308290"),
                12004,
                12
            ),
            Commune(
                368,
                "العوينات",
                "El Aouinet",
                LatLng("35.86580560000001", "7.885766500000001"),
                12005,
                12
            ),
            Commune(
                369,
                "الحويجبات",
                "Lahouidjbet",
                LatLng("35.2917478", "8.2801065"),
                12006,
                12
            ),
            Commune(
                370,
                "صفصاف الوسرة",
                "Safsaf El Ouesra",
                LatLng("34.9565856", "8.2076282"),
                12007,
                12
            ),
            Commune(
                371,
                "الحمامات",
                "Hammamet",
                LatLng("35.4512851", "7.953837799999999"),
                12008,
                12
            ),
            Commune(
                372,
                "نقرين",
                "Negrine",
                LatLng("34.4820138", "7.5193093"),
                12009,
                12
            ),
            Commune(
                373,
                "بــئــر مــقـدم",
                "Bir El Mokadem",
                LatLng("35.3708248", "7.8096037"),
                12010,
                12
            ),
            Commune(
                374,
                "الكويف",
                "El Kouif",
                LatLng("35.4998244", "8.3225325"),
                12011,
                12
            ),
            Commune(
                375,
                "مرسط",
                "Morsott",
                LatLng("35.6676901", "8.0110677"),
                12012,
                12
            ),
            Commune(
                376,
                "العقلة",
                "El Ogla",
                LatLng("35.183333", "7.466666999999999"),
                12013,
                12
            ),
            Commune(
                377,
                "بير ذهاب",
                "Bir Dheheb",
                LatLng("35.525390", "7.938382"),
                12014,
                12
            ),
            Commune(
                378,
                "العقلة المالحة",
                "El Ogla El Malha",
                LatLng("35.121940", "7.951111"),
                12015,
                12
            ),
            Commune(
                379,
                "غوريغر",
                "Gorriguer",
                LatLng("35.400134", "8.116942"),
                12016,
                12
            ),
            Commune(
                380,
                "بكارية",
                "Bekkaria",
                LatLng("35.366667", "8.25"),
                12017,
                12
            ),
            Commune(
                381,
                "بوخضرة",
                "Boukhadra",
                LatLng("35.7476345", "8.032881499999998"),
                12018,
                12
            ),
            Commune(
                382,
                "الونزة",
                "Ouenza",
                LatLng("35.9489963", "8.1393179"),
                12019,
                12
            ),
            Commune(
                383,
                "الماء الأبيض",
                "El Ma El Biodh",
                LatLng("35.2051832", "8.169366599999998"),
                12020,
                12
            ),
            Commune(
                384,
                "أم على",
                "Oum Ali",
                LatLng("35.0104461", "8.300632199999999"),
                12021,
                12
            ),
            Commune(
                385,
                "ثليجين",
                "Thlidjene",
                LatLng("35.400013", "8.116964"),
                12022,
                12
            ),
            Commune(
                386,
                "عين الزرقاء",
                "Ain Zerga",
                LatLng("35.633333", "8.266667000000002"),
                12023,
                12
            ),
            Commune(
                387,
                "المريج",
                "El Meridj",
                LatLng("35.7939476", "8.229500900000001"),
                12024,
                12
            ),
            Commune(
                388,
                "بولهاف دير",
                "Boulhaf Dyr",
                LatLng("35.488258", "8.073376"),
                12025,
                12
            ),
            Commune(
                389,
                "بجن",
                "Bedjene",
                LatLng("35.3497731", "7.4746519"),
                12026,
                12
            ),
            Commune(
                390,
                "المزيرعة",
                "El Mazeraa",
                LatLng("35.400000", "8.117000"),
                12027,
                12
            ),
            Commune(
                391,
                "فـــــــركـــــان",
                "Ferkane",
                LatLng("34.5576609", "7.408395799999999"),
                12028,
                12
            ),
            Commune(
                392,
                "تلمسان",
                "Tlemcen",
                LatLng("34.88840620000001", "-1.3180042"),
                13001,
                13
            ),
            Commune(
                393,
                "بني مستار",
                "Beni Mester",
                LatLng("34.8650364", "-1.4338047"),
                13002,
                13
            ),
            Commune(
                394,
                "عين تيلوت",
                "Ain Tallout",
                LatLng("34.92211040000001", "-0.9557866999999998"),
                13003,
                13
            ),
            Commune(
                395,
                "الرمشي",
                "Remchi",
                LatLng("35.0579657", "-1.4289734"),
                13004,
                13
            ),
            Commune(
                396,
                "الفحول",
                "El Fehoul",
                LatLng("35.1158895", "-1.2927151"),
                13005,
                13
            ),
            Commune(
                397,
                "صبرة",
                "Sabra",
                LatLng("34.82802569999999", "-1.5281253"),
                13006,
                13
            ),
            Commune(
                398,
                "الغزوات",
                "Ghazaouet",
                LatLng("35.0962252", "-1.8562218"),
                13007,
                13
            ),
            Commune(
                399,
                "السواني",
                "Souani",
                LatLng("34.9218192", "-1.9172519"),
                13008,
                13
            ),
            Commune(
                400,
                "جبالة",
                "Djebala",
                LatLng("34.9592459", "-1.8123324"),
                13009,
                13
            ),
            Commune(
                401,
                "الغور",
                "El Gor",
                LatLng("34.63321949999999", "-1.1520965"),
                13010,
                13
            ),
            Commune(
                402,
                "واد شولي",
                "Oued Chouly",
                LatLng("34.8290775", "-1.1714782"),
                13011,
                13
            ),
            Commune(
                403,
                "عين فزّة",
                "Ain Fezza",
                LatLng("34.8768632", "-1.2349683"),
                13012,
                13
            ),
            Commune(
                404,
                "أولاد ميمون",
                "Ouled Mimoun",
                LatLng("34.9049444", "-1.0322845"),
                13013,
                13
            ),
            Commune(
                405,
                "أميور",
                "Amieur",
                LatLng("35.03528", "-1.24"),
                13014,
                13
            ),
            Commune(
                406,
                "عين يوسف",
                "Ain Youcef",
                LatLng("35.0477582", "-1.375051"),
                13015,
                13
            ),
            Commune(
                407,
                "زناتة",
                "Zenata",
                LatLng("35.0123044", "-1.4479374"),
                13016,
                13
            ),
            Commune(
                408,
                "بنى سنوس",
                "Beni Snous",
                LatLng("34.6593136", "-1.5450766"),
                13017,
                13
            ),
            Commune(
                409,
                "باب العسة",
                "Bab El Assa",
                LatLng("34.9640856", "-2.029768"),
                13018,
                13
            ),
            Commune(
                410,
                "الجزائر",
                "Dar Yaghmouracene",
                LatLng("35.09615110000001", "-1.7973086"),
                13019,
                13
            ),
            Commune(
                411,
                "فلاوسن",
                "Fellaoucene",
                LatLng("35.0177005", "-1.5693045"),
                13020,
                13
            ),
            Commune(
                412,
                "أزايلس",
                "Azails",
                LatLng("34.686119", "-1.48692"),
                13021,
                13
            ),
            Commune(
                413,
                "سبعة شيوخ",
                "Sebbaa Chioukh",
                LatLng("35.15611", "-1.35583"),
                13022,
                13
            ),
            Commune(
                414,
                "ترني بني هديل",
                "Terni Beni Hediel",
                LatLng("34.795769", "-1.35755"),
                13023,
                13
            ),
            Commune(
                415,
                "بن سكران",
                "Bensekrane",
                LatLng("35.0739077", "-1.2289576"),
                13024,
                13
            ),
            Commune(
                416,
                "عين نحالة",
                "Ain Nehala",
                LatLng("35.0276866", "-0.9313136"),
                13025,
                13
            ),
            Commune(
                417,
                "الحناية",
                "Hennaya",
                LatLng("34.9484714", "-1.3710402"),
                13026,
                13
            ),
            Commune(
                418,
                "مغنية",
                "Maghnia",
                LatLng("34.8534497", "-1.7349661"),
                13027,
                13
            ),
            Commune(
                419,
                "حمام بوغرارة",
                "Hammam Boughrara",
                LatLng("34.8927177", "-1.6444975"),
                13028,
                13
            ),
            Commune(
                420,
                "تونان",
                "Souahlia",
                LatLng("35.04059530000001", "-1.8952713"),
                13029,
                13
            ),
            Commune(
                421,
                "مسيردة الفواقة",
                "Msirda Fouaga",
                LatLng("35.0160389", "-2.0518154"),
                13030,
                13
            ),
            Commune(
                422,
                "عين فاتح",
                "Ain Fetah",
                LatLng("34.965851", "-1.64545"),
                13031,
                13
            ),
            Commune(
                423,
                "العريشة",
                "El Aricha",
                LatLng("34.2190891", "-1.2554112"),
                13032,
                13
            ),
            Commune(
                424,
                "سوق الثلاثاء",
                "Souk Thlata",
                LatLng("35.0168536", "-2.002836"),
                13033,
                13
            ),
            Commune(
                425,
                "سيدي العبدلي",
                "Sidi Abdelli",
                LatLng("35.06383080000001", "-1.1329034"),
                13034,
                13
            ),
            Commune(
                426,
                "سبدو",
                "Sebdou",
                LatLng("34.6396882", "-1.332462"),
                13035,
                13
            ),
            Commune(
                427,
                "برج عريمة",
                "Beni Ouarsous",
                LatLng("35.08255099999999", "-1.5559775"),
                13036,
                13
            ),
            Commune(
                428,
                "سيدي مجاهد",
                "Sidi Medjahed",
                LatLng("34.7755299", "-1.6384287"),
                13037,
                13
            ),
            Commune(
                429,
                "بني بوسعيد",
                "Beni Boussaid",
                LatLng("34.64960589999999", "-1.7526648"),
                13038,
                13
            ),
            Commune(
                430,
                "مرسى بن مھيدي",
                "Marsa Ben Mhidi",
                LatLng("35.0823082", "-2.196618"),
                13039,
                13
            ),
            Commune(
                431,
                "ندرومة‎",
                "Nedroma",
                LatLng("35.0097474", "-1.7490143"),
                13040,
                13
            ),
            Commune(
                432,
                "سيدي الجيلالي",
                "Sidi Djillali",
                LatLng("34.4458733", "-1.5668811"),
                13041,
                13
            ),
            Commune(
                433,
                "بني بهدل",
                "Beni Bahdel",
                LatLng("34.71085889999999", "-1.5123907"),
                13042,
                13
            ),
            Commune(
                434,
                "البويهي",
                "El Bouihi",
                LatLng("34.23917", "-1.63444"),
                13043,
                13
            ),
            Commune(
                435,
                "هنين",
                "Honaine",
                LatLng("35.17893359999999", "-1.6493532"),
                13044,
                13
            ),
            Commune(
                436,
                "تيانت",
                "Tianet",
                LatLng("35.049167", "-1.840356"),
                13045,
                13
            ),
            Commune(
                437,
                "أولاد رياح",
                "Ouled Riyah",
                LatLng("34.96213539999999", "-1.4978716"),
                13046,
                13
            ),
            Commune(
                438,
                "بوحلو",
                "Bouhlou",
                LatLng("34.7777862", "-1.571728"),
                13047,
                13
            ),
            Commune(
                439,
                "سوق الخميس",
                "Souk El Khemis",
                LatLng("35.17259870000001", "-1.5565831"),
                13048,
                13
            ),
            Commune(
                440,
                "عين غرابة",
                "Ain Ghoraba",
                LatLng("34.7081886", "-1.3879292"),
                13049,
                13
            ),
            Commune(
                441,
                "شتوان",
                "Chetouane",
                LatLng("34.92033420000001", "-1.2975309"),
                13050,
                13
            ),
            Commune(
                442,
                "المنصورة",
                "Mansourah",
                LatLng("34.8659187", "-1.3565692"),
                13051,
                13
            ),
            Commune(
                443,
                "بني سميال",
                "Beni Semiel",
                LatLng("34.81667", "-1.02667"),
                13052,
                13
            ),
            Commune(
                444,
                "عين الكبيرة",
                "Ain Kebira",
                LatLng("35.0300112", "-1.6784986"),
                13053,
                13
            ),
            Commune(
                445,
                "تيارت‎",
                "Tiaret",
                LatLng("35.3673553", "1.3220322"),
                14001,
                14
            ),
            Commune(
                446,
                "مدروسة",
                "Medroussa",
                LatLng("35.1731543", "1.2049233"),
                14002,
                14
            ),
            Commune(
                447,
                "بوشقيف",
                "Ain Bouchekif",
                LatLng("35.3563885", "1.5136009"),
                14003,
                14
            ),
            Commune(
                448,
                "سيدي علي ملال",
                "Sidi Ali Mellal",
                LatLng("35.56373689999999", "1.2253693"),
                14004,
                14
            ),
            Commune(
                449,
                "عين زاريت",
                "Ain Zarit",
                LatLng("35.35303309999999", "1.6651379"),
                14005,
                14
            ),
            Commune(
                450,
                "عين الذهب",
                "Ain Deheb",
                LatLng("34.8471273", "1.5450766"),
                14006,
                14
            ),
            Commune(
                451,
                "سيدي بختي",
                "Sidi Bakhti",
                LatLng("35.23912", "0.977336"),
                14007,
                14
            ),
            Commune(
                452,
                "مدريسة",
                "Medrissa",
                LatLng("34.8919466", "1.2433848"),
                14008,
                14
            ),
            Commune(
                453,
                "زمالت المير أيك",
                "Zmalet El Emir Aek",
                LatLng("34.89333", "2.31"),
                14009,
                14
            ),
            Commune(
                454,
                "مادنا",
                "Madna",
                LatLng("34.8110952", "1.0028928"),
                14010,
                14
            ),
            Commune(
                455,
                "سبت",
                "Sebt",
                LatLng("35.61805", "1.35317"),
                14011,
                14
            ),
            Commune(
                456,
                "ملاكو",
                "Mellakou",
                LatLng("35.24978879999999", "1.2337661"),
                14012,
                14
            ),
            Commune(
                457,
                "دحموني",
                "Dahmouni",
                LatLng("35.4157148", "1.4759356"),
                14013,
                14
            ),
            Commune(
                458,
                "رحوية",
                "Rahouia",
                LatLng("35.5313694", "1.0227145"),
                14014,
                14
            ),
            Commune(
                459,
                "المهدية",
                "Mahdia",
                LatLng("35.4270876", "1.7587496"),
                14015,
                14
            ),
            Commune(
                460,
                "سوقر",
                "Sougueur",
                LatLng("35.17816009999999", "1.4966619"),
                14016,
                14
            ),
            Commune(
                461,
                "سيدي عبد الغاني",
                "Sidi Abdelghani",
                LatLng("35.232611", "1.633863"),
                14017,
                14
            ),
            Commune(
                462,
                "عين الحديد",
                "Ain El Hadid",
                LatLng("35.06041939999999", "0.8794310999999999"),
                14018,
                14
            ),
            Commune(
                463,
                "اولاد جراد",
                "Ouled Djerad",
                LatLng("35.370889", "1.321919"),
                14019,
                14
            ),
            Commune(
                464,
                "النعيمة",
                "Naima",
                LatLng("35.0917694", "1.4785205"),
                14020,
                14
            ),
            Commune(
                465,
                "مغلية",
                "Meghila",
                LatLng("35.3632425", "1.3270326"),
                14021,
                14
            ),
            Commune(
                466,
                "قرطوفة",
                "Guertoufa",
                LatLng("35.39221", "1.2578169"),
                14022,
                14
            ),
            Commune(
                467,
                "سيدي حسني",
                "Sidi Hosni",
                LatLng("35.4714207", "1.5184418"),
                14023,
                14
            ),
            Commune(
                468,
                "جيلالي بن عمار",
                "Djillali Ben Amar",
                LatLng("35.45472", "0.79185"),
                14024,
                14
            ),
            Commune(
                469,
                "سبعين",
                "Sebaine",
                LatLng("35.4580212", "1.6020337"),
                14025,
                14
            ),
            Commune(
                470,
                "توسنينة",
                "Tousnina",
                LatLng("35.1133168", "1.2758641"),
                14026,
                14
            ),
            Commune(
                471,
                "فرندة",
                "Frenda",
                LatLng("35.0617882", "1.0538252"),
                14027,
                14
            ),
            Commune(
                472,
                "عين كرمس",
                "Ain Kermes",
                LatLng("34.9238511", "1.0777723"),
                14028,
                14
            ),
            Commune(
                473,
                "قصر الشلالة",
                "Ksar Chellala",
                LatLng("35.2202319", "2.3172324"),
                14029,
                14
            ),
            Commune(
                474,
                "الرشايقة",
                "Rechaiga",
                LatLng("35.41012409999999", "1.9710284"),
                14030,
                14
            ),
            Commune(
                475,
                "نادورة",
                "Nadorah",
                LatLng("35.26973", "1.86167"),
                14031,
                14
            ),
            Commune(
                476,
                "تاقدمت",
                "Tagdemt",
                LatLng("35.3356113", "1.2283566"),
                14032,
                14
            ),
            Commune(
                477,
                "واد ليلى",
                "Oued Lilli",
                LatLng("35.51192899999999", "1.26705"),
                14033,
                14
            ),
            Commune(
                478,
                "مشرعة صافا",
                "Mechraa Safa",
                LatLng("35.38389", "1.05333"),
                14034,
                14
            ),
            Commune(
                479,
                "الحمادية",
                "Hamadia",
                LatLng("35.460979", "1.8733017"),
                14035,
                14
            ),
            Commune(
                480,
                "شحيمة",
                "Chehaima",
                LatLng("34.8982002", "1.3047556"),
                14036,
                14
            ),
            Commune(
                481,
                "تاخمرت",
                "Takhemaret",
                LatLng("35.1056992", "0.6844212999999999"),
                14037,
                14
            ),
            Commune(
                482,
                "سيدي عبدالرحمان",
                "Sidi Abderrahmane",
                LatLng("34.7992061", "1.1329034"),
                14038,
                14
            ),
            Commune(
                483,
                "سرغين",
                "Serghine",
                LatLng("35.2581419", "2.4826726"),
                14039,
                14
            ),
            Commune(
                484,
                "بوقرة",
                "Bougara",
                LatLng("35.5581085", "1.961246"),
                14040,
                14
            ),
            Commune(
                485,
                "فايجة",
                "Faidja",
                LatLng("35.1925", "1.58111"),
                14041,
                14
            ),
            Commune(
                486,
                "تيدة",
                "Tidda",
                LatLng("35.5824151", "1.266238"),
                14042,
                14
            ),
            Commune(
                487,
                "تيزي وزو",
                "Tizi Ouzou",
                LatLng("36.7118213", "4.0517169"),
                15001,
                15
            ),
            Commune(
                488,
                "عين الحمام",
                "Ain El Hammam",
                LatLng("36.56502019999999", "4.2846246"),
                15002,
                15
            ),
            Commune(
                489,
                "أقبيل",
                "Akbil",
                LatLng("36.4995515", "4.305154199999999"),
                15003,
                15
            ),
            Commune(
                490,
                "فريحة",
                "Freha",
                LatLng("36.7584263", "4.3177067"),
                15004,
                15
            ),
            Commune(
                491,
                "صوامع",
                "Souamaa",
                LatLng("36.6705552", "4.346237299999999"),
                15005,
                15
            ),
            Commune(
                492,
                "مشطراس",
                "Mechtrass",
                LatLng("36.5447993", "4.004930100000001"),
                15006,
                15
            ),
            Commune(
                493,
                "إرجن",
                "Irdjen",
                LatLng("36.6613077", "4.1496093"),
                15007,
                15
            ),
            Commune(
                494,
                "تيميزارت",
                "Timizart",
                LatLng("36.8024218", "4.2653984"),
                15008,
                15
            ),
            Commune(
                495,
                "ماكودة",
                "Makouda",
                LatLng("36.7920474", "4.0624151"),
                15009,
                15
            ),
            Commune(
                496,
                "ذراع الميزان",
                "Draa El Mizan",
                LatLng("36.5593675", "3.8146526"),
                15010,
                15
            ),
            Commune(
                497,
                "تيزي غنيف",
                "Tizi Ghenif",
                LatLng("36.5888512", "3.7760446"),
                15011,
                15
            ),
            Commune(
                498,
                "بونوح",
                "Bounouh",
                LatLng("36.4995751", "3.9364126"),
                15012,
                15
            ),
            Commune(
                499,
                "آيت شفعة",
                "Ait Chaffaa",
                LatLng("36.8221623", "4.525595499999999"),
                15013,
                15
            ),
            Commune(
                500,
                "فريقات",
                "Frikat",
                LatLng("36.4926443", "3.8757119"),
                15014,
                15
            ),
            Commune(
                501,
                "بني عيسي",
                "Beni Aissi",
                LatLng("36.6636279", "4.084878900000001"),
                15015,
                15
            ),
            Commune(
                502,
                "أيت زمنزر",
                "Beni Zmenzer",
                LatLng("36.636975", "4.039156"),
                15016,
                15
            ),
            Commune(
                503,
                "إيفرحونن",
                "Iferhounene",
                LatLng("36.5404761", "4.3667907"),
                15017,
                15
            ),
            Commune(
                504,
                "عزازقة",
                "Azazga",
                LatLng("36.7343859", "4.3667907"),
                15018,
                15
            ),
            Commune(
                505,
                "إيلولة أمالو",
                "Iloula Oumalou",
                LatLng("36.5805668", "4.442432"),
                15019,
                15
            ),
            Commune(
                506,
                "اعكورن",
                "Yakouren",
                LatLng("36.7339217", "4.438632899999999"),
                15020,
                15
            ),
            Commune(
                507,
                "الأربعاء نايت إيراثن",
                "Larba Nait Irathen",
                LatLng("36.63729319999999", "4.204093299999999"),
                15021,
                15
            ),
            Commune(
                508,
                "تيزي راشد",
                "Tizi Rached",
                LatLng("36.6784808", "4.2080419"),
                15022,
                15
            ),
            Commune(
                509,
                "زكري",
                "Zekri",
                LatLng("36.8015396", "4.583078899999999"),
                15023,
                15
            ),
            Commune(
                510,
                "واقنون",
                "Ouaguenoun",
                LatLng("36.7700939", "4.175088"),
                15024,
                15
            ),
            Commune(
                511,
                "عين الزاوية",
                "Ain Zaouia",
                LatLng("36.55044910000001", "3.8947975"),
                15025,
                15
            ),
            Commune(
                512,
                "مكيرة",
                "Mkira",
                LatLng("36.6305931", "3.7790684"),
                15026,
                15
            ),
            Commune(
                513,
                "أيت يحي",
                "Ait Yahia",
                LatLng("36.60666369999999", "4.325691799999999"),
                15027,
                15
            ),
            Commune(
                514,
                "أيت محمود",
                "Ait Mahmoud",
                LatLng("36.6077811", "4.1121615"),
                15028,
                15
            ),
            Commune(
                515,
                "المعاتقة",
                "Maatka",
                LatLng("36.6194358", "3.9572374"),
                15029,
                15
            ),
            Commune(
                516,
                "آيت بومھدى",
                "Ait Boumehdi",
                LatLng("36.4823272", "4.1820961"),
                15030,
                15
            ),
            Commune(
                517,
                "أبي يوسف",
                "Abi Youcef",
                LatLng("36.5389695", "4.3423883"),
                15031,
                15
            ),
            Commune(
                518,
                "بني دوالة",
                "Beni Douala",
                LatLng("36.62054", "4.0815246"),
                15032,
                15
            ),
            Commune(
                519,
                "إليلتن",
                "Illilten",
                LatLng("36.5161852", "4.394619799999999"),
                15033,
                15
            ),
            Commune(
                520,
                "بوزقن",
                "Bouzguen",
                LatLng("36.61413030000001", "4.4725912"),
                15034,
                15
            ),
            Commune(
                521,
                "أيت أقواشة",
                "Ait Aggouacha",
                LatLng("36.6096083", "4.243589300000001"),
                15035,
                15
            ),
            Commune(
                522,
                "واضية",
                "Ouadhia",
                LatLng("36.55597179999999", "4.0886525"),
                15036,
                15
            ),
            Commune(
                523,
                "أزفون",
                "Azzefoun",
                LatLng("36.8895311", "4.424015100000001"),
                15037,
                15
            ),
            Commune(
                524,
                "تقزيرت",
                "Tigzirt",
                LatLng("36.8905856", "4.1267837"),
                15038,
                15
            ),
            Commune(
                525,
                "آيت عيسى ميمون",
                "Ait Aissa Mimoun",
                LatLng("36.7486964", "4.1155596"),
                15039,
                15
            ),
            Commune(
                526,
                "بوغني",
                "Boghni",
                LatLng("36.5410545", "3.955875300000001"),
                15040,
                15
            ),
            Commune(
                527,
                "ايفيغاء",
                "Ifigha",
                LatLng("36.6717744", "4.413693299999999"),
                15041,
                15
            ),
            Commune(
                528,
                "آيت أومالو",
                "Ait Oumalou",
                LatLng("36.6586389", "4.2282093"),
                15042,
                15
            ),
            Commune(
                529,
                "ترمتين",
                "Tirmitine",
                LatLng("36.6756079", "3.9572785"),
                15043,
                15
            ),
            Commune(
                530,
                "أقرو",
                "Akerrou",
                LatLng("36.81736299999999", "4.449083599999999"),
                15044,
                15
            ),
            Commune(
                531,
                "يطافن",
                "Yatafen",
                LatLng("36.5274507", "4.2794935"),
                15045,
                15
            ),
            Commune(
                532,
                "بنى زيكى",
                "Beni Ziki",
                LatLng("36.562806", "4.5025157"),
                15046,
                15
            ),
            Commune(
                533,
                "ذراع بن خدة",
                "Draa Ben Khedda",
                LatLng("36.73096040000001", "3.9652509"),
                15047,
                15
            ),
            Commune(
                534,
                "واسيف",
                "Ouacif",
                LatLng("36.5188468", "4.2179584"),
                15048,
                15
            ),
            Commune(
                535,
                "آجر",
                "Idjeur",
                LatLng("36.6740411", "4.541814100000001"),
                15049,
                15
            ),
            Commune(
                536,
                "مقلع",
                "Mekla",
                LatLng("36.6735171", "4.264103"),
                15050,
                15
            ),
            Commune(
                537,
                "تيزي نثلاثة",
                "Tizi Nthlata",
                LatLng("36.5735762", "4.0388918"),
                15051,
                15
            ),
            Commune(
                538,
                "بني يني",
                "Beni Yenni",
                LatLng("36.5686516", "4.182096099999999"),
                15052,
                15
            ),
            Commune(
                539,
                "أغريب",
                "Aghrib",
                LatLng("36.8211575", "4.346237299999999"),
                15053,
                15
            ),
            Commune(
                540,
                "إفليسن",
                "Iflissen",
                LatLng("36.86855930000001", "4.2230836"),
                15054,
                15
            ),
            Commune(
                541,
                "بوجيمة",
                "Boudjima",
                LatLng("36.8069616", "4.1411406"),
                15055,
                15
            ),
            Commune(
                542,
                "أيت يحي موسى",
                "Ait Yahia Moussa",
                LatLng("36.6436636", "3.875711900000001"),
                15056,
                15
            ),
            Commune(
                543,
                "سوق الإثنين",
                "Souk El Thenine",
                LatLng("36.5909543", "4.003152099999999"),
                15057,
                15
            ),
            Commune(
                544,
                "أيت خليلي",
                "Ait Khelil",
                LatLng("36.6664742", "4.3102879"),
                15058,
                15
            ),
            Commune(
                545,
                "سيدي نعمان",
                "Sidi Naamane",
                LatLng("36.76882930000001", "3.998048500000001"),
                15059,
                15
            ),
            Commune(
                546,
                "أبودرارن",
                "Iboudraren",
                LatLng("36.5233354", "4.243589300000001"),
                15060,
                15
            ),
            Commune(
                547,
                "أقني قفران",
                "Aghni Goughran",
                LatLng("36.712297", "4.046086"),
                15061,
                15
            ),
            Commune(
                548,
                "مزرانة",
                "Mizrana",
                LatLng("36.852067", "4.079767299999999"),
                15062,
                15
            ),
            Commune(
                549,
                "إمسوحال",
                "Imsouhal",
                LatLng("36.5772781", "4.3924936"),
                15063,
                15
            ),
            Commune(
                550,
                "تادمايت",
                "Tadmait",
                LatLng("36.70763000000001", "3.8960811"),
                15064,
                15
            ),
            Commune(
                551,
                "تيزي وزو",
                "Ait Bouadou",
                LatLng("36.716667", "4.05"),
                15065,
                15
            ),
            Commune(
                552,
                "أسي يوسف",
                "Assi Youcef",
                LatLng("36.5043008", "4.013361"),
                15066,
                15
            ),
            Commune(
                553,
                "أيت تودرت",
                "Ait Toudert",
                LatLng("36.5262163", "4.1616143"),
                15067,
                15
            ),
            Commune(
                554,
                "الجزائر الوسطى",
                "Alger Centre",
                LatLng("36.7724841", "3.055115899999999"),
                16001,
                16
            ),
            Commune(
                555,
                "الجزائر",
                "Sidi Mhamed",
                LatLng("36.753768", "3.0587561"),
                16002,
                16
            ),
            Commune(
                556,
                "المدنية",
                "El Madania",
                LatLng("36.7411788", "3.068889599999999"),
                16003,
                16
            ),
            Commune(
                557,
                "بلوزداد",
                "Hamma Anassers",
                LatLng("36.7505682", "3.070142"),
                16004,
                16
            ),
            Commune(
                558,
                "باب الواد",
                "Bab El Oued",
                LatLng("36.7927594", "3.0513601"),
                16005,
                16
            ),
            Commune(
                559,
                "بولوغين",
                "Bologhine Ibn Ziri",
                LatLng("36.8052793", "3.0350884"),
                16006,
                16
            ),
            Commune(
                560,
                "القصبة",
                "Casbah",
                LatLng("36.78449610000001", "3.058872"),
                16007,
                16
            ),
            Commune(
                561,
                "وادي قريش",
                "Oued Koriche",
                LatLng("36.7836306", "3.0400945"),
                16008,
                16
            ),
            Commune(
                562,
                "بير مراد رايس",
                "Bir Mourad Rais",
                LatLng("36.7353493", "3.0503737"),
                16009,
                16
            ),
            Commune(
                563,
                "الآبيار",
                "El Biar",
                LatLng("36.7690092", "3.0309946"),
                16010,
                16
            ),
            Commune(
                564,
                "بوزريعة",
                "Bouzareah",
                LatLng("36.7816379", "3.0125674"),
                16011,
                16
            ),
            Commune(
                565,
                "بئر خادم",
                "Birkhadem",
                LatLng("36.7162726", "3.0425977"),
                16012,
                16
            ),
            Commune(
                566,
                "الحراش",
                "El Harrach",
                LatLng("36.70290469999999", "3.1428341"),
                16013,
                16
            ),
            Commune(
                567,
                "براقي",
                "Baraki",
                LatLng("36.6672951", "3.0985796"),
                16014,
                16
            ),
            Commune(
                568,
                "وادي سمار",
                "Oued Smar",
                LatLng("36.69934870000001", "3.1754557"),
                16015,
                16
            ),
            Commune(
                569,
                "بوروبة",
                "Bourouba",
                LatLng("36.7117069", "3.1152484"),
                16016,
                16
            ),
            Commune(
                570,
                "حسين داي",
                "Hussein Dey",
                LatLng("36.744147", "3.1102345"),
                16017,
                16
            ),
            Commune(
                571,
                "القبة",
                "Kouba",
                LatLng("36.7266729", "3.0814946"),
                16018,
                16
            ),
            Commune(
                572,
                "باش جراح",
                "Bachedjerah",
                LatLng("36.72615059999999", "3.118008499999999"),
                16019,
                16
            ),
            Commune(
                573,
                "الدار البيضاء",
                "Dar El Beida",
                LatLng("36.70601449999999", "3.2281983"),
                16020,
                16
            ),
            Commune(
                574,
                "باب الزوار",
                "Bab Azzouar",
                LatLng("36.7206251", "3.1854975"),
                16021,
                16
            ),
            Commune(
                575,
                "بن عكنون",
                "Ben Aknoun",
                LatLng("36.7574811", "3.0100658"),
                16022,
                16
            ),
            Commune(
                576,
                "دالي ابراهيم",
                "Dely Ibrahim",
                LatLng("36.7528506", "2.980055800000001"),
                16023,
                16
            ),
            Commune(
                577,
                "باينز رومان",
                "Bains Romains",
                LatLng("36.8162039", "3.0019362"),
                16024,
                16
            ),
            Commune(
                578,
                "الرايس حميدو",
                "Rais Hamidou",
                LatLng("36.8112925", "3.0100658"),
                16025,
                16
            ),
            Commune(
                579,
                "جسر قسنطينة",
                "Djasr Kasentina",
                LatLng("36.69787759999999", "3.079262999999999"),
                16026,
                16
            ),
            Commune(
                580,
                "المرادية",
                "El Mouradia",
                LatLng("36.7497677", "3.0488564"),
                16027,
                16
            ),
            Commune(
                581,
                "حيدرة",
                "Hydra",
                LatLng("36.74095069999999", "3.0250778"),
                16028,
                16
            ),
            Commune(
                582,
                "المحمدية",
                "Mohammadia",
                LatLng("36.73495279999999", "3.1528692"),
                16029,
                16
            ),
            Commune(
                583,
                "برج الكيفان",
                "Bordj El Kiffan",
                LatLng("36.747187", "3.190432"),
                16030,
                16
            ),
            Commune(
                584,
                "المقرية",
                "El Magharia",
                LatLng("36.7319999", "3.1114879"),
                16031,
                16
            ),
            Commune(
                585,
                "بني مسوس",
                "Beni Messous",
                LatLng("36.782641", "2.9725563"),
                16032,
                16
            ),
            Commune(
                586,
                "الكليتوس",
                "Les Eucalyptus",
                LatLng("36.6645264", "3.1679257"),
                16033,
                16
            ),
            Commune(
                587,
                "بئر توتة",
                "Birtouta",
                LatLng("36.6460945", "3.0476046"),
                16034,
                16
            ),
            Commune(
                588,
                "تسالة المرجة",
                "Tassala El Merdja",
                LatLng("36.6222556", "2.9225893"),
                16035,
                16
            ),
            Commune(
                589,
                "أولاد الشبل",
                "Ouled Chebel",
                LatLng("36.6044691", "2.9875565"),
                16036,
                16
            ),
            Commune(
                590,
                "سيدي موسى",
                "Sidi Moussa",
                LatLng("36.6229795", "3.1077277"),
                16037,
                16
            ),
            Commune(
                591,
                "عين طاية",
                "Ain Taya",
                LatLng("36.7852529", "3.2835137"),
                16038,
                16
            ),
            Commune(
                592,
                "برج البحري",
                "Bordj El Bahri",
                LatLng("36.77913280000001", "3.2404681"),
                16039,
                16
            ),
            Commune(
                593,
                "المرسى",
                "Marsa",
                LatLng("36.8111249", "3.2448731"),
                16040,
                16
            ),
            Commune(
                594,
                "هراوة",
                "Haraoua",
                LatLng("36.7684157", "3.3086778"),
                16041,
                16
            ),
            Commune(
                595,
                "رويبة",
                "Rouiba",
                LatLng("36.72590909999999", "3.288545499999999"),
                16042,
                16
            ),
            Commune(
                596,
                "الرغاية",
                "Reghaia",
                LatLng("36.7431477", "3.3387368"),
                16043,
                16
            ),
            Commune(
                597,
                "عين بنيان",
                "Ain Benian",
                LatLng("36.7965083", "2.9337917"),
                16044,
                16
            ),
            Commune(
                598,
                "سطاوالي",
                "Staoueli",
                LatLng("36.7516507", "2.8881795"),
                16045,
                16
            ),
            Commune(
                599,
                "زرالدة",
                "Zeralda",
                LatLng("36.6946148", "2.8277963"),
                16046,
                16
            ),
            Commune(
                600,
                "محالمة",
                "Mahelma",
                LatLng("36.65054629999999", "2.8676861"),
                16047,
                16
            ),
            Commune(
                601,
                "رحمانية",
                "Rahmania",
                LatLng("36.6764115", "2.9126022"),
                16048,
                16
            ),
            Commune(
                602,
                "سويدانية",
                "Souidania",
                LatLng("36.70898320000001", "2.9026172"),
                16049,
                16
            ),
            Commune(
                603,
                "شراقة",
                "Cheraga",
                LatLng("36.7623459", "2.9225893"),
                16050,
                16
            ),
            Commune(
                604,
                "أولاد فايت",
                "Ouled Fayet",
                LatLng("36.7295502", "2.942569799999999"),
                16051,
                16
            ),
            Commune(
                605,
                "العاشور",
                "El Achour",
                LatLng("36.7285583", "2.9825559"),
                16052,
                16
            ),
            Commune(
                606,
                "درارية",
                "Draria",
                LatLng("36.7172858", "3.002561499999999"),
                16053,
                16
            ),
            Commune(
                607,
                "دويرة",
                "Douera",
                LatLng("36.6490943", "2.9275836"),
                16054,
                16
            ),
            Commune(
                608,
                "بابا حسن",
                "Baba Hassen",
                LatLng("36.6943775", "2.9731072"),
                16055,
                16
            ),
            Commune(
                609,
                "خرايسية",
                "Khracia",
                LatLng("36.6636569", "2.9925577"),
                16056,
                16
            ),
            Commune(
                610,
                "السحاولة",
                "Saoula",
                LatLng("36.6897194", "3.0275802"),
                16057,
                16
            ),
            Commune(
                611,
                "الجلفة‎",
                "Djelfa",
                LatLng("34.6703956", "3.2503761"),
                17001,
                17
            ),
            Commune(
                612,
                "موجبارة",
                "Moudjebara",
                LatLng("34.50491", "3.47031"),
                17002,
                17
            ),
            Commune(
                613,
                "القديد",
                "El Guedid",
                LatLng("34.643922", "2.613174"),
                17003,
                17
            ),
            Commune(
                614,
                "حاسي بحبح",
                "Hassi Bahbah",
                LatLng("35.07822850000001", "3.0275802"),
                17004,
                17
            ),
            Commune(
                615,
                "عين معبد",
                "Ain Maabed",
                LatLng("34.8056891", "3.1328011"),
                17005,
                17
            ),
            Commune(
                616,
                "سد رحال",
                "Sed Rahal",
                LatLng("33.9524075", "3.2256855"),
                17006,
                17
            ),
            Commune(
                617,
                "فيض البطمة",
                "Feidh El Botma",
                LatLng("34.5304864", "3.7816093"),
                17007,
                17
            ),
            Commune(
                618,
                "البيرين",
                "Birine",
                LatLng("35.62672159999999", "3.223172699999999"),
                17008,
                17
            ),
            Commune(
                619,
                "بويرة الأحداب",
                "Bouira Lahdeb",
                LatLng("35.2429194", "3.1403256"),
                17009,
                17
            ),
            Commune(
                620,
                "زكار",
                "Zaccar",
                LatLng("34.4316233", "3.3250413"),
                17010,
                17
            ),
            Commune(
                621,
                "الخميس",
                "El Khemis",
                LatLng("35.28806", "2.595"),
                17011,
                17
            ),
            Commune(
                622,
                "سيدي بايزيد",
                "Sidi Baizid",
                LatLng("35.0592433", "3.4321679"),
                17012,
                17
            ),
            Commune(
                623,
                "المليحية",
                "Mliliha",
                LatLng("34.71330509999999", "3.766365699999999"),
                17013,
                17
            ),
            Commune(
                624,
                "الإدريسية",
                "El Idrissia",
                LatLng("34.4548511", "2.5247449"),
                17014,
                17
            ),
            Commune(
                625,
                "الدويس",
                "Douis",
                LatLng("34.373924", "2.706634"),
                17015,
                17
            ),
            Commune(
                626,
                "حاسي العش",
                "Hassi El Euch",
                LatLng("35.1548428", "3.253333899999999"),
                17016,
                17
            ),
            Commune(
                627,
                "مسعد",
                "Messaad",
                LatLng("34.1536688", "3.495292"),
                17017,
                17
            ),
            Commune(
                628,
                "قتارة",
                "Guettara",
                LatLng("33.1610943", "4.6850858"),
                17018,
                17
            ),
            Commune(
                629,
                "سيدي لعجال",
                "Sidi Ladjel",
                LatLng("35.435674", "2.514841999999999"),
                17019,
                17
            ),
            Commune(
                630,
                "حد الصحاري",
                "Had Sahary",
                LatLng("35.3521531", "3.3615643"),
                17020,
                17
            ),
            Commune(
                631,
                "القرنيني",
                "Guernini",
                LatLng("35.2003683", "2.682235599999999"),
                17021,
                17
            ),
            Commune(
                632,
                "سلمانة",
                "Selmana",
                LatLng("34.1762857", "3.5991846"),
                17022,
                17
            ),
            Commune(
                633,
                "عين الشهداء",
                "Ain Chouhada",
                LatLng("34.2413281", "2.522269"),
                17023,
                17
            ),
            Commune(
                634,
                "ام العظام",
                "Oum Laadham",
                LatLng("33.7206099", "4.5302141"),
                17024,
                17
            ),
            Commune(
                635,
                "دار الشيوخ",
                "Dar Chouikh",
                LatLng("34.88665", "3.46699"),
                17025,
                17
            ),
            Commune(
                636,
                "الشارف",
                "Charef",
                LatLng("34.6176861", "2.8003916"),
                17026,
                17
            ),
            Commune(
                637,
                "بني يعقوب",
                "Beni Yacoub",
                LatLng("34.46667", "2.783333"),
                17027,
                17
            ),
            Commune(
                638,
                "الزعفران",
                "Zaafrane",
                LatLng("34.85397729999999", "2.850230199999999"),
                17028,
                17
            ),
            Commune(
                639,
                "جلول",
                "Deldoul",
                LatLng("34.20528", "3.25306"),
                17029,
                17
            ),
            Commune(
                640,
                "عين الابل",
                "Ain El Ibel",
                LatLng("34.35252639999999", "3.2256855"),
                17030,
                17
            ),
            Commune(
                641,
                "عين وسارة",
                "Ain Oussera",
                LatLng("35.4542653", "2.9076094"),
                17031,
                17
            ),
            Commune(
                642,
                "بنهار",
                "Benhar",
                LatLng("35.4859395", "3.0113166"),
                17032,
                17
            ),
            Commune(
                643,
                "حاسي فدول",
                "Hassi Fedoul",
                LatLng("35.44819", "1.8731"),
                17033,
                17
            ),
            Commune(
                644,
                "عمورة",
                "Amourah",
                LatLng("34.3547243", "3.8693481"),
                17034,
                17
            ),
            Commune(
                645,
                "عين افقة",
                "Ain Fekka",
                LatLng("35.4702472", "3.5407909"),
                17035,
                17
            ),
            Commune(
                646,
                "تعضميت",
                "Tadmit",
                LatLng("34.28333300000001", "2.983333"),
                17036,
                17
            ),
            Commune(
                647,
                "جيجل",
                "Jijel",
                LatLng("36.81673869999999", "5.749093299999998"),
                18001,
                18
            ),
            Commune(
                648,
                "إيرقان",
                "Erraguene",
                LatLng("36.58611", "5.58056"),
                18002,
                18
            ),
            Commune(
                649,
                "العوانة",
                "El Aouana",
                LatLng("36.7456809", "5.6352801"),
                18003,
                18
            ),
            Commune(
                650,
                "زيامة منصورية",
                "Ziamma Mansouriah",
                LatLng("36.63377980000001", "5.498756500000001"),
                18004,
                18
            ),
            Commune(
                651,
                "الطاهير",
                "Taher",
                LatLng("36.7753597", "5.909275399999999"),
                18005,
                18
            ),
            Commune(
                652,
                "الامير عبد القادر",
                "Emir Abdelkader",
                LatLng("36.77848669999999", "5.8459341"),
                18006,
                18
            ),
            Commune(
                653,
                "الشقفة",
                "Chekfa",
                LatLng("36.771582", "5.9581464"),
                18007,
                18
            ),
            Commune(
                654,
                "الشحنة",
                "Chahna",
                LatLng("36.6770779", "5.9548431"),
                18008,
                18
            ),
            Commune(
                655,
                "الميلية",
                "El Milia",
                LatLng("36.7507275", "6.285399900000001"),
                18009,
                18
            ),
            Commune(
                656,
                "سيدي معروف",
                "Sidi Maarouf",
                LatLng("36.6425914", "6.273445199999999"),
                18010,
                18
            ),
            Commune(
                657,
                "السطارة",
                "Settara",
                LatLng("36.71852519999999", "6.3359009"),
                18011,
                18
            ),
            Commune(
                658,
                "العنصر",
                "El Ancer",
                LatLng("36.798905", "6.1593269"),
                18012,
                18
            ),
            Commune(
                659,
                "سيدي عبد العزيز",
                "Sidi Abdelaziz",
                LatLng("36.8546552", "6.0526981"),
                18013,
                18
            ),
            Commune(
                660,
                "قاوس",
                "Kaous",
                LatLng("36.7406564", "5.7405139"),
                18014,
                18
            ),
            Commune(
                661,
                "غبالة",
                "Ghebala",
                LatLng("36.6284551", "6.387773399999999"),
                18015,
                18
            ),
            Commune(
                662,
                "بوراوي بلهادف",
                "Bouraoui Belhadef",
                LatLng("36.6977238", "6.104333599999999"),
                18016,
                18
            ),
            Commune(
                663,
                "جيملة",
                "Djmila",
                LatLng("36.58290780000001", "5.888154200000001"),
                18017,
                18
            ),
            Commune(
                664,
                "سلمى بن زيادة",
                "Selma Benziada",
                LatLng("36.6709346", "5.624766999999999"),
                18018,
                18
            ),
            Commune(
                665,
                "بوسيف أولاد اسكور",
                "Boussif Ouled Askeur",
                LatLng("36.64278", "6.01917"),
                18019,
                18
            ),
            Commune(
                666,
                "القنار",
                "El Kennar Nouchfi",
                LatLng("36.82568029999999", "5.962771399999999"),
                18020,
                18
            ),
            Commune(
                667,
                "أولاد يحيا خدروش",
                "Ouled Yahia Khadrouch",
                LatLng("36.71722", "6.20139"),
                18021,
                18
            ),
            Commune(
                668,
                "بودريعة بني ياجيس",
                "Boudria Beni Yadjis",
                LatLng("36.59856", "5.78602"),
                18022,
                18
            ),
            Commune(
                669,
                "قمير وادي عجول",
                "Kemir Oued Adjoul",
                LatLng("36.875058", "6.138237"),
                18023,
                18
            ),
            Commune(
                670,
                "تاكسنة",
                "Texena",
                LatLng("36.6649099", "5.7510475"),
                18024,
                18
            ),
            Commune(
                671,
                "الجمعة بني حبيبي",
                "Djemaa Beni Habibi",
                LatLng("36.8088666", "6.122217499999999"),
                18025,
                18
            ),
            Commune(
                672,
                "برج طاهر",
                "Bordj Taher",
                LatLng("36.74694", "6.03417"),
                18026,
                18
            ),
            Commune(
                673,
                "أولاد رابح",
                "Ouled Rabah",
                LatLng("36.6131401", "6.142094699999999"),
                18027,
                18
            ),
            Commune(
                674,
                "وجانة",
                "Ouadjana",
                LatLng("36.6904688", "5.8881542"),
                18028,
                18
            ),
            Commune(
                675,
                "سطيف‎",
                "Setif",
                LatLng("36.1969027", "5.415087100000001"),
                19001,
                19
            ),
            Commune(
                676,
                "عين الكبيرة",
                "Ain El Kebira",
                LatLng("36.3637833", "5.509246999999999"),
                19002,
                19
            ),
            Commune(
                677,
                "بني عزيز",
                "Beni Aziz",
                LatLng("36.4648323", "5.656311899999999"),
                19003,
                19
            ),
            Commune(
                678,
                "أولاد سيدي أحمد",
                "Ouled Sidi Ahmed",
                LatLng("35.901110", "5.191670"),
                19004,
                19
            ),
            Commune(
                679,
                "بوطالب",
                "Boutaleb",
                LatLng("35.69207659999999", "5.247551800000001"),
                19005,
                19
            ),
            Commune(
                680,
                "عين الروى",
                "Ain Roua",
                LatLng("36.3129898", "5.1953554"),
                19006,
                19
            ),
            Commune(
                681,
                "ذراع قبيلة",
                "Draa Kebila",
                LatLng("36.4379461", "4.997393899999999"),
                19007,
                19
            ),
            Commune(
                682,
                "بئر العرش",
                "Bir El Arch",
                LatLng("36.1016103", "5.7932008"),
                19008,
                19
            ),
            Commune(
                683,
                "بني شبانة",
                "Beni Chebana",
                LatLng("36.4764952", "4.903942400000001"),
                19009,
                19
            ),
            Commune(
                684,
                "أولاد تبــان",
                "Ouled Tebben",
                LatLng("35.7845851", "5.122360800000001"),
                19010,
                19
            ),
            Commune(
                685,
                "حــامة",
                "Hamma",
                LatLng("35.6865509", "5.373017600000001"),
                19011,
                19
            ),
            Commune(
                686,
                "معـاويـة",
                "Maaouia",
                LatLng("36.398105", "5.6983979"),
                19012,
                19
            ),
            Commune(
                687,
                "عين لڨراج",
                "Ain Legraj",
                LatLng("36.4096669", "4.891024199999999"),
                19013,
                19
            ),
            Commune(
                688,
                "عين عباسـة",
                "Ain Abessa",
                LatLng("36.2980641", "5.2893433"),
                19014,
                19
            ),
            Commune(
                689,
                "الدهامشة",
                "Dehamcha",
                LatLng("36.3692058", "5.624766999999999"),
                19015,
                19
            ),
            Commune(
                690,
                "بابور",
                "Babor",
                LatLng("36.46140159999999", "5.498756500000001"),
                19016,
                19
            ),
            Commune(
                691,
                "قجــال",
                "Guidjel",
                LatLng("36.0721187", "5.4987565"),
                19017,
                19
            ),
            Commune(
                692,
                "عين لحجـر",
                "Ain Lahdjar",
                LatLng("35.9372791", "5.541949700000001"),
                19018,
                19
            ),
            Commune(
                693,
                "بوسلام",
                "Bousselam",
                LatLng("36.4937653", "5.007845100000001"),
                19019,
                19
            ),
            Commune(
                694,
                "العلمة",
                "El Eulma",
                LatLng("36.1603006", "5.6983979"),
                19020,
                19
            ),
            Commune(
                695,
                "جميلـة",
                "Djemila",
                LatLng("36.3179676", "5.793200800000001"),
                19021,
                19
            ),
            Commune(
                696,
                "بني ورتيلان",
                "Beni Ouartilane",
                LatLng("36.44220550000001", "4.852528199999999"),
                19022,
                19
            ),
            Commune(
                697,
                "الرصفة",
                "Rosfa",
                LatLng("35.7791966", "5.247551800000001"),
                19023,
                19
            ),
            Commune(
                698,
                "أولاد عدوان",
                "Ouled Addouane",
                LatLng("36.344105", "5.4672962"),
                19024,
                19
            ),
            Commune(
                699,
                "البلاعة",
                "Belaa",
                LatLng("36.2273854", "5.8775964"),
                19025,
                19
            ),
            Commune(
                700,
                "عين أرنـات",
                "Ain Arnat",
                LatLng("36.1900716", "5.3163224"),
                19026,
                19
            ),
            Commune(
                701,
                "سطيف‎",
                "Amoucha",
                LatLng("36.194583", "5.4044819"),
                19027,
                19
            ),
            Commune(
                702,
                "عين ولمان",
                "Ain Oulmane",
                LatLng("35.9147478", "5.2976288"),
                19028,
                19
            ),
            Commune(
                703,
                "بيضاء برج",
                "Beidha Bordj",
                LatLng("35.8941421", "5.666313000000001"),
                19029,
                19
            ),
            Commune(
                704,
                "بوعنداس",
                "Bouandas",
                LatLng("36.5109283", "5.111940700000001"),
                19030,
                19
            ),
            Commune(
                705,
                "بازر الصخرة",
                "Bazer Sakhra",
                LatLng("36.0643003", "5.6668306"),
                19031,
                19
            ),
            Commune(
                706,
                "حمــام السخنة",
                "Hammam Essokhna",
                LatLng("35.96946399999999", "5.8353837"),
                19032,
                19
            ),
            Commune(
                707,
                "مزلوق",
                "Mezloug",
                LatLng("36.08336389999999", "5.2475518"),
                19033,
                19
            ),
            Commune(
                708,
                "بئر حدادة",
                "Bir Haddada",
                LatLng("35.9853448", "5.498756500000001"),
                19034,
                19
            ),
            Commune(
                709,
                "سرج الغول",
                "Serdj El Ghoul",
                LatLng("36.4678015", "5.593238999999999"),
                19035,
                19
            ),
            Commune(
                710,
                "حربيل",
                "Harbil",
                LatLng("36.3460467", "4.9247074"),
                19036,
                19
            ),
            Commune(
                711,
                "الأورسية",
                "El Ouricia",
                LatLng("36.2924521", "5.414900299999999"),
                19037,
                19
            ),
            Commune(
                712,
                "تيزي نبشار",
                "Tizi Nbechar",
                LatLng("36.4352238", "5.3625516"),
                19038,
                19
            ),
            Commune(
                713,
                "صـالح باي",
                "Salah Bey",
                LatLng("35.8171868", "5.373017600000001"),
                19039,
                19
            ),
            Commune(
                714,
                "عين أزال",
                "Ain Azal",
                LatLng("35.81847519999999", "5.513395200000001"),
                19040,
                19
            ),
            Commune(
                715,
                "ڨنزات",
                "Guenzet",
                LatLng("36.3286473", "4.8209596"),
                19041,
                19
            ),
            Commune(
                716,
                "التلة",
                "Talaifacene",
                LatLng("35.97554089999999", "5.7089241"),
                19042,
                19
            ),
            Commune(
                717,
                "بوقاعـة",
                "Bougaa",
                LatLng("36.3381987", "5.111940700000001"),
                19043,
                19
            ),
            Commune(
                718,
                "بني فودة",
                "Beni Fouda",
                LatLng("36.28474420000001", "5.5827334"),
                19044,
                19
            ),
            Commune(
                719,
                "تاشودة",
                "Tachouda",
                LatLng("36.2664729", "5.740513899999999"),
                19045,
                19
            ),
            Commune(
                720,
                "إيث موحلي",
                "Beni Mouhli",
                LatLng("36.51669589999999", "4.9096065"),
                19046,
                19
            ),
            Commune(
                721,
                "أولاد صـابر",
                "Ouled Sabor",
                LatLng("36.1568639", "5.540729900000001"),
                19047,
                19
            ),
            Commune(
                722,
                "قلال",
                "Guellal",
                LatLng("36.0363009", "5.3311652"),
                19048,
                19
            ),
            Commune(
                723,
                "عين السبت",
                "Ain Sebt",
                LatLng("36.48338989999999", "5.719452199999999"),
                19049,
                19
            ),
            Commune(
                724,
                "حمام قرقور",
                "Hammam Guergour",
                LatLng("36.3222675", "5.054854400000001"),
                19050,
                19
            ),
            Commune(
                725,
                "آيت نوال مزادة",
                "Ait Naoual Mezada",
                LatLng("36.542170", "5.090040"),
                19051,
                19
            ),
            Commune(
                726,
                "قصرالأبطال",
                "Ksar El Abtal",
                LatLng("35.9870878", "5.216228299999999"),
                19052,
                19
            ),
            Commune(
                727,
                "بني حسين",
                "Beni Hocine",
                LatLng("36.251687", "5.1119407"),
                19053,
                19
            ),
            Commune(
                728,
                "آيت تيزي",
                "Ait Tizi",
                LatLng("36.55315540000001", "5.1327829"),
                19054,
                19
            ),
            Commune(
                729,
                "موكلان",
                "Maouklane",
                LatLng("36.3966491", "5.0769287"),
                19055,
                19
            ),
            Commune(
                730,
                "القلتة الزرقاء",
                "Guelta Zerka",
                LatLng("36.20459160000001", "5.677351199999999"),
                19056,
                19
            ),
            Commune(
                731,
                "واد البارد",
                "Oued El Barad",
                LatLng("36.4971074", "5.4253757"),
                19057,
                19
            ),
            Commune(
                732,
                "طاية",
                "Taya",
                LatLng("35.959337", "5.966530300000001"),
                19058,
                19
            ),
            Commune(
                733,
                "الولجـة",
                "El Ouldja",
                LatLng("36.0520855", "5.9198387"),
                19059,
                19
            ),
            Commune(
                734,
                "التلة",
                "Tella",
                LatLng("35.97554089999999", "5.7089241"),
                19060,
                19
            ),
            Commune(
                735,
                "سعيدة",
                "Saida",
                LatLng("34.85103830000001", "0.1461237"),
                20001,
                20
            ),
            Commune(
                736,
                "دوى ثابت",
                "Doui Thabet",
                LatLng("34.8941184", "-0.07350880000000001"),
                20002,
                20
            ),
            Commune(
                737,
                "عين الحجر",
                "Ain El Hadjar",
                LatLng("34.7574087", "0.15418"),
                20003,
                20
            ),
            Commune(
                738,
                "أولاد خالد",
                "Ouled Khaled",
                LatLng("34.876700", "0.152778"),
                20004,
                20
            ),
            Commune(
                739,
                "مولاي العربي",
                "Moulay Larbi",
                LatLng("34.6497005", "0.0116586"),
                20005,
                20
            ),
            Commune(
                740,
                "يوب",
                "Youb",
                LatLng("34.92016100000001", "-0.2080547"),
                20006,
                20
            ),
            Commune(
                741,
                "حونت",
                "Hounet",
                LatLng("35.116390", "0.128330"),
                20007,
                20
            ),
            Commune(
                742,
                "يدي عمر",
                "Sidi Amar",
                LatLng("35.0249991", "0.1097315"),
                20008,
                20
            ),
            Commune(
                743,
                "مفتاح سيدي بوبكر",
                "Sidi Boubekeur",
                LatLng("35.0305441", "0.0536592"),
                20009,
                20
            ),
            Commune(
                744,
                "حساسنة",
                "El Hassasna",
                LatLng("34.8260947", "0.3301342"),
                20010,
                20
            ),
            Commune(
                745,
                "معمورة",
                "Maamora",
                LatLng("34.6818661", "0.4997973000000001"),
                20011,
                20
            ),
            Commune(
                746,
                "سيدي أحمد",
                "Sidi Ahmed",
                LatLng("34.54979479999999", "0.2596569999999999"),
                20012,
                20
            ),
            Commune(
                747,
                "عين سخونة",
                "Ain Sekhouna",
                LatLng("34.50444439999999", "0.8441666999999999"),
                20013,
                20
            ),
            Commune(
                748,
                "أولاد إبراهيم",
                "Ouled Brahim",
                LatLng("36.244484", "2.933548"),
                20014,
                20
            ),
            Commune(
                749,
                "تيرسين",
                "Tircine",
                LatLng("34.90116219999999", "0.5529666"),
                20015,
                20
            ),
            Commune(
                750,
                "عين سلطان",
                "Ain Soltane",
                LatLng("36.133048", "4.733379"),
                20016,
                20
            ),
            Commune(
                751,
                "سكيكدة",
                "Skikda",
                LatLng("36.8715199", "6.910180599999999"),
                21001,
                21
            ),
            Commune(
                752,
                "عين زويت",
                "Ain Zouit",
                LatLng("36.89122939999999", "6.7888879"),
                21002,
                21
            ),
            Commune(
                753,
                "الحدايق",
                "El Hadaik",
                LatLng("36.8259805", "6.8873791"),
                21003,
                21
            ),
            Commune(
                754,
                "عزابة",
                "Azzaba",
                LatLng("36.7441137", "7.1170952"),
                21004,
                21
            ),
            Commune(
                755,
                "جندل",
                "Djendel Saadi Mohamed",
                LatLng("36.7824999", "7.169598099999999"),
                21005,
                21
            ),
            Commune(
                756,
                "عين شرشار",
                "Ain Cherchar",
                LatLng("36.7336763", "7.223489900000001"),
                21006,
                21
            ),
            Commune(
                757,
                "بكوش لخضر",
                "Bekkouche Lakhdar",
                LatLng("36.700497", "7.305758099999998"),
                21007,
                21
            ),
            Commune(
                758,
                "بن عزوز",
                "Benazouz",
                LatLng("36.8658203", "7.296312400000001"),
                21008,
                21
            ),
            Commune(
                759,
                "السبت",
                "Es Sebt",
                LatLng("36.6599999", "7.069999999999999"),
                21009,
                21
            ),
            Commune(
                760,
                "القل",
                "Collo",
                LatLng("37.0013848", "6.554319899999999"),
                21010,
                21
            ),
            Commune(
                761,
                "بني زيد",
                "Beni Zid",
                LatLng("36.9318483", "6.480985399999999"),
                21011,
                21
            ),
            Commune(
                762,
                "كركرة",
                "Kerkera",
                LatLng("36.9313308", "6.587681699999999"),
                21012,
                21
            ),
            Commune(
                763,
                "أولاد عطية",
                "Ouled Attia",
                LatLng("35.533", "2.167"),
                21013,
                21
            ),
            Commune(
                764,
                "وادي الزهور",
                "Oued Zehour",
                LatLng("36.9221397", "6.313303299999999"),
                21014,
                21
            ),
            Commune(
                765,
                "الزيتونة",
                "Zitouna",
                LatLng("36.9880728", "6.455671300000001"),
                21015,
                21
            ),
            Commune(
                766,
                "الحروش",
                "El Harrouch",
                LatLng("36.6557031", "6.84046"),
                21016,
                21
            ),
            Commune(
                767,
                "زردازاس",
                "Zerdazas",
                LatLng("36.597881", "6.8957"),
                21017,
                21
            ),
            Commune(
                768,
                "أولاد حبابة",
                "Ouled Hebaba",
                LatLng("36.805752", "6.95974"),
                21018,
                21
            ),
            Commune(
                769,
                "سيدي مزغيش",
                "Sidi Mezghiche",
                LatLng("36.68009229999999", "6.718628299999999"),
                21019,
                21
            ),
            Commune(
                770,
                "مجاز الدشيش",
                "Emdjez Edchich",
                LatLng("36.7033327", "6.805627599999998"),
                21020,
                21
            ),
            Commune(
                771,
                "بني والبان",
                "Beni Oulbane",
                LatLng("36.6270696", "6.634417699999999"),
                21021,
                21
            ),
            Commune(
                772,
                "عين بوزيان",
                "Ain Bouziane",
                LatLng("36.6024073", "6.738694600000001"),
                21022,
                21
            ),
            Commune(
                773,
                "رمضان جمال",
                "Ramdane Djamel",
                LatLng("36.7599329", "6.894084599999999"),
                21023,
                21
            ),
            Commune(
                774,
                "بني بشير",
                "Beni Bachir",
                LatLng("36.783339", "6.933337"),
                21024,
                21
            ),
            Commune(
                775,
                "صالح بوالشعور",
                "Salah Bouchaour",
                LatLng("36.7005645", "6.853861999999999"),
                21025,
                21
            ),
            Commune(
                776,
                "تمالوس",
                "Tamalous",
                LatLng("36.83575390000001", "6.645105"),
                21026,
                21
            ),
            Commune(
                777,
                "عين قشرة",
                "Ain Kechra",
                LatLng("36.7455954", "6.431698999999999"),
                21027,
                21
            ),
            Commune(
                778,
                "أم الطوب",
                "Oum Toub",
                LatLng("36.6894163", "6.5756695"),
                21028,
                21
            ),
            Commune(
                779,
                "بني والبان",
                "Beni Ouelbane",
                LatLng("36.628432", "6.6355"),
                21029,
                21
            ),
            Commune(
                780,
                "فلفلة",
                "Fil Fila",
                LatLng("36.8828035", "7.0821162"),
                21030,
                21
            ),
            Commune(
                781,
                "الشرايع",
                "Cheraia",
                LatLng("37.0023239", "6.5129754"),
                21031,
                21
            ),
            Commune(
                782,
                "قنواع",
                "Kanoua",
                LatLng("37.03767370000001", "6.4037428"),
                21032,
                21
            ),
            Commune(
                783,
                "الغدير",
                "El Ghedir",
                LatLng("36.6867619", "6.975946800000001"),
                21033,
                21
            ),
            Commune(
                784,
                "بوشتاتة",
                "Bouchtata",
                LatLng("36.7925", "6.79722"),
                21034,
                21
            ),
            Commune(
                785,
                "ولجة بولبلوط",
                "Ouldja Boulbalout",
                LatLng("36.78611", "6.37306"),
                21035,
                21
            ),
            Commune(
                786,
                "خناق مايوم",
                "Kheneg Mayoum",
                LatLng("37.00833", "6.28417"),
                21036,
                21
            ),
            Commune(
                787,
                "سكيكدة",
                "Hamadi Krouma",
                LatLng("36.8460891", "6.9289361"),
                21037,
                21
            ),
            Commune(
                788,
                "المرسى",
                "El Marsa",
                LatLng("37.0094161", "7.286867999999999"),
                21038,
                21
            ),
            Commune(
                789,
                "سيدي بلعباس‎",
                "Sidi Bel Abbes",
                LatLng("35.2022249", "-0.6298922000000002"),
                22001,
                22
            ),
            Commune(
                790,
                "تسالة",
                "Tessala",
                LatLng("35.2672655", "-0.7818088999999999"),
                22002,
                22
            ),
            Commune(
                791,
                "سيدي ابراهيم",
                "Sidi Brahim",
                LatLng("35.268429", "-0.5730713000000001"),
                22003,
                22
            ),
            Commune(
                792,
                "مصطفى بن ابراهيم",
                "Mostefa Ben Brahim",
                LatLng("35.19256419999999", "-0.3594349999999999"),
                22004,
                22
            ),
            Commune(
                793,
                "تلاغ",
                "Telagh",
                LatLng("34.7949589", "-0.5446911999999998"),
                22005,
                22
            ),
            Commune(
                794,
                "مزاورو",
                "Mezaourou",
                LatLng("34.8385674", "-0.658333"),
                22006,
                22
            ),
            Commune(
                795,
                "بوخنفيس",
                "Boukhanafis",
                LatLng("35.05885110000001", "-0.6962853"),
                22007,
                22
            ),
            Commune(
                796,
                "سيدي علي بوسيدي",
                "Sidi Ali Boussidi",
                LatLng("35.10363179999999", "-0.8336503999999999"),
                22008,
                22
            ),
            Commune(
                797,
                "بدر الدين المقراني",
                "Badredine El Mokrani",
                LatLng("35.0096949", "-0.8496434"),
                22009,
                22
            ),
            Commune(
                798,
                "مرحوم",
                "Marhoum",
                LatLng("34.44462660000001", "-0.1939932"),
                22010,
                22
            ),
            Commune(
                799,
                "تفسور",
                "Tafissour",
                LatLng("34.6923957", "-0.2021951"),
                22011,
                22
            ),
            Commune(
                800,
                "العمارنة",
                "Amarnas",
                LatLng("35.0923336", "-0.610943"),
                22012,
                22
            ),
            Commune(
                801,
                "تلموني",
                "Tilmouni",
                LatLng("35.18069219999999", "-0.5352355999999998"),
                22013,
                22
            ),
            Commune(
                802,
                "سيدي لحسن",
                "Sidi Lahcene",
                LatLng("35.2016965", "-0.7247730000000001"),
                22014,
                22
            ),
            Commune(
                803,
                "عين التريد",
                "Ain Thrid",
                LatLng("35.2850615", "-0.6755257000000001"),
                22015,
                22
            ),
            Commune(
                804,
                "مقيدرة",
                "Makedra",
                LatLng("35.440830", "-0.431390"),
                22016,
                22
            ),
            Commune(
                805,
                "تنيرة",
                "Tenira",
                LatLng("35.01573289999999", "-0.5068824"),
                22017,
                22
            ),
            Commune(
                806,
                "مولاي سليسن",
                "Moulay Slissen",
                LatLng("34.824175", "-0.7604110000000001"),
                22018,
                22
            ),
            Commune(
                807,
                "الحسيبة",
                "El Hacaiba",
                LatLng("34.705225", "-0.760171"),
                22019,
                22
            ),
            Commune(
                808,
                "حاسي زهانة",
                "Hassi Zehana",
                LatLng("35.0273144", "-0.8889678000000001"),
                22020,
                22
            ),
            Commune(
                809,
                "طابية",
                "Tabia",
                LatLng("35.0255332", "-0.7437760999999999"),
                22021,
                22
            ),
            Commune(
                810,
                "مرين",
                "Merine",
                LatLng("34.7815446", "-0.4478783000000001"),
                22022,
                22
            ),
            Commune(
                811,
                "رأس الماء",
                "Ras El Ma",
                LatLng("34.5003381", "-0.8055975999999999"),
                22023,
                22
            ),
            Commune(
                812,
                "عين تندامين",
                "Ain Tindamine",
                LatLng("34.6876739", "-0.721211"),
                22024,
                22
            ),
            Commune(
                813,
                "عين قادة",
                "Ain Kada",
                LatLng("35.136239", "-0.8567905000000001"),
                22025,
                22
            ),
            Commune(
                814,
                "مسيد",
                "Mcid",
                LatLng("35.1386244", "-0.2469943999999999"),
                22026,
                22
            ),
            Commune(
                815,
                "سيدي خالد",
                "Sidi Khaled",
                LatLng("35.1140441", "-0.6678176999999998"),
                22027,
                22
            ),
            Commune(
                816,
                "عين البرد",
                "Ain El Berd",
                LatLng("35.3675096", "-0.5068824000000001"),
                22028,
                22
            ),
            Commune(
                817,
                "سفيزف",
                "Sfissef",
                LatLng("35.2365004", "-0.2807868000000001"),
                22029,
                22
            ),
            Commune(
                818,
                "عين عدان",
                "Ain Adden",
                LatLng("35.3285126", "-0.2608306"),
                22030,
                22
            ),
            Commune(
                819,
                "واد تاوريرة",
                "Oued Taourira",
                LatLng("34.80263869999999", "-0.3266073"),
                22031,
                22
            ),
            Commune(
                820,
                "الظاية",
                "Dhaya",
                LatLng("34.6743959", "-0.6216008000000001"),
                22032,
                22
            ),
            Commune(
                821,
                "زروالة",
                "Zerouala",
                LatLng("35.2413225", "-0.5237735"),
                22033,
                22
            ),
            Commune(
                822,
                "لمطار",
                "Lamtar",
                LatLng("35.071492", "-0.7989959999999999"),
                22034,
                22
            ),
            Commune(
                823,
                "سيدي شعيب",
                "Sidi Chaib",
                LatLng("34.5931437", "-0.5470554"),
                22035,
                22
            ),
            Commune(
                824,
                "سيدي دحو دزاير",
                "Sidi Dahou Dezairs",
                LatLng("35.191092", "-0.640975"),
                22036,
                22
            ),
            Commune(
                825,
                "واد السبع",
                "Oued Sbaa",
                LatLng("34.5871725", "-0.7084642"),
                22037,
                22
            ),
            Commune(
                826,
                "بوجبع البرج",
                "Boudjebaa El Bordj",
                LatLng("35.351390", "-0.324720"),
                22038,
                22
            ),
            Commune(
                827,
                "سهالة الثورة",
                "Sehala Thaoura",
                LatLng("35.2228096", "-0.8579818000000001"),
                22039,
                22
            ),
            Commune(
                828,
                "سيدي يعقوب",
                "Sidi Yacoub",
                LatLng("35.1518977", "-0.7770528999999999"),
                22040,
                22
            ),
            Commune(
                829,
                "سيدي حمادوش",
                "Sidi Hamadouche",
                LatLng("35.3126031", "-0.5163312000000001"),
                22041,
                22
            ),
            Commune(
                830,
                "بلعربي",
                "Belarbi",
                LatLng("35.1370812", "-0.4408037"),
                22042,
                22
            ),
            Commune(
                831,
                "واد سفيون",
                "Oued Sefioun",
                LatLng("34.996110", "-0.093330"),
                22043,
                22
            ),
            Commune(
                832,
                "تغاليمت",
                "Teghalimet",
                LatLng("34.8859984", "-0.5517843000000001"),
                22044,
                22
            ),
            Commune(
                833,
                "ابن باديس",
                "Ben Badis",
                LatLng("34.9363466", "-0.8961217"),
                22045,
                22
            ),
            Commune(
                834,
                "سيدي علي بن يوب",
                "Sidi Ali Benyoub",
                LatLng("34.9264009", "-0.7342734"),
                22046,
                22
            ),
            Commune(
                835,
                "شطوان بلايلة",
                "Chetouane Belaila",
                LatLng("34.95055099999999", "-0.8365437"),
                22047,
                22
            ),
            Commune(
                836,
                "بئر الحمام",
                "Bir El Hammam",
                LatLng("34.4174164", "-0.5009781"),
                22048,
                22
            ),
            Commune(
                837,
                "تاودموت",
                "Taoudmout",
                LatLng("34.5887754", "-0.1144079"),
                22049,
                22
            ),
            Commune(
                838,
                "رجم دموش",
                "Redjem Demouche",
                LatLng("34.4268654", "-0.8091670999999999"),
                22050,
                22
            ),
            Commune(
                839,
                "بن شيبة شلية",
                "Benachiba Chelia",
                LatLng("34.963400", "-0.614500"),
                22051,
                22
            ),
            Commune(
                840,
                "حاسي دحو",
                "Hassi Dahou",
                LatLng("35.1036532", "-0.5446911999999999"),
                22052,
                22
            ),
            Commune(
                841,
                "عنابة‎",
                "Annaba",
                LatLng("36.9264582", "7.752535200000001"),
                23001,
                23
            ),
            Commune(
                842,
                "برحال",
                "Berrahel",
                LatLng("36.82756349999999", "7.4597725"),
                23002,
                23
            ),
            Commune(
                843,
                "الحجار",
                "El Hadjar",
                LatLng("36.7609066", "7.665662500000001"),
                23003,
                23
            ),
            Commune(
                844,
                "العلمة",
                "Eulma",
                LatLng("36.6989793", "7.4597725"),
                23004,
                23
            ),
            Commune(
                845,
                "البوني",
                "El Bouni",
                LatLng("36.8535764", "7.7431524"),
                23005,
                23
            ),
            Commune(
                846,
                "وادي العنب",
                "Oued El Aneb",
                LatLng("36.9104322", "7.503066899999999"),
                23006,
                23
            ),
            Commune(
                847,
                "الشرفة",
                "Cheurfa",
                LatLng("36.7236097", "7.5788975"),
                23007,
                23
            ),
            Commune(
                848,
                "سرايدي",
                "Seraidi",
                LatLng("36.944893", "7.633112999999999"),
                23008,
                23
            ),
            Commune(
                849,
                "عين الباردة",
                "Ain Berda",
                LatLng("36.6449172", "7.590099499999999"),
                23009,
                23
            ),
            Commune(
                850,
                "شطايبي",
                "Chetaibi",
                LatLng("37.0040741", "7.3732655"),
                23010,
                23
            ),
            Commune(
                851,
                "سيدي عمار",
                "Sidi Amer",
                LatLng("36.8037437", "7.665662500000001"),
                23011,
                23
            ),
            Commune(
                852,
                "التريعات",
                "Treat",
                LatLng("36.91587499999999", "7.4165053"),
                23012,
                23
            ),
            Commune(
                853,
                "قالمة",
                "Guelma",
                LatLng("36.458976", "7.4327273"),
                24001,
                24
            ),
            Commune(
                854,
                "نشماية",
                "Nechmaya",
                LatLng("36.6125831", "7.5111876"),
                24002,
                24
            ),
            Commune(
                855,
                "بوعاتي محمود",
                "Bouati Mahmoud",
                LatLng("36.5905648", "7.3260032"),
                24003,
                24
            ),
            Commune(
                856,
                "وادي الزناتي",
                "Oued Zenati",
                LatLng("36.3139054", "7.162864700000001"),
                24004,
                24
            ),
            Commune(
                857,
                "تاملوكة",
                "Tamlouka",
                LatLng("36.15739490000001", "7.139976"),
                24005,
                24
            ),
            Commune(
                858,
                "وادي فراغة",
                "Oued Fragha",
                LatLng("36.556799", "7.7118003"),
                24006,
                24
            ),
            Commune(
                859,
                "عين صندل",
                "Ain Sandel",
                LatLng("36.2431716", "7.513217999999999"),
                24007,
                24
            ),
            Commune(
                860,
                "راس العقبة",
                "Ras El Agba",
                LatLng("36.3729492", "7.222816"),
                24008,
                24
            ),
            Commune(
                861,
                "الدهوارة",
                "Dahouara",
                LatLng("36.3522993", "7.734880500000001"),
                24009,
                24
            ),
            Commune(
                862,
                "بلخير",
                "Belkhir",
                LatLng("36.4735648", "7.7304778"),
                24010,
                24
            ),
            Commune(
                863,
                "بن جراح",
                "Ben Djarah",
                LatLng("36.43126410000001", "7.369888500000001"),
                24011,
                24
            ),
            Commune(
                864,
                "بوحمدان",
                "Bou Hamdane",
                LatLng("36.4622523", "7.1144039"),
                24012,
                24
            ),
            Commune(
                865,
                "عين مخلوف",
                "Ain Makhlouf",
                LatLng("36.24650899999999", "7.251800399999998"),
                24013,
                24
            ),
            Commune(
                866,
                "عين بن بيضة",
                "Ain Ben Beida",
                LatLng("36.61977", "7.69876"),
                24014,
                24
            ),
            Commune(
                867,
                "خزارة",
                "Khezara",
                LatLng("36.3705271", "7.5342015"),
                24015,
                24
            ),
            Commune(
                868,
                "بني مزلين",
                "Beni Mezline",
                LatLng("36.4817434", "7.604644599999999"),
                24016,
                24
            ),
            Commune(
                869,
                "بوحشانة",
                "Bou Hachana",
                LatLng("36.30686800000001", "7.507803900000001"),
                24017,
                24
            ),
            Commune(
                870,
                "قلعة بوصبع",
                "Guelaat Bou Sbaa",
                LatLng("36.5501826", "7.4787104"),
                24018,
                24
            ),
            Commune(
                871,
                "حمام المسخوطين",
                "Hammam Maskhoutine",
                LatLng("36.4613", "7.2637"),
                24019,
                24
            ),
            Commune(
                872,
                "الفجوج",
                "El Fedjoudj",
                LatLng("36.5046911", "7.3894772"),
                24020,
                24
            ),
            Commune(
                873,
                "برج صباط",
                "Bordj Sabat",
                LatLng("36.40289899999999", "7.048499899999999"),
                24021,
                24
            ),
            Commune(
                874,
                "حمام النبايل",
                "Hamman Nbail",
                LatLng("36.3246695", "7.6412489"),
                24022,
                24
            ),
            Commune(
                875,
                "عين عربي",
                "Ain Larbi",
                LatLng("36.265831", "7.39778"),
                24023,
                24
            ),
            Commune(
                876,
                "مجاز عمار",
                "Medjez Amar",
                LatLng("36.4457672", "7.309131799999999"),
                24024,
                24
            ),
            Commune(
                877,
                "بوشقوف",
                "Bouchegouf",
                LatLng("36.47192709999999", "7.736238400000002"),
                24025,
                24
            ),
            Commune(
                878,
                "ھيليوبوليس",
                "Heliopolis",
                LatLng("36.50200100000001", "7.4327273"),
                24026,
                24
            ),
            Commune(
                879,
                "هواري بومدين",
                "Ain Hessania",
                LatLng("36.41701669999999", "7.2841698"),
                24027,
                24
            ),
            Commune(
                880,
                "الركنية",
                "Roknia",
                LatLng("36.5451275", "7.2342735"),
                24028,
                24
            ),
            Commune(
                881,
                "سلاوة عنونة",
                "Salaoua Announa",
                LatLng("36.3866785", "7.2518004"),
                24029,
                24
            ),
            Commune(
                882,
                "مجاز الصفاء",
                "Medjez Sfa",
                LatLng("36.4339664", "7.7824225"),
                24030,
                24
            ),
            Commune(
                883,
                "بومهرة أحمد",
                "Boumahra Ahmed",
                LatLng("36.45800699999999", "7.512541199999999"),
                24031,
                24
            ),
            Commune(
                884,
                "عين رقادة",
                "Ain Reggada",
                LatLng("36.261631", "7.07267"),
                24032,
                24
            ),
            Commune(
                885,
                "وادي الشحم",
                "Oued Cheham",
                LatLng("36.38248189999999", "7.767477299999999"),
                24033,
                24
            ),
            Commune(
                886,
                "جبالة لخميسي",
                "Djeballah Khemissi",
                LatLng("36.4645365", "7.568736800000001"),
                24034,
                24
            ),
            Commune(
                887,
                "قسنطينة",
                "Constantine",
                LatLng("36.360155", "6.642433"),
                25001,
                25
            ),
            Commune(
                888,
                "حامة بوزيان",
                "Hamma Bouziane",
                LatLng("36.4181986", "6.5676625"),
                25002,
                25
            ),
            Commune(
                889,
                "الهرية",
                "El Haria",
                LatLng("36.366542", "6.873721"),
                25003,
                25
            ),
            Commune(
                890,
                "قسنطينة",
                "Zighoud Youcef",
                LatLng("36.3683804", "6.638459900000001"),
                25004,
                25
            ),
            Commune(
                891,
                "ديدوش مراد",
                "Didouche Mourad",
                LatLng("36.3680195", "6.6126546"),
                25005,
                25
            ),
            Commune(
                892,
                "الخروب",
                "El Khroub",
                LatLng("36.2714408", "6.685198199999999"),
                25006,
                25
            ),
            Commune(
                893,
                "عين عبيد",
                "Ain Abid",
                LatLng("36.2135906", "6.942384400000001"),
                25007,
                25
            ),
            Commune(
                894,
                "بني حميدان",
                "Beni Hamiden",
                LatLng("36.53725309999999", "6.556988199999999"),
                25008,
                25
            ),
            Commune(
                895,
                "أولاد رحمون",
                "Ouled Rahmoune",
                LatLng("36.220992", "6.813664199999999"),
                25009,
                25
            ),
            Commune(
                896,
                "عين سمارة",
                "Ain Smara",
                LatLng("36.2831875", "6.471657999999999"),
                25010,
                25
            ),
            Commune(
                897,
                "مسعود بوجريو",
                "Mesaoud Boudjeriou",
                LatLng("36.4603589", "6.386442799999999"),
                25011,
                25
            ),
            Commune(
                898,
                "ابن زياد",
                "Ibn Ziad",
                LatLng("36.3718282", "6.429036"),
                25012,
                25
            ),
            Commune(
                899,
                "المدية‎",
                "Medea",
                LatLng("36.2853847", "2.7680247"),
                26001,
                26
            ),
            Commune(
                900,
                "وزرة",
                "Ouzera",
                LatLng("36.252581", "2.8463103"),
                26002,
                26
            ),
            Commune(
                901,
                "أولاد معرف",
                "Ouled Maaref",
                LatLng("35.7669488", "3.0776568"),
                26003,
                26
            ),
            Commune(
                902,
                "عين بوسيف",
                "Ain Boucif",
                LatLng("35.85207020000001", "3.1578875"),
                26004,
                26
            ),
            Commune(
                903,
                "العيساوية",
                "Aissaouia",
                LatLng("36.403785", "3.228198299999999"),
                26005,
                26
            ),
            Commune(
                904,
                "أولاد دايد",
                "Ouled Deide",
                LatLng("36.1161743", "3.0375914"),
                26006,
                26
            ),
            Commune(
                905,
                "العمارية",
                "El Omaria",
                LatLng("36.2672156", "3.0245978"),
                26007,
                26
            ),
            Commune(
                906,
                "دراڨ",
                "Derrag",
                LatLng("35.9080275", "2.3881368"),
                26008,
                26
            ),
            Commune(
                907,
                "القلب الكبير",
                "El Guelbelkebir",
                LatLng("36.2472045", "3.4094629"),
                26009,
                26
            ),
            Commune(
                908,
                "بوعيش",
                "Bouaiche",
                LatLng("35.5868879", "2.341887"),
                26010,
                26
            ),
            Commune(
                909,
                "مزرينة",
                "Mezerena",
                LatLng("36.266720", "2.747940"),
                26011,
                26
            ),
            Commune(
                910,
                "أولاد إبراهيم",
                "Ouled Brahim",
                LatLng("36.2155805", "2.9675572"),
                26012,
                26
            ),
            Commune(
                911,
                "داميات",
                "Damiat",
                LatLng("36.266721", "2.747977"),
                26013,
                26
            ),
            Commune(
                912,
                "سيدي زيان",
                "Sidi Ziane",
                LatLng("36.034631", "3.2483058"),
                26014,
                26
            ),
            Commune(
                913,
                "تمزڨيدة",
                "Tamesguida",
                LatLng("36.3309673", "2.6685736"),
                26015,
                26
            ),
            Commune(
                914,
                "الحمدانية",
                "El Hamdania",
                LatLng("36.3369617", "2.8776638"),
                26016,
                26
            ),
            Commune(
                915,
                "الكاف الأخضر",
                "Kef Lakhdar",
                LatLng("35.9370344", "3.238251"),
                26017,
                26
            ),
            Commune(
                916,
                "شلالات الضورة",
                "Chelalet El Adhaoura",
                LatLng("35.940280", "3.413890"),
                26018,
                26
            ),
            Commune(
                917,
                "بوسكن",
                "Bouskene",
                LatLng("36.1554282", "3.1980527"),
                26019,
                26
            ),
            Commune(
                918,
                "الربعية",
                "Rebaia",
                LatLng("36.0272162", "3.1177555"),
                26020,
                26
            ),
            Commune(
                919,
                "بوشراحيل",
                "Bouchrahil",
                LatLng("36.2865922", "3.1578875"),
                26021,
                26
            ),
            Commune(
                920,
                "أولاد هلال",
                "Ouled Hellal",
                LatLng("35.9370104", "2.4980197"),
                26022,
                26
            ),
            Commune(
                921,
                "تافراوت",
                "Tafraout",
                LatLng("35.978354", "3.318746999999999"),
                26023,
                26
            ),
            Commune(
                922,
                "بعطة",
                "Baata",
                LatLng("36.3742549", "3.1177555"),
                26024,
                26
            ),
            Commune(
                923,
                "بوغار",
                "Boghar",
                LatLng("35.9498907", "2.7182728"),
                26025,
                26
            ),
            Commune(
                924,
                "سيدي نعمان",
                "Sidi Naamane",
                LatLng("36.2559141", "3.0876783"),
                26026,
                26
            ),
            Commune(
                925,
                "أولاد بوعشرة",
                "Ouled Bouachra",
                LatLng("36.0914607", "2.7083287"),
                26027,
                26
            ),
            Commune(
                926,
                "سيدي زهار",
                "Sidi Zahar",
                LatLng("36.0683421", "3.3317554"),
                26028,
                26
            ),
            Commune(
                927,
                "وادي حربيل",
                "Oued Harbil",
                LatLng("36.2447225", "2.6487087"),
                26029,
                26
            ),
            Commune(
                928,
                "بن شكاو",
                "Benchicao",
                LatLng("36.1967899", "2.847737"),
                26030,
                26
            ),
            Commune(
                929,
                "سيدي دامد",
                "Sidi Damed",
                LatLng("35.8041669", "3.318746999999999"),
                26031,
                26
            ),
            Commune(
                930,
                "عزيز",
                "Aziz",
                LatLng("35.758478", "2.4999918"),
                26032,
                26
            ),
            Commune(
                931,
                "السواڨي",
                "Souagui",
                LatLng("36.1215213", "3.2483058"),
                26033,
                26
            ),
            Commune(
                932,
                "الزبيرية",
                "Zoubiria",
                LatLng("36.07761300000001", "2.8377656"),
                26034,
                26
            ),
            Commune(
                933,
                "قصر البخاري",
                "Ksar El Boukhari",
                LatLng("35.8729994", "2.7481176"),
                26035,
                26
            ),
            Commune(
                934,
                "العزيزية",
                "El Azizia",
                LatLng("36.3098718", "3.490239099999999"),
                26036,
                26
            ),
            Commune(
                935,
                "جواب",
                "Djouab",
                LatLng("36.13812850000001", "3.4278338"),
                26037,
                26
            ),
            Commune(
                936,
                "الشهبونية",
                "Chahbounia",
                LatLng("35.582061", "2.5792482"),
                26038,
                26
            ),
            Commune(
                937,
                "مغراوة",
                "Meghraoua",
                LatLng("36.37362139999999", "3.5306765"),
                26039,
                26
            ),
            Commune(
                938,
                "شنيڨل",
                "Cheniguel",
                LatLng("35.9225813", "3.566700599999999"),
                26040,
                26
            ),
            Commune(
                939,
                "عين القصير",
                "Ain Ouksir",
                LatLng("35.8528084", "3.4701398"),
                26041,
                26
            ),
            Commune(
                940,
                "أم الجليل",
                "Oum El Djalil",
                LatLng("35.8312012", "2.6685736"),
                26042,
                26
            ),
            Commune(
                941,
                "عوامري",
                "Ouamri",
                LatLng("36.2575001", "2.5594214"),
                26043,
                26
            ),
            Commune(
                942,
                "سى المحجوب",
                "Si Mahdjoub",
                LatLng("36.17741199999999", "2.7481176"),
                26044,
                26
            ),
            Commune(
                943,
                "شلالات الضاورة",
                "Chellalet El Adhaoura",
                LatLng("35.940280", "3.413890"),
                26045,
                26
            ),
            Commune(
                944,
                "بني سليمان",
                "Beni Slimane",
                LatLng("36.2283487", "3.3086778"),
                26046,
                26
            ),
            Commune(
                945,
                "البرواڨية",
                "Berrouaghia",
                LatLng("36.1625653", "2.9175955"),
                26047,
                26
            ),
            Commune(
                946,
                "سغوان",
                "Seghouane",
                LatLng("35.9887439", "2.9175955"),
                26048,
                26
            ),
            Commune(
                947,
                "المفاتحة",
                "Meftaha",
                LatLng("35.90168810000001", "2.9175955"),
                26049,
                26
            ),
            Commune(
                948,
                "ميهوب",
                "Mihoub",
                LatLng("36.3654474", "3.4397386"),
                26050,
                26
            ),
            Commune(
                949,
                "بوغزول",
                "Boughezoul",
                LatLng("35.7533117", "2.7381672"),
                26051,
                26
            ),
            Commune(
                950,
                "تابلاط",
                "Tablat",
                LatLng("36.4121257", "3.318747"),
                26052,
                26
            ),
            Commune(
                951,
                "فج الحوضين",
                "Deux Bassins",
                LatLng("36.469433", "3.2992135"),
                26053,
                26
            ),
            Commune(
                952,
                "ذراع السمار",
                "Draa Essamar",
                LatLng("36.2650726", "2.7083287"),
                26054,
                26
            ),
            Commune(
                953,
                "سيدي الربيع",
                "Sidi Errabia",
                LatLng("36.2754347", "3.3071524"),
                26055,
                26
            ),
            Commune(
                954,
                "بئر بن العابد",
                "Bir Ben Laabed",
                LatLng("36.1916138", "3.4198797"),
                26056,
                26
            ),
            Commune(
                955,
                "العوينات",
                "El Ouinet",
                LatLng("35.865293", "3.0676373"),
                26057,
                26
            ),
            Commune(
                956,
                "أولاد عنتر",
                "Ouled Antar",
                LatLng("35.9951773", "2.6387795"),
                26058,
                26
            ),
            Commune(
                957,
                "بوعيشون",
                "Bouaichoune",
                LatLng("36.13622859999999", "2.6487087"),
                26059,
                26
            ),
            Commune(
                958,
                "حناشة",
                "Hannacha",
                LatLng("36.1809422", "2.5891648"),
                26060,
                26
            ),
            Commune(
                959,
                "سدراية",
                "Sedraia",
                LatLng("36.2425076", "3.5288362"),
                26061,
                26
            ),
            Commune(
                960,
                "مجبر",
                "Medjebar",
                LatLng("35.9480676", "2.797901"),
                26062,
                26
            ),
            Commune(
                961,
                "خمس جوامع",
                "Khams Djouamaa",
                LatLng("36.1464261", "3.1277854"),
                26063,
                26
            ),
            Commune(
                962,
                "سانڨ",
                "Saneg",
                LatLng("35.84936839999999", "2.8277963"),
                26064,
                26
            ),
            Commune(
                963,
                "مستغانم",
                "Mostaganem",
                LatLng("36.01312350000001", "0.1401381"),
                27001,
                27
            ),
            Commune(
                964,
                "صيادة",
                "Sayada",
                LatLng("35.9042298", "0.1401381"),
                27002,
                27
            ),
            Commune(
                965,
                "فرناكة",
                "Fornaka",
                LatLng("35.7536603", "-0.0170737"),
                27003,
                27
            ),
            Commune(
                966,
                "ستيدية",
                "Stidia",
                LatLng(
                    "35.83072250000001",
                    "-0.006994800000000002"
                ),
                27004,
                27
            ),
            Commune(
                967,
                "عين نويسي",
                "Ain Nouissy",
                LatLng("35.8034403", "0.0489902"),
                27005,
                27
            ),
            Commune(
                968,
                "حاسي مماش",
                "Hassi Maameche",
                LatLng("35.8606678", "0.102718"),
                27006,
                27
            ),
            Commune(
                969,
                "عين تادلس",
                "Ain Tadles",
                LatLng("35.99651980000001", "0.2948797"),
                27007,
                27
            ),
            Commune(
                970,
                "صور",
                "Sour",
                LatLng("35.9998017", "0.3401287"),
                27008,
                27
            ),
            Commune(
                971,
                "واد الخير",
                "Oued El Kheir",
                LatLng("35.9500047", "0.3818982"),
                27009,
                27
            ),
            Commune(
                972,
                "سيدي بلعاتر",
                "Sidi Bellater",
                LatLng("36.0264951", "0.2737423"),
                27010,
                27
            ),
            Commune(
                974,
                "سيدي علي",
                "Sidi Ali",
                LatLng("36.0967786", "0.4148744"),
                27012,
                27
            ),
            Commune(
                975,
                "بن عبد المالك رمضان",
                "Abdelmalek Ramdane",
                LatLng("36.1026171", "0.2737423"),
                27013,
                27
            ),
            Commune(
                976,
                "حجاج",
                "Hadjadj",
                LatLng("36.0970536", "0.3254317"),
                27014,
                27
            ),
            Commune(
                977,
                "نقمارية",
                "Nekmaria",
                LatLng("36.1882211", "0.6227851999999999"),
                27015,
                27
            ),
            Commune(
                978,
                "سيدي لخضر",
                "Sidi Lakhdar",
                LatLng("36.1618701", "0.4431618000000001"),
                27016,
                27
            ),
            Commune(
                979,
                "عشعاشة",
                "Achaacha",
                LatLng("36.2437869", "0.6334462000000001"),
                27017,
                27
            ),
            Commune(
                980,
                "خضراء",
                "Khadra",
                LatLng("36.25357109999999", "0.5754372999999999"),
                27018,
                27
            ),
            Commune(
                981,
                "بوقيراط",
                "Bouguirat",
                LatLng("35.74860839999999", "0.2549631"),
                27019,
                27
            ),
            Commune(
                982,
                "سيرات",
                "Sirat",
                LatLng("35.7801148", "0.1881358"),
                27020,
                27
            ),
            Commune(
                983,
                "عين سيدي شريف",
                "Ain Sidi Cherif",
                LatLng("35.8361077", "0.1284404"),
                27021,
                27
            ),
            Commune(
                984,
                "ماسرة",
                "Mesra",
                LatLng("35.841515", "0.1658856"),
                27022,
                27
            ),
            Commune(
                985,
                "منصورة",
                "Mansourah",
                LatLng("35.8434386", "0.2315251"),
                27023,
                27
            ),
            Commune(
                986,
                "سوافلية",
                "Souaflia",
                LatLng("35.8617554", "0.3313514"),
                27024,
                27
            ),
            Commune(
                987,
                "أوالد بوغالم",
                "Ouled Boughalem",
                LatLng("36.3181385", "0.6701891999999998"),
                27025,
                27
            ),
            Commune(
                988,
                "أولاد مع اللّه",
                "Ouled Maallah",
                LatLng("36.0076756", "0.5908192"),
                27026,
                27
            ),
            Commune(
                989,
                "مزغران",
                "Mezghrane",
                LatLng("35.886946", "0.058968"),
                27027,
                27
            ),
            Commune(
                990,
                "عين بودينار",
                "Ain Boudinar",
                LatLng("36.00897740000001", "0.1881358"),
                27028,
                27
            ),
            Commune(
                991,
                "تزقايت",
                "Tazgait",
                LatLng("36.0948862", "0.5482376"),
                27029,
                27
            ),
            Commune(
                992,
                "صفصاف",
                "Safsaf",
                LatLng("35.84649220000001", "0.3771895"),
                27030,
                27
            ),
            Commune(
                993,
                "طواھيرية",
                "Touahria",
                LatLng("35.810088", "0.2092267"),
                27031,
                27
            ),
            Commune(
                994,
                "الحسيان",
                "El Hassiane",
                LatLng("35.7529118", "0.1202541"),
                27032,
                27
            ),
            Commune(
                995,
                "ولاية المسيلة",
                "Msila",
                LatLng("35.316633", "4.2333355"),
                28001,
                28
            ),
            Commune(
                996,
                "المعاضيد",
                "Maadid",
                LatLng("35.7999025", "4.7484518"),
                28002,
                28
            ),
            Commune(
                997,
                "حمـام الضلعة",
                "Hammam Dhalaa",
                LatLng("35.94451859999999", "4.3770704"),
                28003,
                28
            ),
            Commune(
                998,
                "أولاد دراج",
                "Ouled Derradj",
                LatLng("35.6238892", "4.789873099999999"),
                28004,
                28
            ),
            Commune(
                999,
                "تارمونت",
                "Tarmount",
                LatLng("35.81837739999999", "4.2538452"),
                28005,
                28
            ),
            Commune(
                1000,
                "المطارفة",
                "Mtarfa",
                LatLng("35.717581", "4.624347"),
                28006,
                28
            ),
            Commune(
                1001,
                "خبانة",
                "Khoubana",
                LatLng("35.32891529999999", "4.5005808"),
                28007,
                28
            ),
            Commune(
                1002,
                "مسيف",
                "Mcif",
                LatLng("35.3405434", "4.769158600000001"),
                28008,
                28
            ),
            Commune(
                1003,
                "شلال",
                "Chellal",
                LatLng("35.5085058", "4.3770704"),
                28009,
                28
            ),
            Commune(
                1004,
                "أولاد مـاضي",
                "Ouled Madhi",
                LatLng("35.5461361", "4.5418141"),
                28010,
                28
            ),
            Commune(
                1005,
                "مقرة",
                "Magra",
                LatLng("35.6102393", "5.1223608"),
                28011,
                28
            ),
            Commune(
                1006,
                "برهوم",
                "Berhoum",
                LatLng("35.64776479999999", "5.0078451"),
                28012,
                28
            ),
            Commune(
                1007,
                "عين الخضراء",
                "Ain Khadra",
                LatLng("35.5298671", "4.9558696"),
                28013,
                28
            ),
            Commune(
                1008,
                "اولاد عدي لقبالة",
                "Ouled Addi Guebala",
                LatLng("35.7078012", "4.8728093"),
                28014,
                28
            ),
            Commune(
                1009,
                "بلعايبة",
                "Belaiba",
                LatLng("35.5743889", "5.195355399999999"),
                28015,
                28
            ),
            Commune(
                1010,
                "سيدي عيسى",
                "Sidi Aissa",
                LatLng("35.8147768", "3.7029002"),
                28016,
                28
            ),
            Commune(
                1011,
                "عين الحجل",
                "Ain El Hadjel",
                LatLng("35.613995", "3.845173100000001"),
                28017,
                28
            ),
            Commune(
                1012,
                "سيدي ھجرس",
                "Sidi Hadjeres",
                LatLng("35.7171398", "4.028678"),
                28018,
                28
            ),
            Commune(
                1013,
                "ونوغة",
                "Ouanougha",
                LatLng("35.9518081", "4.1718542"),
                28019,
                28
            ),
            Commune(
                1014,
                "بوسعادة",
                "Bou Saada",
                LatLng("35.2102695", "4.1794668"),
                28020,
                28
            ),
            Commune(
                1015,
                "المسيلة‎",
                "Ouled Sidi Brahim",
                LatLng("35.7259759", "4.5324082"),
                28021,
                28
            ),
            Commune(
                1016,
                "سيدي عامر",
                "Sidi Ameur",
                LatLng("35.417831", "3.824824099999999"),
                28022,
                28
            ),
            Commune(
                1017,
                "تامسة",
                "Tamsa",
                LatLng("35.17339279999999", "3.926650199999999"),
                28023,
                28
            ),
            Commune(
                1018,
                "بن سرور",
                "Ben Srour",
                LatLng("34.9958214", "4.6037231"),
                28024,
                28
            ),
            Commune(
                1019,
                "أولاد سليمان",
                "Ouled Slimane",
                LatLng("34.8981727", "4.8520636"),
                28025,
                28
            ),
            Commune(
                1020,
                "الحوامد",
                "El Houamed",
                LatLng("35.1715671", "4.6037231"),
                28026,
                28
            ),
            Commune(
                1021,
                "الهامل",
                "El Hamel",
                LatLng("35.12408", "4.0899911"),
                28027,
                28
            ),
            Commune(
                1022,
                "أولاد منصور",
                "Ouled Mansour",
                LatLng("35.7268096", "4.3770704"),
                28028,
                28
            ),
            Commune(
                1023,
                "المعاريف",
                "Maarif",
                LatLng("35.38018209999999", "4.2948884"),
                28029,
                28
            ),
            Commune(
                1024,
                "الدهاهنة",
                "Dehahna",
                LatLng("35.7340886", "5.0286488"),
                28030,
                28
            ),
            Commune(
                1025,
                "بوطي السايح",
                "Bouti Sayah",
                LatLng("35.642736", "3.6217802"),
                28031,
                28
            ),
            Commune(
                1026,
                "خطوطي صجير",
                "Khettouti Sed Djir",
                LatLng("35.687706", "4.253996"),
                28032,
                28
            ),
            Commune(
                1027,
                "الزرزور",
                "Zarzour",
                LatLng("35.0529379", "4.8313257"),
                28033,
                28
            ),
            Commune(
                1028,
                "محمد بوضياف",
                "Oued Chair",
                LatLng("34.8911615", "4.4593791"),
                28034,
                28
            ),
            Commune(
                1029,
                "بن الزوه",
                "Benzouh",
                LatLng("35.47481699999999", "4.0899911"),
                28035,
                28
            ),
            Commune(
                1030,
                "بير الفضة",
                "Bir Foda",
                LatLng("34.82133719999999", "3.9266502"),
                28036,
                28
            ),
            Commune(
                1031,
                "عين فارس",
                "Ain Fares",
                LatLng("34.7132986", "4.5005808"),
                28037,
                28
            ),
            Commune(
                1032,
                "سيدي محمد",
                "Sidi Mhamed",
                LatLng("34.7648293", "4.2948884"),
                28038,
                28
            ),
            Commune(
                1033,
                "منعة",
                "Ouled Atia",
                LatLng("35.0454248", "3.804483100000001"),
                28039,
                28
            ),
            Commune(
                1034,
                "الصوامع",
                "Souamaa",
                LatLng("35.5863111", "4.723900199999999"),
                28040,
                28
            ),
            Commune(
                1035,
                "عين الملح",
                "Ain El Melh",
                LatLng("34.81320060000001", "4.1718542"),
                28041,
                28
            ),
            Commune(
                1036,
                "مجدل",
                "Medjedel",
                LatLng("35.05039429999999", "3.642048"),
                28042,
                28
            ),
            Commune(
                1037,
                "سليم",
                "Slim",
                LatLng("34.91208590000001", "3.845173100000001"),
                28043,
                28
            ),
            Commune(
                1038,
                "عين الريش",
                "Ain Errich",
                LatLng("34.5751386", "4.028678"),
                28044,
                28
            ),
            Commune(
                1039,
                "بني يلمان",
                "Beni Ilmane",
                LatLng("35.9472217", "4.1195083"),
                28045,
                28
            ),
            Commune(
                1040,
                "ولتام",
                "Oultene",
                LatLng("35.1170124", "4.2948884"),
                28046,
                28
            ),
            Commune(
                1041,
                "جبل مساعد",
                "Djebel Messaad",
                LatLng("35.01068799999999", "4.192339999999999"),
                28047,
                28
            ),
            Commune(
                1042,
                "شارع شنيني امحمد",
                "Mascara",
                LatLng("35.39894349999999", "0.1414931"),
                29001,
                29
            ),
            Commune(
                1043,
                "بــوحــنــفــيــة",
                "Bou Hanifia",
                LatLng("35.3164348", "-0.0489902"),
                29002,
                29
            ),
            Commune(
                1044,
                "تيزي",
                "Tizi",
                LatLng("35.3157392", "0.0716931"),
                29003,
                29
            ),
            Commune(
                1045,
                "حاسين",
                "Hacine",
                LatLng("35.4617582", "-0.004663"),
                29004,
                29
            ),
            Commune(
                1046,
                "ماوسة",
                "Maoussa",
                LatLng("35.3798032", "0.2460604"),
                29005,
                29
            ),
            Commune(
                1047,
                "تيغنيف",
                "Teghennif",
                LatLng("35.4154336", "0.3296454"),
                29006,
                29
            ),
            Commune(
                1048,
                "الهاشم",
                "El Hachem",
                LatLng("35.41063580000001", "0.3789103"),
                29007,
                29
            ),
            Commune(
                1049,
                "سيدي قادة",
                "Sidi Kada",
                LatLng("35.3317591", "0.3416407"),
                29008,
                29
            ),
            Commune(
                1050,
                "زلامطة",
                "Zelmata",
                LatLng("35.2917125", "0.4752897"),
                29009,
                29
            ),
            Commune(
                1051,
                "واد الأبطال",
                "Oued El Abtal",
                LatLng("35.4551984", "0.687574"),
                29010,
                29
            ),
            Commune(
                1052,
                "عين فراح",
                "Ain Ferah",
                LatLng("35.3811088", "0.7853763"),
                29011,
                29
            ),
            Commune(
                1053,
                "غريس",
                "Ghriss",
                LatLng("35.2367082", "0.1682271"),
                29012,
                29
            ),
            Commune(
                1054,
                "فروحة",
                "Froha",
                LatLng("35.3026637", "0.1282536"),
                29013,
                29
            ),
            Commune(
                1055,
                "مطمور",
                "Matemore",
                LatLng("35.37425819999999", "0.1732144"),
                29014,
                29
            ),
            Commune(
                1056,
                "ماقضة",
                "Makdha",
                LatLng("35.19253940000001", "0.2807868"),
                29015,
                29
            ),
            Commune(
                1057,
                "سيدي بوسعيد",
                "Sidi Boussaid",
                LatLng("35.280438", "0.2807868"),
                29016,
                29
            ),
            Commune(
                1058,
                "البرج",
                "El Bordj",
                LatLng("35.510608", "0.3277829"),
                29017,
                29
            ),
            Commune(
                1059,
                "عين فكان",
                "Ain Fekan",
                LatLng("35.22034110000001", "-0.0139908"),
                29018,
                29
            ),
            Commune(
                1060,
                "البنيان",
                "Benian",
                LatLng("35.1", "0.25"),
                29019,
                29
            ),
            Commune(
                1061,
                "خلوية",
                "Khalouia",
                LatLng("35.4613997", "0.2948797"),
                29020,
                29
            ),
            Commune(
                1062,
                "المناور",
                "El Menaouer",
                LatLng("35.5322149", "0.4219444"),
                29021,
                29
            ),
            Commune(
                1063,
                "واد تاغية",
                "Oued Taria",
                LatLng("35.1130905", "0.09103159999999999"),
                29022,
                29
            ),
            Commune(
                1064,
                "عوف",
                "Aouf",
                LatLng("35.104351", "0.3560076"),
                29023,
                29
            ),
            Commune(
                1065,
                "عين فارس",
                "Ain Fares",
                LatLng("35.4560355", "0.2432307"),
                29024,
                29
            ),
            Commune(
                1066,
                "عين فراس",
                "Ain Frass",
                LatLng("35.206661", "-0.15679"),
                29025,
                29
            ),
            Commune(
                1067,
                "سيق",
                "Sig",
                LatLng("35.5437798", "-0.1682271"),
                29026,
                29
            ),
            Commune(
                1068,
                "عقاز",
                "Oggaz",
                LatLng("35.5614065", "-0.2584835"),
                29027,
                29
            ),
            Commune(
                1069,
                "العيمية",
                "Alaimia",
                LatLng("35.67461", "-0.21933"),
                29028,
                29
            ),
            Commune(
                1070,
                "القعدة",
                "El Gaada",
                LatLng("35.42528", "-0.315"),
                29029,
                29
            ),
            Commune(
                1071,
                "زاهانة",
                "Zahana",
                LatLng("35.5167", "-0.416667"),
                29030,
                29
            ),
            Commune(
                1072,
                "المحمدية",
                "Mohammadia",
                LatLng("35.5876568", "0.05599390000000001"),
                29031,
                29
            ),
            Commune(
                1073,
                "سيدي عبد المومن",
                "Sidi Abdelmoumene",
                LatLng("35.635", "0.05278"),
                29032,
                29
            ),
            Commune(
                1074,
                "فراغيغ",
                "Ferraguig",
                LatLng("35.5333", "0.15"),
                29033,
                29
            ),
            Commune(
                1075,
                "القومري",
                "El Ghomri",
                LatLng("35.71324", "0.2788"),
                29034,
                29
            ),
            Commune(
                1076,
                "سجرارة",
                "Sedjerara",
                LatLng("35.667", "0.35"),
                29035,
                29
            ),
            Commune(
                1077,
                "مقطع دوز",
                "Moctadouz",
                LatLng("35.6068031", "-0.0489902"),
                29036,
                29
            ),
            Commune(
                1078,
                "بوهني",
                "Bou Henni",
                LatLng("35.5575475", "-0.0863581"),
                29037,
                29
            ),
            Commune(
                1079,
                "قتنة",
                "Guettena",
                LatLng("35.40871", "-0.057268"),
                29038,
                29
            ),
            Commune(
                1080,
                "المامونية",
                "El Mamounia",
                LatLng("35.4256036", "0.1404947"),
                29039,
                29
            ),
            Commune(
                1081,
                "الكرط",
                "El Keurt",
                LatLng("35.3800031", "0.09243169999999998"),
                29040,
                29
            ),
            Commune(
                1082,
                "غروس",
                "Gharrous",
                LatLng("35.1259091", "0.4465984"),
                29041,
                29
            ),
            Commune(
                1083,
                "غرجوم",
                "Gherdjoum",
                LatLng("35.180249", "0.072953"),
                29042,
                29
            ),
            Commune(
                1084,
                "شورفة",
                "Chorfa",
                LatLng("35.43194", "-0.24528"),
                29043,
                29
            ),
            Commune(
                1085,
                "راس عين عميروش",
                "Ras Ain Amirouche",
                LatLng("35.635639", "-0.21556"),
                29044,
                29
            ),
            Commune(
                1086,
                "نصمت",
                "Nesmot",
                LatLng("35.236969", "0.395453"),
                29045,
                29
            ),
            Commune(
                1087,
                "سيدي عبد الجبار",
                "Sidi Abdeldjebar",
                LatLng("35.4425889", "0.5233311"),
                29046,
                29
            ),
            Commune(
                1088,
                "سهايلية",
                "Sehailia",
                LatLng("35.4446508", "0.403094"),
                29047,
                29
            ),
            Commune(
                1089,
                "ورقلة‎",
                "Ouargla",
                LatLng("31.9526724", "5.3335236"),
                30001,
                30
            ),
            Commune(
                1090,
                "عين البيضاء",
                "Ain Beida",
                LatLng("31.945266", "5.395264"),
                30002,
                30
            ),
            Commune(
                1091,
                "النقوسة",
                "Ngoussa",
                LatLng("32.13998660000001", "5.312864399999999"),
                30003,
                30
            ),
            Commune(
                1092,
                "حاسي مسعود",
                "Hassi Messaoud",
                LatLng("30.416772", "5.393955099999999"),
                30004,
                30
            ),
            Commune(
                1093,
                "الرويسات",
                "Rouissat",
                LatLng("31.9317115", "5.346856299999999"),
                30005,
                30
            ),
            Commune(
                1094,
                "بلدة أعمر",
                "Balidat Ameur",
                LatLng("32.9447252", "5.9753267"),
                30006,
                30
            ),
            Commune(
                1095,
                "ﺗﻴﺒﺴﺒﺴﺖ",
                "Tebesbest",
                LatLng("33.1161615", "6.0838065"),
                30007,
                30
            ),
            Commune(
                1096,
                "تقرت",
                "Nezla",
                LatLng("33.0869716", "6.058529099999999"),
                30008,
                30
            ),
            Commune(
                1097,
                "زاوية الأبدية",
                "Zaouia El Abidia",
                LatLng("33.1375", "6.08222"),
                30009,
                30
            ),
            Commune(
                1098,
                "سيدي سليمان",
                "Sidi Slimane",
                LatLng("33.2906594", "6.093076"),
                30010,
                30
            ),
            Commune(
                1099,
                "سيدي خويلد",
                "Sidi Khouiled",
                LatLng("31.97692550000001", "5.417519"),
                30011,
                30
            ),
            Commune(
                1100,
                "بلدية حاسي بن عبد",
                "Hassi Ben Abdellah",
                LatLng("32.025631", "5.4691361"),
                30012,
                30
            ),
            Commune(
                1101,
                "تقرت",
                "Touggourt",
                LatLng("33.0996078", "6.0785104"),
                30013,
                30
            ),
            Commune(
                1102,
                "الحجيرة",
                "El Hadjira",
                LatLng("32.6142956", "5.514493000000001"),
                30014,
                30
            ),
            Commune(
                1103,
                "الطيبات",
                "Taibet",
                LatLng("33.0863448", "6.399750099999999"),
                30015,
                30
            ),
            Commune(
                1104,
                "تماسين",
                "Tamacine",
                LatLng("33.01456710000001", "6.021210600000001"),
                30016,
                30
            ),
            Commune(
                1105,
                "بن ناصر",
                "Benaceur",
                LatLng("33.1092231", "6.445015799999999"),
                30017,
                30
            ),
            Commune(
                1106,
                "المنقر",
                "Mnaguer",
                LatLng("31.951516", "5.32455"),
                30018,
                30
            ),
            Commune(
                1107,
                "المقارين",
                "Megarine",
                LatLng("33.1940606", "6.094400299999999"),
                30019,
                30
            ),
            Commune(
                1108,
                "العالية",
                "El Allia",
                LatLng("32.6999655", "5.4227567"),
                30020,
                30
            ),
            Commune(
                1109,
                "البرمة",
                "El Borma",
                LatLng("31.0062563", "8.133855800000001"),
                30021,
                30
            ),
            Commune(
                1110,
                "وهران",
                "Oran",
                LatLng("35.7036434", "-0.6369878"),
                31001,
                31
            ),
            Commune(
                1111,
                "ڨديل",
                "Gdyel",
                LatLng("35.8052667", "-0.4691097000000001"),
                31002,
                31
            ),
            Commune(
                1112,
                "بئر الجير",
                "Bir El Djir",
                LatLng("35.7297279", "-0.5557834999999999"),
                31003,
                31
            ),
            Commune(
                1113,
                "حاسي بونيف",
                "Hassi Bounif",
                LatLng("35.6851254", "-0.4785495"),
                31004,
                31
            ),
            Commune(
                1114,
                "السانية",
                "Es Senia",
                LatLng("35.6406128", "-0.6488505"),
                31005,
                31
            ),
            Commune(
                1115,
                "أرزيو",
                "Arzew",
                LatLng("35.8602138", "-0.3465971"),
                31006,
                31
            ),
            Commune(
                1116,
                "بطيوة",
                "Bethioua",
                LatLng("35.7513806", "-0.2338473"),
                31007,
                31
            ),
            Commune(
                1117,
                "مرسى الحجاج",
                "Marsat El Hadjadj",
                LatLng("35.762407", "-0.1682271"),
                31008,
                31
            ),
            Commune(
                1118,
                "عين الترك",
                "Ain Turk",
                LatLng("35.74895300000001", "-0.8008388000000001"),
                31009,
                31
            ),
            Commune(
                1119,
                "العنصر",
                "El Ancar",
                LatLng("35.685669", "-0.87002"),
                31010,
                31
            ),
            Commune(
                1120,
                "واد تليلات",
                "Oued Tlelat",
                LatLng("35.5539698", "-0.4596721000000001"),
                31011,
                31
            ),
            Commune(
                1121,
                "طفراوي",
                "Tafraoui",
                LatLng("35.4550561", "-0.5446911999999999"),
                31012,
                31
            ),
            Commune(
                1122,
                "سيدي الشحمي",
                "Sidi Chami",
                LatLng("35.673918", "-0.5446911999999998"),
                31013,
                31
            ),
            Commune(
                1123,
                "بوفاطيس",
                "Boufatis",
                LatLng("35.6307787", "-0.3936722"),
                31014,
                31
            ),
            Commune(
                1124,
                "المرسى الكبير",
                "Mers El Kebir",
                LatLng("35.72221899999999", "-0.7105267"),
                31015,
                31
            ),
            Commune(
                1125,
                "بوسفر",
                "Bousfer",
                LatLng("35.7184264", "-0.7813933"),
                31016,
                31
            ),
            Commune(
                1126,
                "الكرمة",
                "El Karma",
                LatLng("35.5972528", "-0.5730713000000001"),
                31017,
                31
            ),
            Commune(
                1127,
                "البرية",
                "El Braya",
                LatLng("35.6194616", "-0.4974359"),
                31018,
                31
            ),
            Commune(
                1128,
                "حاسي بن عقبة",
                "Hassi Ben Okba",
                LatLng("35.7289564", "-0.4676447"),
                31019,
                31
            ),
            Commune(
                1129,
                "بن فريحة",
                "Ben Freha",
                LatLng("35.7292156", "-0.3654204"),
                31020,
                31
            ),
            Commune(
                1130,
                "حاسي مفسوخ",
                "Hassi Mefsoukh",
                LatLng("35.8010772", "-0.374617"),
                31021,
                31
            ),
            Commune(
                1131,
                "سيدي بن يبقى",
                "Sidi Ben Yabka",
                LatLng("35.8599738", "-0.4219443999999999"),
                31022,
                31
            ),
            Commune(
                1132,
                "مسرغين",
                "Messerghin",
                LatLng("35.5852064", "-0.7722973999999999"),
                31023,
                31
            ),
            Commune(
                1133,
                "بوتليليس",
                "Boutlelis",
                LatLng("35.58442340000001", "-0.8865834"),
                31024,
                31
            ),
            Commune(
                1134,
                "عين الكرمة",
                "Ain Kerma",
                LatLng("35.627277", "-1.0011902"),
                31025,
                31
            ),
            Commune(
                1135,
                "عين بية",
                "Ain Biya",
                LatLng("35.63028", "4.17667"),
                31026,
                31
            ),
            Commune(
                1136,
                "البيض",
                "El Bayadh",
                LatLng("33.65813869999999", "1.0203224"),
                32001,
                32
            ),
            Commune(
                1137,
                "الرقاصة",
                "Rogassa",
                LatLng("34.0188896", "0.9271366999999999"),
                32002,
                32
            ),
            Commune(
                1138,
                "ستيتن",
                "Stitten",
                LatLng("33.8348155", "1.2506002"),
                32003,
                32
            ),
            Commune(
                1139,
                "بريزينة",
                "Brezina",
                LatLng("33.0978041", "1.2586654"),
                32004,
                32
            ),
            Commune(
                1140,
                "الغاسول",
                "Ghassoul",
                LatLng("33.3793059", "1.2001181"),
                32005,
                32
            ),
            Commune(
                1141,
                "بوعلام",
                "Boualem",
                LatLng("33.7283305", "1.5329678"),
                32006,
                32
            ),
            Commune(
                1142,
                "الأبيض سيد الشيخ",
                "El Abiodh Sidi Cheikh",
                LatLng("32.9031575", "0.5399631"),
                32007,
                32
            ),
            Commune(
                1143,
                "عين العراك",
                "Ain El Orak",
                LatLng("33.4081281", "0.7390245"),
                32008,
                32
            ),
            Commune(
                1144,
                "عربوات",
                "Arbaouat",
                LatLng("33.0916013", "0.5849024"),
                32009,
                32
            ),
            Commune(
                1145,
                "بوقطب",
                "Bougtoub",
                LatLng("34.0390465", "0.09103159999999999"),
                32010,
                32
            ),
            Commune(
                1146,
                "الخيثر",
                "El Kheither",
                LatLng("34.1364841", "0.0700051"),
                32011,
                32
            ),
            Commune(
                1147,
                "كاف الأحمر",
                "Kef El Ahmar",
                LatLng("33.85", "0.6325"),
                32012,
                32
            ),
            Commune(
                1148,
                "بوسمغون",
                "Boussemghoun",
                LatLng("32.87049030000001", "0.0233208"),
                32013,
                32
            ),
            Commune(
                1149,
                "شلالة",
                "Chellala",
                LatLng("35.217", "2.317"),
                32014,
                32
            ),
            Commune(
                1150,
                "كرادة",
                "Krakda",
                LatLng("36.0342", "6.66583"),
                32015,
                32
            ),
            Commune(
                1151,
                "البنود",
                "El Bnoud",
                LatLng("32.31222", "0.24444"),
                32016,
                32
            ),
            Commune(
                1152,
                "شقيق",
                "Cheguig",
                LatLng("34.16889", "1.22806"),
                32017,
                32
            ),
            Commune(
                1153,
                "سيدي عامر",
                "Sidi Ameur",
                LatLng("33.7685936", "1.4362206"),
                32018,
                32
            ),
            Commune(
                1154,
                "المهارة",
                "El Mehara",
                LatLng("33.3130066", "0.3642437"),
                32019,
                32
            ),
            Commune(
                1155,
                "توسمولين",
                "Tousmouline",
                LatLng("33.6479569", "0.3113278"),
                32020,
                32
            ),
            Commune(
                1156,
                "سيدي سليمان",
                "Sidi Slimane",
                LatLng("33.83187789999999", "1.7271179"),
                32021,
                32
            ),
            Commune(
                1157,
                "سيدي طيفور",
                "Sidi Tifour",
                LatLng("33.71666699999999", "1.683333"),
                32022,
                32
            ),
            Commune(
                1158,
                "اليزي",
                "Illizi",
                LatLng("26.5094346", "8.473271799999997"),
                33001,
                33
            ),
            Commune(
                1159,
                "جانت",
                "Djanet",
                LatLng("24.5545691", "9.4811604"),
                33002,
                33
            ),
            Commune(
                1160,
                "الدبداب",
                "Debdeb",
                LatLng("29.9672147", "9.422346"),
                33003,
                33
            ),
            Commune(
                1161,
                "برج عمر إدريس",
                "Bordj Omar Driss",
                LatLng("28.115695", "6.7547522"),
                33004,
                33
            ),
            Commune(
                1162,
                "برج الحواس",
                "Bordj El Haouasse",
                LatLng("24.8849934", "8.434873"),
                33005,
                33
            ),
            Commune(
                1163,
                "عين أمناس",
                "In Amenas",
                LatLng("28.0461513", "9.5784754"),
                33006,
                33
            ),
            Commune(
                1164,
                "برج بوعريريج‎",
                "Bordj Bou Arreridj",
                LatLng("36.0704188", "4.7564046"),
                34001,
                34
            ),
            Commune(
                1165,
                "رأس الوادي",
                "Ras El Oued",
                LatLng("35.947031", "5.0356951"),
                34002,
                34
            ),
            Commune(
                1166,
                "برج زمورة",
                "Bordj Zemoura",
                LatLng("36.2612267", "4.883185"),
                34003,
                34
            ),
            Commune(
                1167,
                "منصورة",
                "Mansoura",
                LatLng("36.1376769", "4.438790000000001"),
                34004,
                34
            ),
            Commune(
                1168,
                "المهير",
                "El Mhir",
                LatLng("36.1184335", "4.3895593"),
                34005,
                34
            ),
            Commune(
                1169,
                "بن داود",
                "Ben Daoud",
                LatLng("36.0673882", "4.1419948"),
                34006,
                34
            ),
            Commune(
                1170,
                "اليشير",
                "El Achir",
                LatLng("36.0655916", "4.624375100000001"),
                34007,
                34
            ),
            Commune(
                1171,
                "عين تاغروت",
                "Ain Taghrout",
                LatLng("36.1321301", "5.1223608"),
                34008,
                34
            ),
            Commune(
                1172,
                "برج الغدير",
                "Bordj Ghdir",
                LatLng("35.91248029999999", "4.9247074"),
                34009,
                34
            ),
            Commune(
                1173,
                "سيدي أمبارك",
                "Sidi Embarek",
                LatLng("36.0974673", "4.914323899999999"),
                34010,
                34
            ),
            Commune(
                1174,
                "الحمادية",
                "El Hamadia",
                LatLng("35.983529", "4.779514900000001"),
                34011,
                34
            ),
            Commune(
                1175,
                "بليمور",
                "Belimour",
                LatLng("35.9672331", "4.9143239"),
                34012,
                34
            ),
            Commune(
                1176,
                "ولاية برج بوعريريج",
                "Medjana",
                LatLng("36.0735002", "4.7547395"),
                34013,
                34
            ),
            Commune(
                1177,
                "ولاية برج بوعريريج",
                "Teniet En Nasr",
                LatLng("36.0735002", "4.7547395"),
                34014,
                34
            ),
            Commune(
                1178,
                "جعافرة",
                "Djaafra",
                LatLng("36.29226990000001", "4.6628371"),
                34015,
                34
            ),
            Commune(
                1179,
                "إلماين",
                "El Main",
                LatLng("36.37198649999999", "4.738016999999999"),
                34016,
                34
            ),
            Commune(
                1180,
                "أولاد براھم",
                "Ouled Brahem",
                LatLng("35.87338169999999", "5.080691799999999"),
                34017,
                34
            ),
            Commune(
                1181,
                "أولاد دحمان",
                "Ouled Dahmane",
                LatLng("36.2214873", "4.7701642"),
                34018,
                34
            ),
            Commune(
                1182,
                "حسناوة",
                "Hasnaoua",
                LatLng("36.1520672", "4.7955348"),
                34019,
                34
            ),
            Commune(
                1183,
                "خليل",
                "Khelil",
                LatLng("36.2240477", "4.997446099999999"),
                34020,
                34
            ),
            Commune(
                1184,
                "تقلعيت",
                "Taglait",
                LatLng("35.8011473", "4.987049100000001"),
                34021,
                34
            ),
            Commune(
                1185,
                "القصور",
                "Ksour",
                LatLng("35.9921303", "4.595666699999999"),
                34022,
                34
            ),
            Commune(
                1186,
                "أولاد سيدي إبراھيم",
                "Ouled Sidi Brahim",
                LatLng("36.2289906", "4.3340554"),
                34023,
                34
            ),
            Commune(
                1187,
                "تافراق",
                "Tafreg",
                LatLng("36.30669869999999", "4.711307999999999"),
                34024,
                34
            ),
            Commune(
                1188,
                "القــلة",
                "Colla",
                LatLng("36.2374167", "4.665702699999999"),
                34025,
                34
            ),
            Commune(
                1189,
                "تكستار",
                "Tixter",
                LatLng("36.0453882", "5.1223608"),
                34026,
                34
            ),
            Commune(
                1190,
                "العش",
                "El Ach",
                LatLng("35.8917787", "4.624375100000001"),
                34027,
                34
            ),
            Commune(
                1191,
                "العنصر",
                "El Anseur",
                LatLng("36.039219", "4.81686"),
                34028,
                34
            ),
            Commune(
                1192,
                "تسمارث",
                "Tesmart",
                LatLng("36.2645778", "4.8002333"),
                34029,
                34
            ),
            Commune(
                1193,
                "عين تسرة",
                "Ain Tesra",
                LatLng("36.0367494", "5.002327"),
                34030,
                34
            ),
            Commune(
                1194,
                "بئر قاصدعلي",
                "Bir Kasdali",
                LatLng("36.1463398", "5.027662299999999"),
                34031,
                34
            ),
            Commune(
                1195,
                "غيلاسة",
                "Ghilassa",
                LatLng("35.8480848", "4.9039424"),
                34032,
                34
            ),
            Commune(
                1196,
                "الرابطة",
                "Rabta",
                LatLng("35.8965925", "4.779514899999999"),
                34033,
                34
            ),
            Commune(
                1197,
                "حرازة",
                "Haraza",
                LatLng("36.16605639999999", "4.2538452"),
                34034,
                34
            ),
            Commune(
                1197,
                "بومرداس",
                "Boumerdes",
                LatLng("36.7580109", "3.4851867"),
                35001,
                35
            ),
            Commune(
                1198,
                "بودواو",
                "Boudouaou",
                LatLng("36.7003998", "3.4296446"),
                35002,
                35
            ),
            Commune(
                1199,
                "أعفير",
                "Afir",
                LatLng("36.8433446", "3.9897847"),
                35004,
                35
            ),
            Commune(
                1200,
                "برج منايل",
                "Bordj Menaiel",
                LatLng("36.7552496", "3.753666299999999"),
                35005,
                35
            ),
            Commune(
                1201,
                "بغلية",
                "Baghlia",
                LatLng("36.7943784", "3.8757119"),
                35006,
                35
            ),
            Commune(
                1202,
                "سيدي داود",
                "Sidi Daoud",
                LatLng("36.85560630000001", "3.8583028"),
                35007,
                35
            ),
            Commune(
                1203,
                "الناصرية",
                "Naciria",
                LatLng("36.7317908", "3.8146526"),
                35008,
                35
            ),
            Commune(
                1204,
                "جنات",
                "Djinet",
                LatLng("36.84192629999999", "3.7333537"),
                35009,
                35
            ),
            Commune(
                1205,
                "يسر",
                "Isser",
                LatLng("36.69317969999999", "3.6724649"),
                35010,
                35
            ),
            Commune(
                1206,
                "زموري",
                "Zemmouri",
                LatLng("36.7859638", "3.6010514"),
                35011,
                35
            ),
            Commune(
                1207,
                "سي مصطفى",
                "Si Mustapha",
                LatLng("36.7381058", "3.6116494"),
                35012,
                35
            ),
            Commune(
                1208,
                "تيجلابين",
                "Tidjelabine",
                LatLng("36.72018399999999", "3.490239099999999"),
                35013,
                35
            ),
            Commune(
                1209,
                "شعبة العامر",
                "Chabet El Ameur",
                LatLng("36.61743430000001", "3.682608000000001"),
                35014,
                35
            ),
            Commune(
                1210,
                "الثنية",
                "Thenia",
                LatLng("36.7245506", "3.5577052"),
                35015,
                35
            ),
            Commune(
                1211,
                "تمزريت",
                "Timezrit",
                LatLng("36.662278", "3.799399199999999"),
                35018,
                35
            ),
            Commune(
                1212,
                "قورصو",
                "Corso",
                LatLng("36.73765480000001", "3.4447863"),
                35019,
                35
            ),
            Commune(
                1213,
                "أولاد موسى",
                "Ouled Moussa",
                LatLng("36.68000540000001", "3.3892894"),
                35020,
                35
            ),
            Commune(
                1214,
                "الاربعطاش",
                "Larbatache",
                LatLng("36.636145", "3.371541"),
                35021,
                35
            ),
            Commune(
                1215,
                "بوزڨزة قدارة",
                "Bouzegza Keddara",
                LatLng("36.6261517", "3.478950299999999"),
                35022,
                35
            ),
            Commune(
                1216,
                "تورڨة",
                "Taourga",
                LatLng("36.7923763", "3.9368439"),
                35025,
                35
            ),
            Commune(
                1217,
                "أولاد عيسى",
                "Ouled Aissa",
                LatLng("36.79634679999999", "3.8146526"),
                35026,
                35
            ),
            Commune(
                1218,
                "بن شود",
                "Ben Choud",
                LatLng("36.85267350000001", "3.901174700000001"),
                35027,
                35
            ),
            Commune(
                1219,
                "دلس",
                "Dellys",
                LatLng("36.87835990000001", "3.9368439"),
                35028,
                35
            ),
            Commune(
                1220,
                "عمال",
                "Ammal",
                LatLng("36.63099109999999", "3.5913939"),
                35029,
                35
            ),
            Commune(
                1221,
                "بني عمران",
                "Beni Amrane",
                LatLng("36.6583927", "3.576207699999999"),
                35030,
                35
            ),
            Commune(
                1222,
                "سوق الحد",
                "Souk El Had",
                LatLng("36.69041170000001", "3.5863313"),
                35031,
                35
            ),
            Commune(
                1223,
                "بودواو البحري",
                "Boudouaou El Bahri",
                LatLng("36.7606292", "3.394332"),
                35032,
                35
            ),
            Commune(
                1224,
                "أولاد هداج",
                "Ouled Hedadj",
                LatLng("36.7082162", "3.3439291"),
                35033,
                35
            ),
            Commune(
                1225,
                "لڨاطة",
                "Laghata",
                LatLng("36.7792958", "3.6724649"),
                35035,
                35
            ),
            Commune(
                1226,
                "حمادي",
                "Hammedi",
                LatLng("36.67812309999999", "3.2633918"),
                35036,
                35
            ),
            Commune(
                1227,
                "خميس الخشنة",
                "Khemis El Khechna",
                LatLng("36.63859329999999", "3.3288183"),
                35037,
                35
            ),
            Commune(
                1228,
                "الخروبة",
                "El Kharrouba",
                LatLng("36.6141776", "3.4296446"),
                35038,
                35
            ),
            Commune(
                1230,
                "الطارف",
                "El Tarf",
                LatLng("36.72988290000001", "8.2869478"),
                36001,
                36
            ),
            Commune(
                1231,
                "بوحجار",
                "Bouhadjar",
                LatLng("36.52750789999999", "8.112011599999999"),
                36002,
                36
            ),
            Commune(
                1232,
                "بن مهيدى",
                "Ben Mhidi",
                LatLng("36.7508388", "7.981084500000001"),
                36003,
                36
            ),
            Commune(
                1233,
                "بوڨوس",
                "Bougous",
                LatLng("36.68089880000001", "8.374571699999999"),
                36004,
                36
            ),
            Commune(
                1234,
                "القالة",
                "El Kala",
                LatLng("36.8904568", "8.4450763"),
                36005,
                36
            ),
            Commune(
                1235,
                "عين العسل",
                "Ain El Assel",
                LatLng("36.7947505", "8.429389100000002"),
                36006,
                36
            ),
            Commune(
                1236,
                "العيون",
                "El Aioun",
                LatLng("36.82329290000001", "8.6270628"),
                36007,
                36
            ),
            Commune(
                1237,
                "بوثلجة",
                "Bouteldja",
                LatLng("36.7787756", "8.1994276"),
                36008,
                36
            ),
            Commune(
                1238,
                "السوارخ",
                "Souarekh",
                LatLng("36.8791039", "8.594081399999999"),
                36009,
                36
            ),
            Commune(
                1239,
                "بريحان",
                "Berrihane",
                LatLng("36.8305549", "8.068343000000002"),
                36010,
                36
            ),
            Commune(
                1240,
                "بحيرة الطيور",
                "Lac Des Oiseaux",
                LatLng("36.7748272", "8.101092000000001"),
                36011,
                36
            ),
            Commune(
                1241,
                "الشافية",
                "Chefia",
                LatLng("36.6562562", "8.112011599999999"),
                36012,
                36
            ),
            Commune(
                1242,
                "درين",
                "Drean",
                LatLng("36.6696", "7.75954"),
                36013,
                36
            ),
            Commune(
                1243,
                "ولاية الطارف",
                "Chihani",
                LatLng("36.7558581", "8.2212979"),
                36014,
                36
            ),
            Commune(
                1244,
                "شبايتة مختار",
                "Chebaita Mokhtar",
                LatLng("36.75583", "7.74167"),
                36015,
                36
            ),
            Commune(
                1245,
                "البسباس",
                "Besbes",
                LatLng("36.7195675", "7.806885100000001"),
                36016,
                36
            ),
            Commune(
                1246,
                "عصفور",
                "Asfour",
                LatLng("36.6651214", "7.981084500000001"),
                36017,
                36
            ),
            Commune(
                1247,
                "اﻟﺸﻂ",
                "Echatt",
                LatLng("36.8123586", "7.861276699999999"),
                36018,
                36
            ),
            Commune(
                1248,
                "زريزر",
                "Zerizer",
                LatLng("36.7238061", "7.904820000000001"),
                36019,
                36
            ),
            Commune(
                1249,
                "الزيتونة",
                "Zitouna",
                LatLng("36.6472292", "8.243174699999999"),
                36020,
                36
            ),
            Commune(
                1250,
                "عين الكرمة",
                "Ain Kerma",
                LatLng("36.5644539", "8.1994276"),
                36021,
                36
            ),
            Commune(
                1251,
                "واد الزيتون",
                "Oued Zitoun",
                LatLng("36.4359809", "8.0356087"),
                36022,
                36
            ),
            Commune(
                1252,
                "حمام بني صالح",
                "Hammam Beni Salah",
                LatLng("36.53636100000001", "7.981084500000002"),
                36023,
                36
            ),
            Commune(
                1253,
                "رمل السوق",
                "Raml Souk",
                LatLng("36.78652390000001", "8.5355489"),
                36024,
                36
            ),
            Commune(
                1254,
                "تندوف",
                "Tindouf",
                LatLng("27.6761012", "-8.127652600000001"),
                37001,
                37
            ),
            Commune(
                1255,
                "ولاية تندوف‎",
                "Oum El Assel",
                LatLng("27.8063119", "-5.729982100000001"),
                37002,
                37
            ),
            Commune(
                1256,
                "تيسمسيلت",
                "Tissemsilt",
                LatLng("35.6015182", "1.8074586"),
                38001,
                38
            ),
            Commune(
                1257,
                "برج بونعامة",
                "Bordj Bou Naama",
                LatLng("35.8526248", "1.615375"),
                38002,
                38
            ),
            Commune(
                1258,
                "ولاية تيسمسيلت",
                "Theniet El Had",
                LatLng("35.6382064", "1.9099238"),
                38003,
                38
            ),
            Commune(
                1259,
                "لزهرية",
                "Lazharia",
                LatLng("35.9350445", "1.5620347"),
                38004,
                38
            ),
            Commune(
                1260,
                "بني شايب",
                "Beni Chaib",
                LatLng("35.82028", "1.79944"),
                38005,
                38
            ),
            Commune(
                1261,
                "لرجام",
                "Lardjem",
                LatLng("35.7471861", "1.5450766"),
                38006,
                38
            ),
            Commune(
                1262,
                "ملاب",
                "Melaab",
                LatLng("35.717", "1.333"),
                38007,
                38
            ),
            Commune(
                1263,
                "الجزائر",
                "Sidi Lantri",
                LatLng("35.69617710000001", "1.5064654"),
                38008,
                38
            ),
            Commune(
                1264,
                "برج الأمير عبد القادر",
                "Bordj El Emir Abdelkader",
                LatLng("35.864058", "2.260577499999999"),
                38009,
                38
            ),
            Commune(
                1265,
                "العيون",
                "Layoune",
                LatLng("35.6887221", "1.9954938"),
                38010,
                38
            ),
            Commune(
                1266,
                "خميستى",
                "Khemisti",
                LatLng("35.6674352", "1.961246"),
                38011,
                38
            ),
            Commune(
                1267,
                "أولاد بسام",
                "Ouled Bessem",
                LatLng("35.683333", "1.866666999999999"),
                38012,
                38
            ),
            Commune(
                1268,
                "عماري",
                "Ammari",
                LatLng("35.5771", "1.6623"),
                38013,
                38
            ),
            Commune(
                1269,
                "يوسوفية",
                "Youssoufia",
                LatLng("35.94806", "2.11278"),
                38014,
                38
            ),
            Commune(
                1270,
                "سيدي بوتوشنت",
                "Sidi Boutouchent",
                LatLng("35.8252207", "1.948409799999999"),
                38015,
                38
            ),
            Commune(
                1271,
                "الأربعاء",
                "Larbaa",
                LatLng("35.914928", "1.47243"),
                38016,
                38
            ),
            Commune(
                1272,
                "معاصم",
                "Maasem",
                LatLng("35.65868", "1.552266"),
                38017,
                38
            ),
            Commune(
                1273,
                "سيدي عابد",
                "Sidi Abed",
                LatLng("35.7422684", "1.7076637"),
                38018,
                38
            ),
            Commune(
                1274,
                "تاملحت",
                "Tamalaht",
                LatLng("35.82348", "1.61306"),
                38019,
                38
            ),
            Commune(
                1275,
                "الجزائر",
                "Sidi Slimane",
                LatLng("35.8651956", "1.6842771"),
                38020,
                38
            ),
            Commune(
                1276,
                "بوقائد",
                "Boucaid",
                LatLng("35.8907698", "1.615375"),
                38021,
                38
            ),
            Commune(
                1277,
                "بني لحسن",
                "Beni Lahcene",
                LatLng("35.8148108", "1.6894332"),
                38022,
                38
            ),
            Commune(
                1278,
                "الوادي",
                "El Oued",
                LatLng("33.3713397", "6.8479682"),
                39001,
                39
            ),
            Commune(
                1279,
                "الرباح",
                "Robbah",
                LatLng("33.2859695", "6.9048148"),
                39002,
                39
            ),
            Commune(
                1280,
                "وادي العلندة",
                "Oued El Alenda",
                LatLng("33.2383162", "6.7547522"),
                39003,
                39
            ),
            Commune(
                1281,
                "البياضة",
                "Bayadha",
                LatLng("33.32093570000001", "6.893041800000001"),
                39004,
                39
            ),
            Commune(
                1282,
                "النخلة",
                "Nakhla",
                LatLng("33.2806326", "6.9504378"),
                39005,
                39
            ),
            Commune(
                1283,
                "قمار",
                "Guemar",
                LatLng("33.5092788", "6.8029489"),
                39006,
                39
            ),
            Commune(
                1284,
                "كوينين",
                "Kouinine",
                LatLng("33.40181340000001", "6.829740300000001"),
                39007,
                39
            ),
            Commune(
                1285,
                "الرقيبة",
                "Reguiba",
                LatLng("33.5638323", "6.722641"),
                39008,
                39
            ),
            Commune(
                1286,
                "الحمراية",
                "Hamraia",
                LatLng("34.1108764", "6.230386699999999"),
                39009,
                39
            ),
            Commune(
                1287,
                "تغزوت",
                "Taghzout",
                LatLng("33.470536", "6.797592000000001"),
                39010,
                39
            ),
            Commune(
                1288,
                "الدبيلة",
                "Debila",
                LatLng("33.5148096", "6.952532799999999"),
                39011,
                39
            ),
            Commune(
                1289,
                "حساني عبد الكريم",
                "Hassani Abdelkrim",
                LatLng("33.4763609", "6.894084599999999"),
                39012,
                39
            ),
            Commune(
                1290,
                "حاسي خليفة",
                "Hassi Khelifa",
                LatLng("33.5601263", "6.9907197"),
                39013,
                39
            ),
            Commune(
                1291,
                "طالب العربي",
                "Taleb Larbi",
                LatLng("33.7091203", "7.394882000000001"),
                39014,
                39
            ),
            Commune(
                1292,
                "دوار الماء",
                "Douar El Ma",
                LatLng("32.66785710000001", "7.611421700000002"),
                39015,
                39
            ),
            Commune(
                1293,
                "سيدي عيون",
                "Sidi Aoun",
                LatLng("33.5667", "6.93333"),
                39016,
                39
            ),
            Commune(
                1294,
                "الطريفاوي",
                "Trifaoui",
                LatLng("33.4196537", "6.935674"),
                39017,
                39
            ),
            Commune(
                1295,
                "المقرن",
                "Magrane",
                LatLng("33.56150909999999", "6.9308492"),
                39018,
                39
            ),
            Commune(
                1296,
                "بنى قشة",
                "Beni Guecha",
                LatLng("34.0327057", "7.179025999999999"),
                39019,
                39
            ),
            Commune(
                1297,
                "ورماس",
                "Ourmas",
                LatLng("33.4141525", "6.782862600000001"),
                39020,
                39
            ),
            Commune(
                1298,
                "سطيل",
                "Still",
                LatLng("34.3284258", "5.772120399999999"),
                39021,
                39
            ),
            Commune(
                1299,
                "مرارة",
                "Mrara",
                LatLng("33.47042", "5.662538"),
                39022,
                39
            ),
            Commune(
                1300,
                "سيدي خليل",
                "Sidi Khellil",
                LatLng("33.8381481", "5.9607892"),
                39023,
                39
            ),
            Commune(
                1301,
                "تندلة",
                "Tendla",
                LatLng("33.6745734", "6.033511400000001"),
                39024,
                39
            ),
            Commune(
                1302,
                "العقلة،الواد",
                "El Ogla",
                LatLng("33.24607880000001", "6.943726600000001"),
                39025,
                39
            ),
            Commune(
                1303,
                "أميه ونسة",
                "Mih Ouansa",
                LatLng("33.197504", "6.707928700000001"),
                39026,
                39
            ),
            Commune(
                1304,
                "المغير",
                "El Mghair",
                LatLng("33.9327331", "5.9304039"),
                39027,
                39
            ),
            Commune(
                1305,
                "جمعة",
                "Djamaa",
                LatLng("33.520420", "5.958111"),
                39028,
                39
            ),
            Commune(
                1306,
                "أم طيور",
                "Oum Touyour",
                LatLng("34.1533", "5.83333"),
                39029,
                39
            ),
            Commune(
                1307,
                "سيدي عمران",
                "Sidi Amrane",
                LatLng("33.49177", "5.98637"),
                39030,
                39
            ),
            Commune(
                1308,
                "خنشلة‎",
                "Khenchela",
                LatLng("35.4309947", "7.1467072"),
                40001,
                40
            ),
            Commune(
                1309,
                "متوسة",
                "Mtoussa",
                LatLng("33.49177", "5.98637"),
                40002,
                40
            ),
            Commune(
                1310,
                "قايس",
                "Kais",
                LatLng("35.4929142", "6.9262805"),
                40003,
                40
            ),
            Commune(
                1311,
                "بغاي",
                "Baghai",
                LatLng("35.5215422", "7.1130582"),
                40004,
                40
            ),
            Commune(
                1312,
                "الحامة",
                "El Hamma",
                LatLng("35.4646303", "7.0848063"),
                40005,
                40
            ),
            Commune(
                1313,
                "عين طويلة",
                "Ain Touila",
                LatLng("35.44189190000001", "7.464693700000001"),
                40006,
                40
            ),
            Commune(
                1314,
                "توزيانات",
                "Taouzianat",
                LatLng("35.4519", "6.75688"),
                40007,
                40
            ),
            Commune(
                1315,
                "بوحمامة",
                "Bouhmama",
                LatLng("35.3202828", "6.7467229"),
                40008,
                40
            ),
            Commune(
                1316,
                "الولجة",
                "El Oueldja",
                LatLng("37.017", "6.35"),
                40009,
                40
            ),
            Commune(
                1317,
                "الرميلة",
                "Remila",
                LatLng("35.5721583", "6.898108299999999"),
                40010,
                40
            ),
            Commune(
                1318,
                "ششار",
                "Cherchar",
                LatLng("35.0372584", "7.0095263"),
                40011,
                40
            ),
            Commune(
                1319,
                "جلال",
                "Djellal",
                LatLng("34.9191877", "6.8927435"),
                40012,
                40
            ),
            Commune(
                1320,
                "بابار",
                "Babar",
                LatLng("35.1688096", "7.100948799999999"),
                40013,
                40
            ),
            Commune(
                1321,
                "طامزة",
                "Tamza",
                LatLng("35.316667", "6.833333"),
                40014,
                40
            ),
            Commune(
                1322,
                "أنسيغة",
                "Ensigha",
                LatLng("35.39722", "7.14306"),
                40015,
                40
            ),
            Commune(
                1323,
                "شارع عيساوي يوسف",
                "Ouled Rechache",
                LatLng("35.29562159999999", "7.352415399999999"),
                40016,
                40
            ),
            Commune(
                1324,
                "المهمل",
                "El Mahmal",
                LatLng("35.21331", "7.26179"),
                40017,
                40
            ),
            Commune(
                1325,
                "مصارة",
                "Msara",
                LatLng("35.2382122", "6.5743349"),
                40018,
                40
            ),
            Commune(
                1326,
                "يابوس",
                "Yabous",
                LatLng("35.41198809999999", "6.643769"),
                40019,
                40
            ),
            Commune(
                1327,
                "خيران",
                "Khirane",
                LatLng("34.9986118", "6.760774899999999"),
                40020,
                40
            ),
            Commune(
                1328,
                "شلية",
                "Chelia",
                LatLng("35.3634675", "6.780184900000001"),
                40021,
                40
            ),
            Commune(
                1329,
                "سوق أهراس",
                "Souk Ahras",
                LatLng("36.2695872", "7.948389799999999"),
                41001,
                41
            ),
            Commune(
                1330,
                "سدراتة",
                "Sedrata",
                LatLng("36.13085600000001", "7.532565999999999"),
                41002,
                41
            ),
            Commune(
                1331,
                "حنانشة",
                "Hanancha",
                LatLng("36.2627227", "7.769111"),
                41003,
                41
            ),
            Commune(
                1332,
                "مشروحة",
                "Mechroha",
                LatLng("36.35", "7.83333"),
                41004,
                41
            ),
            Commune(
                1333,
                "أولاد دريس",
                "Ouled Driss",
                LatLng("36.35845899999999", "8.024135999999999"),
                41005,
                41
            ),
            Commune(
                1334,
                "تيفاش",
                "Tiffech",
                LatLng("36.1911936", "7.787857900000001"),
                41006,
                41
            ),
            Commune(
                1335,
                "الزعرورية",
                "Zaarouria",
                LatLng("36.228617", "7.956561999999997"),
                41007,
                41
            ),
            Commune(
                1336,
                "تاورة",
                "Taoura",
                LatLng("36.163447", "8.0437909"),
                41008,
                41
            ),
            Commune(
                1337,
                "الدريعة",
                "Drea",
                LatLng("36.12162190000001", "7.8816843"),
                41009,
                41
            ),
            Commune(
                1338,
                "حدادة",
                "Haddada",
                LatLng("36.22984699999999", "8.333485099999999"),
                41010,
                41
            ),
            Commune(
                1339,
                "الخضارة",
                "Khedara",
                LatLng("36.284474", "8.3225325"),
                41011,
                41
            ),
            Commune(
                1340,
                "المراهنة",
                "Merahna",
                LatLng("36.1966832", "8.150243300000001"),
                41012,
                41
            ),
            Commune(
                1341,
                "أولاد مؤمن",
                "Ouled Moumen",
                LatLng("36.3834462", "8.330746800000002"),
                41013,
                41
            ),
            Commune(
                1342,
                "بئر بوحوش",
                "Bir Bouhouche",
                LatLng("36.0140333", "7.4300234"),
                41014,
                41
            ),
            Commune(
                1343,
                "مداوروش",
                "Mdaourouche",
                LatLng("36.07567619999999", "7.820479099999998"),
                41015,
                41
            ),
            Commune(
                1344,
                "أم العظائم",
                "Oum El Adhaim",
                LatLng("36.0302067", "7.6032892"),
                41016,
                41
            ),
            Commune(
                1345,
                "عين الزانة",
                "Ain Zana",
                LatLng("36.40118669999999", "8.1912279"),
                41017,
                41
            ),
            Commune(
                1346,
                "عين سلطان",
                "Ain Soltane",
                LatLng("36.180519", "7.37017"),
                41018,
                41
            ),
            Commune(
                1347,
                "الجزائر",
                "Quillen",
                LatLng("36.22780999999999", "8.065292499999998"),
                41019,
                41
            ),
            Commune(
                1348,
                "سيدي فرج",
                "Sidi Fredj",
                LatLng("36.153809", "8.19548"),
                41020,
                41
            ),
            Commune(
                1349,
                "سافل الويدان",
                "Safel El Ouiden",
                LatLng("35.9296769", "7.491564200000002"),
                41021,
                41
            ),
            Commune(
                1350,
                "رقوبة",
                "Ragouba",
                LatLng("36.124939", "7.66722"),
                41022,
                41
            ),
            Commune(
                1351,
                "خميسة",
                "Khemissa",
                LatLng("36.194568", "7.6520984"),
                41023,
                41
            ),
            Commune(
                1352,
                "وادي الكبريت",
                "Oued Keberit",
                LatLng("35.9246613", "7.917071299999998"),
                41024,
                41
            ),
            Commune(
                1353,
                "ترقالت",
                "Terraguelt",
                LatLng("35.884391", "7.597868099999999"),
                41025,
                41
            ),
            Commune(
                1354,
                "الزوابى",
                "Zouabi",
                LatLng("35.95890070000001", "8.1409343"),
                41026,
                41
            ),
            Commune(
                1355,
                "تيبازة",
                "Tipaza",
                LatLng("36.61787859999999", "2.3912362"),
                42001,
                42
            ),
            Commune(
                1356,
                "مناصر",
                "Menaceur",
                LatLng("36.4803387", "2.2433487"),
                42002,
                42
            ),
            Commune(
                1357,
                "الأرهاط",
                "Larhat",
                LatLng("36.55701620000001", "1.8023093"),
                42003,
                42
            ),
            Commune(
                1358,
                "دواودة",
                "Douaouda",
                LatLng("36.6785804", "2.7972634"),
                42004,
                42
            ),
            Commune(
                1359,
                "بورقيقة",
                "Bourkika",
                LatLng("36.48585949999999", "2.509891399999999"),
                42005,
                42
            ),
            Commune(
                1360,
                "خميستي",
                "Khemisti",
                LatLng("36.6170732", "2.6834778"),
                42006,
                42
            ),
            Commune(
                1361,
                "أغابال",
                "Aghabal",
                LatLng("36.49194", "1.83917"),
                42010,
                42
            ),
            Commune(
                1362,
                "حجوط",
                "Hadjout",
                LatLng("36.5124409", "2.4141276"),
                42012,
                42
            ),
            Commune(
                1363,
                "سيدي عمر",
                "Sidi Amar",
                LatLng("36.5330597", "2.312303099999999"),
                42013,
                42
            ),
            Commune(
                1364,
                "ڨوراية",
                "Gouraya",
                LatLng("36.5290373", "1.9294681"),
                42014,
                42
            ),
            Commune(
                1365,
                "الناظور",
                "Nodor",
                LatLng("36.5805948", "2.366554899999999"),
                42015,
                42
            ),
            Commune(
                1366,
                "الشعيبة",
                "Chaiba",
                LatLng("36.6106665", "2.728219"),
                42016,
                42
            ),
            Commune(
                1367,
                "عين تڨورايت",
                "Ain Tagourait",
                LatLng("36.5868863", "2.584206199999999"),
                42017,
                42
            ),
            Commune(
                1368,
                "شرشال",
                "Cherchel",
                LatLng("36.56750399999999", "2.2039933"),
                42022,
                42
            ),
            Commune(
                1369,
                "الداموس",
                "Damous",
                LatLng("36.50001759999999", "1.7052325"),
                42023,
                42
            ),
            Commune(
                1370,
                "مراد",
                "Meurad",
                LatLng("36.4670595", "2.3714901"),
                42024,
                42
            ),
            Commune(
                1371,
                "فوكة",
                "Fouka",
                LatLng("36.65863160000001", "2.7530936"),
                42025,
                42
            ),
            Commune(
                1372,
                "بو اسماعيل",
                "Bou Ismail",
                LatLng("36.6381992", "2.7033575"),
                42026,
                42
            ),
            Commune(
                1373,
                "حمر العين",
                "Ahmer El Ain",
                LatLng("36.5062122", "2.5693337"),
                42027,
                42
            ),
            Commune(
                1374,
                "بوهارون",
                "Bou Haroun",
                LatLng("36.6177382", "2.6536742"),
                42030,
                42
            ),
            Commune(
                1375,
                "سيدي غيلاس",
                "Sidi Ghiles",
                LatLng("36.5583006", "2.1155691"),
                42032,
                42
            ),
            Commune(
                1376,
                "مسلمون",
                "Messelmoun",
                LatLng("36.4845193", "2.0077316"),
                42033,
                42
            ),
            Commune(
                1377,
                "سيدي راشد",
                "Sidi Rached",
                LatLng("36.5502644", "2.5296971"),
                42034,
                42
            ),
            Commune(
                1378,
                "القليعة",
                "Kolea",
                LatLng("36.6432441", "2.7708021"),
                42035,
                42
            ),
            Commune(
                1379,
                "حطاطبة",
                "Attatba",
                LatLng("36.558707", "2.6387795"),
                42036,
                42
            ),
            Commune(
                1380,
                "سيدي سميان",
                "Sidi Semiane",
                LatLng("36.48317970000001", "2.086133"),
                42040,
                42
            ),
            Commune(
                1381,
                "بني ميلك",
                "Beni Milleuk",
                LatLng("36.4455299", "1.7344155"),
                42041,
                42
            ),
            Commune(
                1382,
                "حجرة النص",
                "Hadjerat Ennous",
                LatLng("36.5593263", "2.0567163"),
                42042,
                42
            ),
            Commune(
                1383,
                "ميلة",
                "Mila",
                LatLng("36.4512301", "6.2535257"),
                43001,
                43
            ),
            Commune(
                1384,
                "فرجيوة",
                "Ferdjioua",
                LatLng("36.4084009", "5.9304039"),
                43002,
                43
            ),
            Commune(
                1385,
                "شلغوم العيد",
                "Chelghoum Laid",
                LatLng("36.1464769", "6.195132"),
                43003,
                43
            ),
            Commune(
                1386,
                "وادي العثمانية",
                "Oued Athmenia",
                LatLng("36.2900333", "6.3438785"),
                43004,
                43
            ),
            Commune(
                1387,
                "عين ملوك",
                "Ain Mellouk",
                LatLng("36.2557129", "6.173911599999999"),
                43005,
                43
            ),
            Commune(
                1388,
                "التلاغمة",
                "Telerghma",
                LatLng("36.0737429", "6.343878499999999"),
                43006,
                43
            ),
            Commune(
                1389,
                "وادى سقن",
                "Oued Seguen",
                LatLng("36.199047", "6.429036"),
                43007,
                43
            ),
            Commune(
                1390,
                "تاجنانت",
                "Tadjenanet",
                LatLng("36.1345369", "6.0044121"),
                43008,
                43
            ),
            Commune(
                1391,
                "بن يحيى عبد الرحمان",
                "Benyahia Abderrahmane",
                LatLng("36.22109409999999", "6.0044121"),
                43009,
                43
            ),
            Commune(
                1392,
                "واد النجاء",
                "Oued Endja",
                LatLng("36.5219186", "6.2092485"),
                43010,
                43
            ),
            Commune(
                1393,
                "أحمد راشدي",
                "Ahmed Rachedi",
                LatLng("36.3442991", "6.1314928"),
                43011,
                43
            ),
            Commune(
                1394,
                "أولاد خلوف",
                "Ouled Khalouf",
                LatLng("36.0002537", "6.089103199999999"),
                43012,
                43
            ),
            Commune(
                1395,
                "تيبرڨنت",
                "Tiberguent",
                LatLng("36.4020351", "6.0573302"),
                43013,
                43
            ),
            Commune(
                1396,
                "بوحاتم",
                "Bouhatem",
                LatLng("36.3054223", "6.0467429"),
                43014,
                43
            ),
            Commune(
                1397,
                "الرواشد",
                "Rouached",
                LatLng("36.4699357", "5.9938339"),
                43015,
                43
            ),
            Commune(
                1398,
                "تسالة لمطاي",
                "Tessala Lamatai",
                LatLng("36.440992", "6.257572"),
                43016,
                43
            ),
            Commune(
                1399,
                "القرارم قوقة",
                "Grarem Gouga",
                LatLng("36.5232782", "6.317290600000001"),
                43017,
                43
            ),
            Commune(
                1400,
                "سيدي مروان",
                "Sidi Merouane",
                LatLng("36.4999929", "6.2482149"),
                43018,
                43
            ),
            Commune(
                1401,
                "ولاية ميلة",
                "Tassadane Haddada",
                LatLng("36.2500705", "6.2915786"),
                43019,
                43
            ),
            Commune(
                1402,
                "دراجي بوصلاح",
                "Derradji Bousselah",
                LatLng("36.3117689", "5.9198387"),
                43020,
                43
            ),
            Commune(
                1403,
                "مينار زارزة",
                "Minar Zarza",
                LatLng("36.5377483", "5.930403900000001"),
                43021,
                43
            ),
            Commune(
                1404,
                "أميرة عراس",
                "Amira Arras",
                LatLng("36.321941", "6.39639"),
                43022,
                43
            ),
            Commune(
                1405,
                "ترعي باينان",
                "Terrai Bainen",
                LatLng("36.5485751", "6.142094699999999"),
                43023,
                43
            ),
            Commune(
                1406,
                "حمالة",
                "Hamala",
                LatLng("36.5731327", "6.3412192"),
                43024,
                43
            ),
            Commune(
                1407,
                "عين التين",
                "Ain Tine",
                LatLng("36.3962417", "6.325265799999999"),
                43025,
                43
            ),
            Commune(
                1408,
                "المشيرة",
                "El Mechira",
                LatLng("36.0370883", "6.216359699999999"),
                43026,
                43
            ),
            Commune(
                1409,
                "سيدي خليفة",
                "Sidi Khelifa",
                LatLng("36.3649586", "6.2535257"),
                43027,
                43
            ),
            Commune(
                1410,
                "ميلة",
                "Zeghaia",
                LatLng("36.4512301", "6.2535257"),
                43028,
                43
            ),
            Commune(
                1411,
                "العياضي برباس",
                "Elayadi Barbes",
                LatLng("36.4351668", "5.824835200000002"),
                43029,
                43
            ),
            Commune(
                1412,
                "عين البيضاء حريش",
                "Ain Beida Harriche",
                LatLng("36.389948", "5.8670405"),
                43030,
                43
            ),
            Commune(
                1413,
                "يحيى بني ڨشة",
                "Yahia Beniguecha",
                LatLng("36.383658", "5.993833899999999"),
                43031,
                43
            ),
            Commune(
                1414,
                "الشيقارة",
                "Chigara",
                LatLng("36.5605977", "6.2216678"),
                43032,
                43
            ),
            Commune(
                1414,
                "عين الدفلى‎",
                "Ain Defla",
                LatLng("36.263186", "1.9641065"),
                44001,
                44
            ),
            Commune(
                1415,
                "مليانة",
                "Miliana",
                LatLng("36.3181921", "2.2335066"),
                44002,
                44
            ),
            Commune(
                1416,
                "بو مدفع",
                "Boumedfaa",
                LatLng("36.3450137", "2.5197932"),
                44003,
                44
            ),
            Commune(
                1417,
                "خميس مليانة",
                "Khemis Miliana",
                LatLng("36.2535274", "2.2138289"),
                44004,
                44
            ),
            Commune(
                1418,
                "حمام ريغة",
                "Hammam Righa",
                LatLng("36.3915345", "2.3616203"),
                44005,
                44
            ),
            Commune(
                1419,
                "عريب",
                "Arib",
                LatLng("36.3540148", "2.0469151"),
                44006,
                44
            ),
            Commune(
                1420,
                "جليدة",
                "Djelida",
                LatLng("36.1798746", "2.086133"),
                44007,
                44
            ),
            Commune(
                1421,
                "العامرة",
                "El Amra",
                LatLng("36.3571923", "1.851343"),
                44008,
                44
            ),
            Commune(
                1422,
                "بوراشد",
                "Bourached",
                LatLng("36.1824916", "1.9294681"),
                44009,
                44
            ),
            Commune(
                1423,
                "العطاف",
                "El Attaf",
                LatLng("36.2184385", "1.7052325"),
                44010,
                44
            ),
            Commune(
                1424,
                "العبادية",
                "El Abadia",
                LatLng("36.2733492", "1.6566377"),
                44011,
                44
            ),
            Commune(
                1425,
                "جندل",
                "Djendel",
                LatLng("36.2181875", "2.4136924"),
                44012,
                44
            ),
            Commune(
                1426,
                "واد الشرفاء",
                "Oued Chorfa",
                LatLng("36.1383732", "2.5495112"),
                44013,
                44
            ),
            Commune(
                1427,
                "عين الأشياخ",
                "Ain Lechiakh",
                LatLng("36.1305702", "2.401112399999999"),
                44014,
                44
            ),
            Commune(
                1428,
                "واد الجمعة",
                "Oued Djemaa",
                LatLng("36.04442969999999", "2.3616203"),
                44015,
                44
            ),
            Commune(
                1429,
                "الروينة",
                "Rouina",
                LatLng("36.2384198", "1.822081799999999"),
                44016,
                44
            ),
            Commune(
                1430,
                "زدين",
                "Zeddine",
                LatLng("36.15159769999999", "1.8220818"),
                44017,
                44
            ),
            Commune(
                1431,
                "الحسنية",
                "El Hassania",
                LatLng("36.0086314", "1.9294681"),
                44018,
                44
            ),
            Commune(
                1432,
                "بئر أولاد خليفة",
                "Bir Ouled Khelifa",
                LatLng("36.1884431", "2.2138289"),
                44019,
                44
            ),
            Commune(
                1433,
                "عين سلطان",
                "Ain Soltane",
                LatLng("36.1331659", "4.7342204"),
                44020,
                44
            ),
            Commune(
                1434,
                "طارق إبن زياد",
                "Tarik Ibn Ziad",
                LatLng("35.9611096", "2.1646722"),
                44021,
                44
            ),
            Commune(
                1435,
                "برج الأمير خالد",
                "Bordj Emir Khaled",
                LatLng("36.09160809999999", "2.1646722"),
                44022,
                44
            ),
            Commune(
                1436,
                "عين تركي",
                "Ain Torki",
                LatLng("36.3497591", "2.2827384"),
                44023,
                44
            ),
            Commune(
                1437,
                "سيدي لخضر",
                "Sidi Lakhdar",
                LatLng("36.1618701", "0.4431618000000001"),
                44024,
                44
            ),
            Commune(
                1438,
                "بن علال",
                "Ben Allal",
                LatLng("36.3519477", "2.1646722"),
                44025,
                44
            ),
            Commune(
                1439,
                "عين البنيان",
                "Ain Benian",
                LatLng("36.3533538", "2.3764258"),
                44026,
                44
            ),
            Commune(
                1440,
                "حسينية",
                "Hoceinia",
                LatLng("36.3041215", "2.4011124"),
                44027,
                44
            ),
            Commune(
                1441,
                "بربوش",
                "Barbouche",
                LatLng("36.0961767", "2.4900943"),
                44028,
                44
            ),
            Commune(
                1442,
                "الجمعة أولاد الشيخ",
                "Djemaa Ouled Chikh",
                LatLng("36.09432950000001", "2.0077316"),
                44029,
                44
            ),
            Commune(
                1443,
                "المخاطرية",
                "Mekhatria",
                LatLng("36.3446556", "1.9588007"),
                44030,
                44
            ),
            Commune(
                1444,
                "بطحية",
                "Bathia",
                LatLng("35.9346997", "1.7830973"),
                44031,
                44
            ),
            Commune(
                1445,
                "تشتة زقاغة",
                "Tachta Zegagha",
                LatLng("36.351118", "1.643438"),
                44032,
                44
            ),
            Commune(
                1446,
                "عين بويحي",
                "Ain Bouyahia",
                LatLng("36.3150386", "1.7733566"),
                44033,
                44
            ),
            Commune(
                1447,
                "الماين",
                "El Maine",
                LatLng("36.09858000000001", "1.7344155"),
                44034,
                44
            ),
            Commune(
                1448,
                "تبركانين",
                "Tiberkanine",
                LatLng("36.1541243", "1.6469253"),
                44035,
                44
            ),
            Commune(
                1449,
                "بلعاص",
                "Belaas",
                LatLng("35.9824454", "1.8512951"),
                44036,
                44
            ),
            Commune(
                1450,
                "النعامة",
                "Naama",
                LatLng("33.1683267", "-0.3748354"),
                45001,
                45
            ),
            Commune(
                1451,
                "المشرية",
                "Mechria",
                LatLng("33.5442772", "-0.2762707"),
                45002,
                45
            ),
            Commune(
                1452,
                "عين الصفراء‎",
                "Ain Sefra",
                LatLng("32.75633320000001", "-0.5778033"),
                45003,
                45
            ),
            Commune(
                1453,
                "تيوت",
                "Tiout",
                LatLng("32.7682249", "-0.4266584"),
                45004,
                45
            ),
            Commune(
                1454,
                "صفيصيفة",
                "Sfissifa",
                LatLng("32.8046166", "-0.9820667999999997"),
                45005,
                45
            ),
            Commune(
                1455,
                "مغرار",
                "Moghrar",
                LatLng("32.51616310000001", "-0.5754373"),
                45006,
                45
            ),
            Commune(
                1456,
                "عسلة",
                "Assela",
                LatLng("33.00570099999999", "-0.0793488"),
                45007,
                45
            ),
            Commune(
                1457,
                "جنين بورزق",
                "Djeniane Bourzeg",
                LatLng("32.397902", "-0.9438468"),
                45008,
                45
            ),
            Commune(
                1458,
                "عين بن خليل",
                "Ain Ben Khelil",
                LatLng("33.28855100000001", "-0.763049"),
                45009,
                45
            ),
            Commune(
                1459,
                "مكمن بن عمار",
                "Makman Ben Amer",
                LatLng("33.716667", "-0.7333329999999999"),
                45010,
                45
            ),
            Commune(
                1460,
                "قصدير",
                "Kasdir",
                LatLng("33.713589", "-1.375755"),
                45011,
                45
            ),
            Commune(
                1461,
                "البيوض",
                "El Biod",
                LatLng("33.7600866", "-0.1284404"),
                45012,
                45
            ),
            Commune(
                1462,
                "عين تموشنت",
                "Ain Temouchent",
                LatLng("35.3072501", "-1.1424514"),
                46001,
                46
            ),
            Commune(
                1463,
                "شعبة اللحم",
                "Chaabet El Ham",
                LatLng("35.3361405", "-1.1017334"),
                46002,
                46
            ),
            Commune(
                1464,
                "عين كيحل",
                "Ain Kihal",
                LatLng("35.2006828", "-1.2001181"),
                46003,
                46
            ),
            Commune(
                1465,
                "حمام بوحجر",
                "Hammam Bouhadjar",
                LatLng("35.3701948", "-0.9677300999999997"),
                46004,
                46
            ),
            Commune(
                1466,
                "بوزجار",
                "Bou Zedjar",
                LatLng("35.5795438", "-1.1424989"),
                46005,
                46
            ),
            Commune(
                1467,
                "واد بركاش",
                "Oued Berkeche",
                LatLng("35.2204682", "-0.9856518000000003"),
                46006,
                46
            ),
            Commune(
                1468,
                "آغلال",
                "Aghlal",
                LatLng("35.2019341", "-1.065797"),
                46007,
                46
            ),
            Commune(
                1469,
                "تارقة",
                "Terga",
                LatLng("35.4190324", "-1.1797022"),
                46008,
                46
            ),
            Commune(
                1470,
                "عين الأربعاء",
                "Ain El Arbaa",
                LatLng("35.4037488", "-0.8818151"),
                46009,
                46
            ),
            Commune(
                1471,
                "تامزوغة",
                "Tamzoura",
                LatLng("35.4133773", "-0.6607038999999999"),
                46010,
                46
            ),
            Commune(
                1472,
                "شنتوف",
                "Chentouf",
                LatLng("35.29988", "-1.0119509"),
                46011,
                46
            ),
            Commune(
                1473,
                "سيدي بن عدة",
                "Sidi Ben Adda",
                LatLng("35.3052158", "-1.1809029"),
                46012,
                46
            ),
            Commune(
                1474,
                "عقب الليل",
                "Aoubellil",
                LatLng("35.1379554", "-0.9928226000000001"),
                46013,
                46
            ),
            Commune(
                1475,
                "المالح",
                "El Malah",
                LatLng("35.3883099", "-1.0945436"),
                46014,
                46
            ),
            Commune(
                1476,
                "سيدي بومدين",
                "Sidi Boumediene",
                LatLng("35.35292740000001", "-0.8949292999999999"),
                46015,
                46
            ),
            Commune(
                1477,
                "واد صباح",
                "Oued Sabah",
                LatLng("35.3740738", "-0.8127369000000001"),
                46016,
                46
            ),
            Commune(
                1478,
                "أولاد بوجمعة",
                "Ouled Boudjemaa",
                LatLng("35.47096559999999", "-1.1917104"),
                46017,
                46
            ),
            Commune(
                1479,
                "عين الطلبة",
                "Ain Tolba",
                LatLng("35.25508370000001", "-1.2530057"),
                46018,
                46
            ),
            Commune(
                1480,
                "العامرية",
                "El Amria",
                LatLng("35.5259362", "-1.0179304"),
                46019,
                46
            ),
            Commune(
                1481,
                "حاسي الغلة",
                "Hassi El Ghella",
                LatLng("35.4544602", "-1.0514312"),
                46020,
                46
            ),
            Commune(
                1482,
                "حساسنة",
                "Hassasna",
                LatLng("35.273753", "-0.9880123000000002"),
                46021,
                46
            ),
            Commune(
                1483,
                "أولا الكيحل",
                "Ouled Kihal",
                LatLng("35.3733876", "-1.2217459"),
                46022,
                46
            ),
            Commune(
                1484,
                "بني صاف",
                "Beni Saf",
                LatLng("35.3004743", "-1.3710402"),
                46023,
                46
            ),
            Commune(
                1485,
                "سيدي صافي",
                "Sidi Safi",
                LatLng("35.2819277", "-1.3107772"),
                46024,
                46
            ),
            Commune(
                1486,
                "أولاسة الغرابة",
                "Oulhaca El Gheraba",
                LatLng("35.233060", "-1.504440"),
                46025,
                46
            ),
            Commune(
                1487,
                "تادمية",
                "Tadmaya",
                LatLng("35.24262340000001", "-1.4476979"),
                46026,
                46
            ),
            Commune(
                1488,
                "الأمير عبد القادر",
                "El Emir Abdelkader",
                LatLng("35.2204402", "-1.4072392"),
                46027,
                46
            ),
            Commune(
                1489,
                "المسعيد",
                "El Messaid",
                LatLng("35.541940", "-1.121940"),
                46028,
                46
            ),
            Commune(
                1490,
                "غرداية",
                "Ghardaia",
                LatLng("32.4902246", "3.6738412"),
                47001,
                47
            ),
            Commune(
                1491,
                "المنيعة",
                "El Meniaa",
                LatLng("30.59958869999999", "2.8876436"),
                47002,
                47
            ),
            Commune(
                1492,
                "ضاية بن ضحوة",
                "Dhayet Bendhahoua",
                LatLng("32.5634258", "3.4903196"),
                47003,
                47
            ),
            Commune(
                1493,
                "بريان",
                "Berriane",
                LatLng("32.83376689999999", "3.7718098"),
                47004,
                47
            ),
            Commune(
                1494,
                "متليلي",
                "Metlili",
                LatLng("32.29082619999999", "3.598988799999999"),
                47005,
                47
            ),
            Commune(
                1495,
                "القرارة",
                "El Guerrara",
                LatLng("32.7900544", "4.492221499999999"),
                47006,
                47
            ),
            Commune(
                1496,
                "العطف",
                "El Atteuf",
                LatLng("32.4766504", "3.7471211"),
                47007,
                47
            ),
            Commune(
                1497,
                "زلفانة",
                "Zelfana",
                LatLng("32.4101618", "4.2230836"),
                47008,
                47
            ),
            Commune(
                1498,
                "سبسب",
                "Sebseb",
                LatLng("32.1666038", "3.5838002"),
                47009,
                47
            ),
            Commune(
                1499,
                "بنورة",
                "Bounoura",
                LatLng("32.4633255", "3.6015207"),
                47010,
                47
            ),
            Commune(
                1500,
                "حاسي الفحل",
                "Hassi Fehal",
                LatLng("31.6027043", "3.6762683"),
                47011,
                47
            ),
            Commune(
                1501,
                "حاسي القارة",
                "Hassi Gara",
                LatLng("30.5472849", "2.9126022"),
                47012,
                47
            ),
            Commune(
                1502,
                "منصورة",
                "Mansoura",
                LatLng("31.9802146", "3.751126799999999"),
                47013,
                47
            ),
            Commune(
                1504,
                "غليزان",
                "Relizane",
                LatLng("35.7339361", "0.5588787"),
                48001,
                48
            ),
            Commune(
                1505,
                "وادي ارهيو",
                "Oued Rhiou",
                LatLng("35.96071070000001", "0.9199773"),
                48002,
                48
            ),
            Commune(
                1506,
                "بلعسل بوزقزة",
                "Belaassel Bouzegza",
                LatLng("35.84056", "0.49889"),
                48003,
                48
            ),
            Commune(
                1507,
                "سيدي سعادة",
                "Sidi Saada",
                LatLng("35.6760307", "0.3407167"),
                48004,
                48
            ),
            Commune(
                1508,
                "اولاد يعيش",
                "Ouled Aiche",
                LatLng("35.8255092", "0.9641466999999999"),
                48005,
                48
            ),
            Commune(
                1509,
                "سيدي لزرق",
                "Sidi Lazreg",
                LatLng("35.64668219999999", "0.7782418"),
                48006,
                48
            ),
            Commune(
                1510,
                "الحمادنة",
                "El Hamadna",
                LatLng("35.90454769999999", "0.774675"),
                48007,
                48
            ),
            Commune(
                1511,
                "سيدي محمد بن علي",
                "Sidi Mhamed Ben Ali",
                LatLng("36.1434513", "0.8413068"),
                48008,
                48
            ),
            Commune(
                1512,
                "مديونة",
                "Mediouna",
                LatLng("36.1263731", "0.7544692000000001"),
                48009,
                48
            ),
            Commune(
                1513,
                "سيدي خطاب",
                "Sidi Khettab",
                LatLng("35.91138839999999", "0.5139688"),
                48010,
                48
            ),
            Commune(
                1514,
                "عمي موسى",
                "Ammi Moussa",
                LatLng("35.86924309999999", "1.1089244"),
                48011,
                48
            ),
            Commune(
                1515,
                "زمورة",
                "Zemmoura",
                LatLng("35.7247051", "0.7509045"),
                48012,
                48
            ),
            Commune(
                1516,
                "بني درقون",
                "Beni Dergoun",
                LatLng("35.78", "0.8"),
                48013,
                48
            ),
            Commune(
                1517,
                "جديوية",
                "Djidiouia",
                LatLng("35.9259567", "0.8317813"),
                48014,
                48
            ),
            Commune(
                1518,
                "القطار",
                "El Guettar",
                LatLng("36.091951", "0.8246386"),
                48015,
                48
            ),
            Commune(
                1519,
                "حمري",
                "Hamri",
                LatLng("36.018841", "0.69018"),
                48016,
                48
            ),
            Commune(
                1520,
                "المطمر",
                "El Matmar",
                LatLng("35.731615", "0.4620312999999999"),
                48017,
                48
            ),
            Commune(
                1521,
                "سيدي امحمد بن عودة",
                "Sidi Mhamed Ben Aouda",
                LatLng("35.60265389999999", "0.5872689999999999"),
                48018,
                48
            ),
            Commune(
                1522,
                "عين طارق",
                "Ain Tarek",
                LatLng("35.7762676", "1.1377008"),
                48019,
                48
            ),
            Commune(
                1523,
                "واد السلام",
                "Oued Essalem",
                LatLng("35.5800262", "0.9259434000000001"),
                48020,
                48
            ),
            Commune(
                1524,
                "واريزان",
                "Ouarizane",
                LatLng("36.04656149999999", "0.8996991999999997"),
                48021,
                48
            ),
            Commune(
                1525,
                "مازونة",
                "Mazouna",
                LatLng("36.1187509", "0.8770472999999999"),
                48022,
                48
            ),
            Commune(
                1526,
                "القلعة",
                "Kalaa",
                LatLng("35.5803849", "0.3289585"),
                48023,
                48
            ),
            Commune(
                1527,
                "عين الرحمة",
                "Ain Rahma",
                LatLng("35.6246337", "0.3919059"),
                48024,
                48
            ),
            Commune(
                1528,
                "يلل",
                "Yellel",
                LatLng("35.7210595", "0.3536548"),
                48025,
                48
            ),
            Commune(
                1529,
                "واد الجمعة",
                "Oued El Djemaa",
                LatLng("35.7960821", "0.6796767000000001"),
                48026,
                48
            ),
            Commune(
                1530,
                "الرمكة",
                "Ramka",
                LatLng("35.8675295", "1.2818815"),
                48027,
                48
            ),
            Commune(
                1531,
                "منداس",
                "Mendes",
                LatLng("35.6474585", "0.8651302999999999"),
                48028,
                48
            ),
            Commune(
                1532,
                "لحلاف",
                "Lahlef",
                LatLng("35.8921599", "0.9796769999999999"),
                48029,
                48
            ),
            Commune(
                1533,
                "بني زنطيس",
                "Beni Zentis",
                LatLng("36.11139", "0.66361"),
                48030,
                48
            ),
            Commune(
                1534,
                "سوق الاحد",
                "Souk El Haad",
                LatLng("35.9550366", "1.248195"),
                48031,
                48
            ),
            Commune(
                1535,
                "دار بن عبد الله",
                "Dar Ben Abdellah",
                LatLng("35.6991649", "0.6832351"),
                48032,
                48
            ),
            Commune(
                1536,
                "الحاسي",
                "El Hassi",
                LatLng("35.77056", "1.05361"),
                48033,
                48
            ),
            Commune(
                1537,
                "حد الشكالة",
                "Had Echkalla",
                LatLng("35.6792524", "1.1484972"),
                48034,
                48
            ),
            Commune(
                1538,
                "بن داود",
                "Bendaoud",
                LatLng("35.7150028", "0.5186937999999999"),
                48035,
                48
            ),
            Commune(
                1539,
                "الولجة",
                "El Ouldja",
                LatLng("35.9072969", "1.1185143"),
                48036,
                48
            ),
            Commune(
                1540,
                "مرجة سيدي عابد",
                "Merdja Sidi Abed",
                LatLng("36.0038889", "0.9947222000000001"),
                48037,
                48
            ),
            Commune(
                1541,
                "ولاد سيدي ميهوب",
                "Ouled Sidi Mihoub",
                LatLng("35.97389", "0.69167"),
                48038,
                48
            )
        )}
    }
}