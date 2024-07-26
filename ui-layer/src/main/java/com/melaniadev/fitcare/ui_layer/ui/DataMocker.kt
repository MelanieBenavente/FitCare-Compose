package com.melaniadev.fitcare.ui_layer.ui

fun mockList(): List<domain.model.Customer> {
    val customersList = listOf(
        domain.model.Customer(
            "Alice",
            "01/04/23",
            "15/06/24",
            domain.model.Professional(
                "Dr. Smith",
                domain.model.Therapy.PHYSICAL,
                "https://picsum.photos/id/101/200/300"
            ),
            domain.model.Gender.FEMALE,
            "30",
            "60 ",
            "165 ",
            "alice@example.com",
            "+1234567890",
            "https://picsum.photos/id/201/200/300",
            listOf(
                domain.model.Visit("Initial Consultation", "02/04/23"),
                domain.model.Visit("Follow-up", "12/04/23")
            )
        ),
        domain.model.Customer(
            "Bob",
            "15/04/23",
            "30/06/24",
            domain.model.Professional(
                "Dr. Johnson",
                domain.model.Therapy.MASSAGE,
                "https://picsum.photos/id/102/200/300"
            ),
            domain.model.Gender.MALE,
            "35",
            "75 ",
            "175 ",
            "bob@example.com",
            "+1987654321",
            "https://picsum.photos/id/202/200/300",
            listOf(
                domain.model.Visit("Sports Massage", "16/04/23"),
                domain.model.Visit("Relaxation Massage", "25/04/23")
            )
        ),
        domain.model.Customer(
            "Eve",
            "10/04/23",
            "25/06/24",
            domain.model.Professional(
                "Dr. Lee",
                domain.model.Therapy.ACUPUNCTURE,
                "https://picsum.photos/id/103/200/300"
            ),
            domain.model.Gender.FEMALE,
            "40",
            "65 ",
            "170 ",
            "eve@example.com",
            "+1122334455",
            "https://picsum.photos/id/203/200/300",
            listOf(
                domain.model.Visit("Acupuncture Session", "11/04/23"),
                domain.model.Visit("Follow-up", "20/04/23")
            )
        ),
        domain.model.Customer(
            "Charlie",
            "05/05/23",
            "20/07/24",
            domain.model.Professional(
                "Dr. Martinez",
                domain.model.Therapy.CHIROPRACTIC,
                "https://picsum.photos/id/104/200/300"
            ),
            domain.model.Gender.MALE,
            "45",
            "80 ",
            "180 ",
            "charlie@example.com",
            "+1654321879",
            "https://picsum.photos/id/204/200/300",
            listOf(
                domain.model.Visit("Spinal Adjustment", "06/05/23"),
                domain.model.Visit("Follow-up", "15/05/23")
            )
        ),

        domain.model.Customer(
            "Edward",
            "20/07/23",
            "05/09/24",
            domain.model.Professional(
                "Dr. Kim",
                domain.model.Therapy.MASSAGE,
                "https://picsum.photos/id/106/200/300"
            ),
            domain.model.Gender.MALE,
            "32",
            "70 ",
            "175 ",
            "edward@example.com",
            "+1447896321",
            "https://picsum.photos/id/206/200/300",
            listOf(
                domain.model.Visit("Deep Tissue Massage", "21/07/23"),
                domain.model.Visit("Relaxation Massage", "30/07/23")
            )
        ),

        domain.model.Customer(
            "George",
            "25/09/23",
            "25/11/24",
            domain.model.Professional(
                "Dr. Lopez",
                domain.model.Therapy.CHIROPRACTIC,
                "https://picsum.photos/id/108/200/300"
            ),
            domain.model.Gender.MALE,
            "42",
            "85 ",
            "185 ",
            "george@example.com",
            "+1666999444",
            "https://picsum.photos/id/208/200/300",
            listOf(
                domain.model.Visit("Spinal Adjustment", "26/09/23"),
                domain.model.Visit("Follow-up", "05/10/23")
            )
        ),
        domain.model.Customer(
            "Hannah",
            "30/10/23",
            "30/12/24",
            domain.model.Professional(
                "Dr. Martinez",
                domain.model.Therapy.PHYSICAL,
                "https://picsum.photos/id/109/200/300"
            ),
            domain.model.Gender.FEMALE,
            "25",
            "50 ",
            "155 ",
            "hannah@example.com",
            "+1555666777",
            "https://picsum.photos/id/209/200/300",
            listOf(
                domain.model.Visit("Physical Therapy", "31/10/23"),
                domain.model.Visit("Follow-up", "09/11/23")
            )
        ),
        domain.model.Customer(
            "Isaac",
            "15/11/23",
            "15/01/25",
            domain.model.Professional(
                "Dr. Wong",
                domain.model.Therapy.MASSAGE,
                "https://picsum.photos/id/110/200/300"
            ),
            domain.model.Gender.MALE,
            "36",
            "78 ",
            "180 ",
            "isaac@example.com",
            "+1222333444",
            "https://picsum.photos/id/210/200/300",
            listOf(
                domain.model.Visit("Sports Massage", "16/11/23"),
                domain.model.Visit("Relaxation Massage", "25/11/23")
            )
        ),
        domain.model.Customer(
            "Julia",
            "20/12/23",
            "28/02/25",
            domain.model.Professional(
                "Dr. Kim",
                domain.model.Therapy.ACUPUNCTURE,
                "https://picsum.photos/id/111/200/300"
            ),
            domain.model.Gender.FEMALE,
            "33",
            "60 ",
            "170 ",
            "julia@example.com",
            "+1888999777",
            "https://picsum.photos/id/211/200/300",
            listOf(
                domain.model.Visit("Acupuncture Session", "21/12/23"),
                domain.model.Visit("Follow-up", "30/12/23")
            )
        ),
        domain.model.Customer(
            "Kevin",
            "05/01/24",
            "10/03/25",
            domain.model.Professional(
                "Dr. Lee",
                domain.model.Therapy.CHIROPRACTIC,
                "https://picsum.photos/id/112/200/300"
            ),
            domain.model.Gender.MALE,
            "40",
            "82 ",
            "178 ",
            "kevin@example.com",
            "+1777666555",
            "https://picsum.photos/id/212/200/300",
            listOf(
                domain.model.Visit("Spinal Adjustment", "06/01/24"),
                domain.model.Visit("Follow-up", "15/01/24")
            )
        ),
        domain.model.Customer(
            "Lily",
            "15/02/24",
            "20/04/25",
            domain.model.Professional(
                "Dr. Garcia",
                domain.model.Therapy.PHYSICAL,
                "https://picsum.photos/id/113/200/300"
            ),
            domain.model.Gender.FEMALE,
            "28",
            "55 ",
            "160 ",
            "lily@example.com",
            "+1666777888",
            "https://picsum.photos/id/213/200/300",
            listOf(
                domain.model.Visit("Rehabilitation Session", "16/02/24"),
                domain.model.Visit("Follow-up", "25/02/24")
            )
        ),
        domain.model.Customer(
            "Michael",
            "20/03/24",
            "25/05/25",
            domain.model.Professional(
                "Dr. Lopez",
                domain.model.Therapy.MASSAGE,
                "https://picsum.photos/id/114/200/300"
            ),
            domain.model.Gender.MALE,
            "32",
            "72 ",
            "175 ",
            "michael@example.com",
            "+1555444666",
            "https://picsum.photos/id/214/200/300",
            listOf(
                domain.model.Visit("Deep Tissue Massage", "21/03/24"),
                domain.model.Visit("Relaxation Massage", "30/03/24")
            )
        ),
        domain.model.Customer(
            "Natalie",
            "18/04/24",
            "15/06/25",
            domain.model.Professional(
                "Dr. Martinez",
                domain.model.Therapy.ACUPUNCTURE,
                "https://picsum.photos/id/115/200/300"
            ),
            domain.model.Gender.FEMALE,
            "38",
            "63 ",
            "168 ",
            "natalie@example.com",
            "+1333222111",
            "https://picsum.photos/id/215/200/300",
            listOf(
                domain.model.Visit("Acupuncture Session", "19/04/24"),
                domain.model.Visit("Follow-up", "28/04/24")
            )
        ),
        domain.model.Customer(
            "Oliver",
            "25/05/24",
            "25/07/25",
            domain.model.Professional(
                "Dr. Johnson",
                domain.model.Therapy.CHIROPRACTIC,
                "https://picsum.photos/id/116/200/300"
            ),
            domain.model.Gender.MALE,
            "42",
            "85 ",
            "185 ",
            "oliver@example.com",
            "+1888777666",
            "https://picsum.photos/id/216/200/300",
            listOf(
                domain.model.Visit("Spinal Adjustment", "26/05/24"),
                domain.model.Visit("Follow-up", "05/06/24")
            )
        ),
        domain.model.Customer(
            "Penelope",
            "30/06/24",
            "30/08/25",
            domain.model.Professional(
                "Dr. Smith",
                domain.model.Therapy.PHYSICAL,
                "https://picsum.photos/id/117/200/300"
            ),
            domain.model.Gender.FEMALE,
            "25",
            "50 ",
            "155 ",
            "penelope@example.com",
            "+1444555666",
            "https://picsum.photos/id/217/200/300",
            listOf(
                domain.model.Visit("Physical Therapy", "01/07/24"),
                domain.model.Visit("Follow-up", "09/07/24")
            )
        ),
        domain.model.Customer(
            "Quentin",
            "15/07/24",
            "15/09/25",
            domain.model.Professional(
                "Dr. Wong",
                domain.model.Therapy.MASSAGE,
                "https://picsum.photos/id/118/200/300"
            ),
            domain.model.Gender.MALE,
            "36",
            "78 ",
            "180 ",
            "quentin@example.com",
            "+1666777888",
            "https://picsum.photos/id/218/200/300",
            listOf(
                domain.model.Visit("Sports Massage", "16/07/24"),
                domain.model.Visit("Relaxation Massage", "25/07/24")
            )
        ),
        domain.model.Customer(
            "Rachel",
            "20/08/24",
            "28/10/25",
            domain.model.Professional(
                "Dr. Kim",
                domain.model.Therapy.ACUPUNCTURE,
                "https://picsum.photos/id/119/200/300"
            ),
            domain.model.Gender.FEMALE,
            "33",
            "60 ",
            "170 ",
            "rachel@example.com",
            "+1555444333",
            "https://picsum.photos/id/219/200/300",
            listOf(
                domain.model.Visit("Acupuncture Session", "21/08/24"),
                domain.model.Visit("Follow-up", "30/08/24")
            )
        ),
        domain.model.Customer(
            "Samuel",
            "05/09/24",
            "10/11/25",
            domain.model.Professional(
                "Dr. Lee",
                domain.model.Therapy.CHIROPRACTIC,
                "https://picsum.photos/id/120/200/300"
            ),
            domain.model.Gender.MALE,
            "40",
            "82 ",
            "178 ",
            "samuel@example.com",
            "+1444666777",
            "https://picsum.photos/id/220/200/300",
            listOf(
                domain.model.Visit("Spinal Adjustment", "06/09/24"),
                domain.model.Visit("Follow-up", "15/09/24")
            )
        ),
        domain.model.Customer(
            "Tiffany",
            "15/10/24",
            "20/12/25",
            domain.model.Professional(
                "Dr. Garcia",
                domain.model.Therapy.PHYSICAL,
                "https://picsum.photos/id/121/200/300"
            ),
            domain.model.Gender.FEMALE,
            "28",
            "55 ",
            "160 ",
            "tiffany@example.com",
            "+1888999666",
            "https://picsum.photos/id/221/200/300",
            listOf(
                domain.model.Visit("Rehabilitation Session", "16/10/24"),
                domain.model.Visit("Follow-up", "25/10/24")
            )
        ),
        domain.model.Customer(
            "Ulysses",
            "20/11/24",
            "25/01/26",
            domain.model.Professional(
                "Dr. Lopez",
                domain.model.Therapy.MASSAGE,
                "https://picsum.photos/id/122/200/300"
            ),
            domain.model.Gender.MALE,
            "32",
            "72 ",
            "175 ",
            "ulysses@example.com",
            "+1555666777",
            "https://picsum.photos/id/222/200/300",
            listOf(
                domain.model.Visit("Deep Tissue Massage", "21/11/24"),
                domain.model.Visit("Relaxation Massage", "30/11/24")
            )
        ),
        domain.model.Customer(
            "Victoria",
            "18/12/24",
            "15/02/26",
            domain.model.Professional(
                "Dr. Martinez",
                domain.model.Therapy.ACUPUNCTURE,
                "https://picsum.photos/id/123/200/300"
            ),
            domain.model.Gender.FEMALE,
            "38",
            "63 ",
            "168 ",
            "victoria@example.com",
            "+1333444555",
            "https://picsum.photos/id/223/200/300",
            listOf(
                domain.model.Visit("Acupuncture Session", "19/12/24"),
                domain.model.Visit("Follow-up", "28/12/24")
            )
        ),

        domain.model.Customer(
            "Xena",
            "28/02/25",
            "28/04/26",
            domain.model.Professional(
                "Dr. Smith",
                domain.model.Therapy.PHYSICAL,
                "https://picsum.photos/id/125/200/300"
            ),
            domain.model.Gender.FEMALE,
            "25",
            "50 ",
            "155 ",
            "xena@example.com",
            "+1444555444",
            "https://picsum.photos/id/225/200/300",
            listOf(
                domain.model.Visit("Physical Therapy", "01/03/25"),
                domain.model.Visit("Follow-up", "09/03/25")
            )
        ),

        domain.model.Customer(
            "Zoe",
            "15/04/25",
            "20/06/26",
            domain.model.Professional(
                "Dr. Kim",
                domain.model.Therapy.ACUPUNCTURE,
                "https://picsum.photos/id/127/200/300"
            ),
            domain.model.Gender.FEMALE,
            "33",
            "60 ",
            "170 ",
            "zoe@example.com",
            "+1555333222",
            "https://picsum.photos/id/227/200/300",
            listOf(
                domain.model.Visit("Acupuncture Session", "16/04/25"),
                domain.model.Visit("Follow-up", "25/04/25")
            )
        ),
        domain.model.Customer(
            "Aaron",
            "20/05/25",
            "25/07/26",
            domain.model.Professional(
                "Dr. Lee",
                domain.model.Therapy.CHIROPRACTIC,
                "https://picsum.photos/id/128/200/300"
            ),
            domain.model.Gender.MALE,
            "40",
            "82 ",
            "178 ",
            "aaron@example.com",
            "+1444888999",
            "https://picsum.photos/id/228/200/300",
            listOf(
                domain.model.Visit("Spinal Adjustment", "21/05/25"),
                domain.model.Visit("Follow-up", "30/05/25")
            )
        ),
        )
    return customersList
}
