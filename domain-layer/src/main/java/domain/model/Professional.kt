package domain.model

data class Professional(private val profName: String, val therapyType: Therapy?, val imageUrl: String?): User(profName)
enum class Therapy(val nameOfTherapy: String){
    PHYSICAL(nameOfTherapy = "Physiotherapist"),
    MASSAGE(nameOfTherapy = "Massage Therapist"),
    ACUPUNCTURE(nameOfTherapy = "Acupuncturist"),
    CHIROPRACTIC(nameOfTherapy = "Chiropractor")
}