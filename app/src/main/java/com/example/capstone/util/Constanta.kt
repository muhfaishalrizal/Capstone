package com.example.capstone.utilimport android.os.Buildimport androidx.annotation.RequiresApiimport java.time.Instantimport java.time.ZoneIdimport java.time.format.DateTimeFormatterclass Constanta {    companion object{        const val SPLASH_SCREEN_TIMER: Long = 1500        const val ONBOARDING_SCREEN_TIMER: Long = 10//        const val BASE_URL= "https://story-api.dicoding.dev/v1/"        const val BASE_URL= "https:/faishol-production-d13a.up.railway.app/"        const val UTC_FORMAT = "yyyy-MM-dd'T'HH:mm:ss"        const val CREATED_DATE_FORMAT = "dd-MMM-yyyy"        const val UTC_TIME_ZONE = "UTC"        const val DETAIL_STORY = "DETAIL_STORY"        const val MIN_LENGTH_PASSWORD = 6        const val SUFFIX_IMAGE_FILE = ".jpg"        const val SIZE_BYTE_ARRAY = 1024        const val STREAM_LENGTH = 1000000        const val READ_EXTERNAL = 300        const val ACCESS_LOCATION = 500        const val GREEVENTS = "greevents"        const val PICK_PDF_FILE = 2        const val DICODING_LATITUDE = -6.8957643        const val DICODING_LONGITUDE = 107.6338462        @RequiresApi(Build.VERSION_CODES.O)        fun formatDate(currentDate : String?, targetTimeZone: String): String {            val instant = Instant.parse(currentDate)            val formatter = DateTimeFormatter.ofPattern("dd MMM yyyy | HH:mm")                .withZone(ZoneId.of(targetTimeZone))            return formatter.format(instant)        }    }}