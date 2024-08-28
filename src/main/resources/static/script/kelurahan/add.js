$(document).ready(function () {
    // Penjelasan:
    //     Ini adalah fungsi yang memastikan bahwa DOM (Document Object Model)
    //     telah sepenuhnya dimuat sebelum kode jQuery di dalamnya dijalankan.
    // Fungsi:
    // Ini digunakan untuk menunda eksekusi kode jQuery hingga halaman HTML telah siap sepenuhnya.
    $('#dusun-container').on('click', '.btn-add', function () {
        // Penjelasan:
        //     Fungsi ini menetapkan event handler untuk elemen yang berfungsi ketika tombol dengan kelas .
        //     btn-add di dalam elemen dengan ID #dusun-container diklik.
        // Fungsi:
        //     Ketika tombol "Add Dusun" diklik, fungsi yang didefinisikan di dalamnya akan dijalankan.
        //     Teknik ini menggunakan event delegation, yang berarti event listener tetap aktif bahkan jika elemen .btn-add baru ditambahkan ke dalam #dusun-container.
        var dusunIndex = $('#dusun-container .form-dusun').length;

        var dusunElement =
            '<div class="row form-dusun">\n' +
            '  <div class="d-flex justify-content-between">\n' +
            '     <button type="button" class="btn btn-primary btn-add ms-auto">Add Dusun</button>\n' +
            '    </div>' +
            '    <div class="col-12">\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + dusunIndex + '_name" class="form-label">Nama Dusun</label>\n' +
            '            <input type="text" class="form-control" id="id_' + dusunIndex + '_name" ' +
            '                   name="daftarDusun[' + dusunIndex + '].name">\n' +
            '        </div>\n' +
            '    </div>\n' +
            '    <div class="rw-container">\n' + // Container untuk RW dalam setiap Dusun
            '          <div class="row form-rw">\n' +
            '            <div class="d-flex justify-content-between">\n' +
            '               <button type="button" class="btn btn-success btn-rw ms-auto">Add RW</button>\n' +
            '            </div>\n' +
            '            <div class="col-12">\n' +
            '                <div class="mb-3">\n' +
            '                    <label for="id_' + dusunIndex + '_0_name" class="form-label">RW</label>\n' +
            '                    <input type="text" class="form-control" id="id_' + dusunIndex + '_0_name" ' +
            '                           name="daftarDusun[' + dusunIndex + '].daftarRW[0].name">\n' +
            '                </div>\n' +
            '                <div class="mb-3">\n' +
            '                    <label for="id_' + dusunIndex + '_0_nameRW" class="form-label">Nama RW</label>\n' +
            '                    <input type="text" class="form-control" id="id_' + dusunIndex + '_0_nameRW" ' +
            '                           name="daftarDusun[' + dusunIndex + '].daftarRW[0].nameRW">\n' +
            '                </div>\n' +
            '                <div class="rt-container">\n' + // Container untuk RT dalam setiap RW
            '                    <div class="row form-rt">\n' +
            '                       <div class="d-flex justify-content-between">\n' +
            '                           <button type="button" class="btn btn-danger btn-rt ms-auto">Add RT</button>\n' +
            '                        </div>\n' +
            '                        <div class="col-12">\n' +
            '                            <div class="mb-3">\n' +
            '                                <label for="id_' + dusunIndex + '_0_0_name" class="form-label">RT</label>\n' +
            '                                <input type="text" class="form-control" id="id_' + dusunIndex + '_0_0_name" ' +
            '                                       name="daftarDusun[' + dusunIndex + '].daftarRW[0].daftarRT[0].name">\n' +
            '                            </div>\n' +
            '                            <div class="mb-3">\n' +
            '                                <label for="id_' + dusunIndex + '_0_0_nameRT" class="form-label">Nama RT</label>\n' +
            '                                <input type="text" class="form-control" id="id_' + dusunIndex + '_0_0_nameRT" ' +
            '                                       name="daftarDusun[' + dusunIndex + '].daftarRW[0].daftarRT[0].nameRT">\n' +
            '                            </div>\n' +
            '                            <div class="warga-container">\n' + // Container untuk Warga dalam setiap RT
            '                                <div class="row form-warga">\n' +
            '                                  <div class="d-flex justify-content-between">\n' +
            '                                      <button type="button" class="btn btn-warning btn-warga ms-auto">Add Warga</button>\n' +
            '                                    </div>\n' +
            '                                    <div class="col-12 mb-4">\n' +
            '                                        <table class="table table-striped">\n' +
            '                                            <thead>\n' +
            '                                                <tr>\n' +
            '                                                    <th>#</th>\n' +
            '                                                    <th>Nik</th>\n' +
            '                                                    <th>Nama Warga</th>\n' +
            '                                                    <th>Jenis Kelamin</th>\n' +
            '                                                    <th>Umur</th>\n' +
            '                                                </tr>\n' +
            '                                            </thead>\n' +
            '                                            <tbody class="tbl-body">\n' +
            '                                                <tr class="tbl-warga">\n' +
            '                                                    <th scope="row">1</th>\n' +
            '                                                    <td>\n' +
            '                                                        <input type="text" class="form-control" ' +
            '                                                               name="daftarDusun[' + dusunIndex + '].daftarRW[0].daftarRT[0].daftarWarga[0].nik">\n' +
            '                                                    </td>\n' +
            '                                                    <td>\n' +
            '                                                        <input type="text" class="form-control" ' +
            '                                                               name="daftarDusun[' + dusunIndex + '].daftarRW[0].daftarRT[0].daftarWarga[0].namaWarga">\n' +
            '                                                    </td>\n' +
            '                                                    <td>\n' +
            '                                                        <select class="form-select" ' +
            '                                                                name="daftarDusun[' + dusunIndex + '].daftarRW[0].daftarRT[0].daftarWarga[0].jenisKelamin">\n' +
            '                                                            <option value="">Pilih Jenis Kelamin</option>\n' +
            '                                                            <option value="Pria">Pria</option>\n' +
            '                                                            <option value="Wanita">Wanita</option>\n' +
            '                                                        </select>\n' +
            '                                                    </td>\n' +
            '                                                    <td>\n' +
            '                                                        <input type="text" class="form-control" ' +
            '                                                               name="daftarDusun[' + dusunIndex + '].daftarRW[0].daftarRT[0].daftarWarga[0].age">\n' +
            '                                                    </td>\n' +
            '                                                </tr>\n' +
            '                                            </tbody>\n' +
            '                                        </table>\n' +
            '                                    </div>\n' +
            '                                </div>\n' +
            '                            </div>\n' +
            '                        </div>\n' +
            '                    </div>\n' +
            '                </div>\n' +
            '            </div>\n' +
            '        </div>\n' +
            '    </div>\n' +
            '</div>';

        $('#dusun-container').append(dusunElement);
    });

    // Untuk menambah RW di dalam Dusun
    $('#dusun-container').on('click', '.btn-rw', function () {
        // Fungsi: Bagian ini menetapkan event listener pada elemen #dusun-container.
        //         Event listener ini akan menangkap semua klik pada elemen yang memiliki class .btn-rw di dalam elemen #dusun-container.

        var dusunContainer = $(this).closest('.form-dusun');
        // Fungsi: Dari tombol RW (this) yang diklik, kode ini mencari elemen terdekat yang memiliki class .form-dusun.
        //         Ini berguna untuk memastikan bahwa elemen RW yang baru akan ditambahkan ke bagian Dusun yang benar.

        var rwContainer = dusunContainer.find('.rw-container');
        // Fungsi: Setelah menemukan elemen .form-dusun, kode ini mencari elemen dengan ID #rw-container di dalam dusunContainer.

        var rwIndex = rwContainer.find('.form-rw').length;
        // Fungsi: Menghitung jumlah elemen dengan class .form-rw yang sudah ada di dalam rwContainer.

        var dusunIndex = $('#dusun-container .form-dusun').index(dusunContainer);
        // Fungsi: Mengambil indeks elemen .form-dusun di dalam #dusun-container yang berisi tombol RW yang diklik.

        // Fungsi: Membuat elemen RW baru dalam bentuk string HTML.
        //         Elemen ini berisi dua input untuk informasi RW (name dan nameRW), serta satu RT default yang berisi dua input (name dan nameRT).
        var rwElement =
            '<div class="row form-rw">\n' +
            '    <div class="d-flex justify-content-between">\n' +
            '         <button type="button" class="btn btn-success btn-rw ms-auto">Add RW</button>\n' +
            '    </div>\n' +
            '    <div class="col-12">\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + dusunIndex + '_' + rwIndex + '_name" class="form-label">RW</label>\n' +
            '            <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_name" ' +
            '                   name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].name">\n' +
            '        </div>\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + dusunIndex + '_' + rwIndex + '_nameRW" class="form-label">Nama RW</label>\n' +
            '            <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_nameRW" ' +
            '                   name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].nameRW">\n' +
            '        </div>\n' +
            '        <div class="rt-container">\n' +
            '            <div class="row form-rt">\n' +
            '                <div class="d-flex justify-content-between">\n' +
            '                     <button type="button" class="btn btn-danger btn-rt ms-auto">Add RT</button>\n' +
            '                </div>\n' +
            '                <div class="col-12">\n' +
            '                    <div class="mb-3">\n' +
            '                        <label for="id_' + dusunIndex + '_' + rwIndex + '_0_name" class="form-label">RT</label>\n' +
            '                        <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_0_name" ' +
            '                               name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[0].name">\n' +
            '                    </div>\n' +
            '                    <div class="mb-3">\n' +
            '                        <label for="id_' + dusunIndex + '_' + rwIndex + '_0_nameRT" class="form-label">Nama RT</label>\n' +
            '                        <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_0_nameRT" ' +
            '                               name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[0].nameRT">\n' +
            '                    </div>\n' +
            '                    <div class="warga-container">\n' +
            '                        <div class="row form-warga">\n' +
            '                            <div class="d-flex justify-content-between">\n' +
            '                                 <button type="button" class="btn btn-warning btn-warga ms-auto">Add Warga</button>\n' +
            '                            </div>\n' +
            '                            <div class="col-12 mb-4">\n' +
            '                                <table class="table table-striped">\n' +
            '                                    <thead>\n' +
            '                                        <tr>\n' +
            '                                            <th>#</th>\n' +
            '                                            <th>Nik</th>\n' +
            '                                            <th>Nama Warga</th>\n' +
            '                                            <th>Jenis Kelamin</th>\n' +
            '                                            <th>Umur</th>\n' +
            '                                        </tr>\n' +
            '                                    </thead>\n' +
            '                                    <tbody class="tbl-body">\n' +
            '                                        <tr class="tbl-warga">\n' +
            '                                            <th scope="row">1</th>\n' +
            '                                            <td>\n' +
            '                                                <input type="text" class="form-control" ' +
            '                                                       name="daftarDusun[' + dusunIndex + '].daftarRW['+ rwIndex +'].daftarRT[0].daftarWarga[0].nik">\n' +
            '                                            </td>\n' +
            '                                            <td>\n' +
            '                                                <input type="text" class="form-control" ' +
            '                                                       name="daftarDusun[' + dusunIndex + '].daftarRW['+ rwIndex +'].daftarRT[0].daftarWarga[0].namaWarga">\n' +
            '                                            </td>\n' +
            '                                            <td>\n' +
            '                                                <select class="form-select" ' +
            '                                                        name="daftarDusun[' + dusunIndex + '].daftarRW['+ rwIndex +'].daftarRT[0].daftarWarga[0].jenisKelamin">\n' +
            '                                                    <option value="">Pilih Jenis Kelamin</option>\n' +
            '                                                    <option value="Pria">Pria</option>\n' +
            '                                                    <option value="Wanita">Wanita</option>\n' +
            '                                                </select>\n' +
            '                                            </td>\n' +
            '                                            <td>\n' +
            '                                                <input type="text" class="form-control" ' +
            '                                                       name="daftarDusun[' + dusunIndex + '].daftarRW['+ rwIndex +'].daftarRT[0].daftarWarga[0].age">\n' +
            '                                            </td>\n' +
            '                                        </tr>\n' +
            '                                    </tbody>\n' +
            '                                </table>\n' +
            '                            </div>\n' +
            '                        </div>\n' +
            '                    </div>\n' +
            '                </div>\n' +
            '            </div>\n' +
            '        </div>\n' +
            '    </div>\n' +
            '</div>';
        // Fungsi: Menambahkan elemen rwElement yang baru saja dibuat ke dalam rwContainer.
        rwContainer.append(rwElement);
    });

    // Untuk menambah RT di dalam RW
    $('#dusun-container').on('click', '.btn-rt', function () {
        var rwContainer = $(this).closest('.form-rw');

        var rtContainer = rwContainer.find('.rt-container');
        var rtIndex = rtContainer.find('.form-rt').length;

        var dusunContainer = $(this).closest('.form-dusun');
        var dusunIndex = $('#dusun-container .form-dusun').index(dusunContainer);

        var rwIndex = dusunContainer.find('.form-rw').index(rwContainer);

        var rtElement = '<div class="row form-rt">\n' +
            ' <div class="d-flex justify-content-between">\n' +
            '     <button type="button" class="btn btn-danger btn-rt ms-auto">Add RT</button>\n' +
            '    </div>\n' +
            '    <div class="col-12">\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + dusunIndex + '_' + rwIndex + '_' + rtIndex + '_name" class="form-label">RT</label>\n' +
            '            <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_' + rtIndex + '_name" name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].name">\n' +
            '        </div>\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + dusunIndex + '_' + rwIndex + '_' + rtIndex + '_nameRT" class="form-label">Nama RT</label>\n' +
            '            <input type="text" class="form-control" id="id_' + dusunIndex + '_' + rwIndex + '_' + rtIndex + '_nameRT" name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].nameRT">\n' +
            '        </div>\n' +
            '        <div class="warga-container">\n' +
            '            <div class="row form-warga">\n' +
            '                <div class="d-flex justify-content-between">\n' +
            '                     <button type="button" class="btn btn-warning btn-warga ms-auto">Add Warga</button>\n' +
            '                </div>\n' +
            '                <div class="col-12 mb-4">\n' +
            '                    <table class="table table-striped">\n' +
            '                        <thead>\n' +
            '                            <tr>\n' +
            '                                <th>#</th>\n' +
            '                                <th>Nik</th>\n' +
            '                                <th>Nama Warga</th>\n' +
            '                                <th>Jenis Kelamin</th>\n' +
            '                                <th>Umur</th>\n' +
            '                            </tr>\n' +
            '                        </thead>\n' +
            '                        <tbody class="tbl-body">\n' +
            '                            <tr class="tbl-warga">\n' +
            '                                <th scope="row">1</th>\n' +
            '                                <td>\n' +
            '                                    <input type="text" class="form-control" name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].daftarWarga[0].nik">\n' +
            '                                </td>\n' +
            '                                <td>\n' +
            '                                    <input type="text" class="form-control" name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].daftarWarga[0].namaWarga">\n' +
            '                                </td>\n' +
            '                                <td>\n' +
            '                                    <select class="form-select" name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].daftarWarga[0].jenisKelamin">\n' +
            '                                        <option value="">Pilih Jenis Kelamin</option>\n' +
            '                                        <option value="Pria">Pria</option>\n' +
            '                                        <option value="Wanita">Wanita</option>\n' +
            '                                    </select>\n' +
            '                                </td>\n' +
            '                                <td>\n' +
            '                                    <input type="text" class="form-control" name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].daftarWarga[0].age">\n' +
            '                                </td>\n' +
            '                            </tr>\n' +
            '                        </tbody>\n' +
            '                    </table>\n' +
            '                </div>\n' +
            '            </div>\n' +
            '        </div>\n' +
            '    </div>\n' +
            '</div>';

        rtContainer.append(rtElement);
    });

    //event untuk menambahkan warga dalam RT
    $('#dusun-container').on('click', '.btn-warga', function () {
        var dusunContainer = $(this).closest('.form-dusun');

        var rwContainer = dusunContainer.find('.rw-container');
        var formRW = $(this).closest('.form-rw');

        var rtContainer = formRW.find('.rt-container');
        var formRT = $(this).closest('.form-rt');

        var wargaContainer = formRT.find('.warga-container');

        var dusunIndex = $('#dusun-container .form-dusun').index(dusunContainer);
        var rwIndex = rwContainer.find('.form-rw').index(formRW);
        var rtIndex = rtContainer.find('.form-rt').index(formRT);

        var wargaIndex = wargaContainer.find('.tbl-warga').length;

        var wargaElement =
            '                <tr class="tbl-warga">\n' +
            '                    <th scope="row">' + (wargaIndex + 1) + '</th>\n' +
            '                    <td>\n' +
            '                        <input type="text" class="form-control" ' +
            '                               name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].daftarWarga[' + wargaIndex + '].nik">\n' +
            '                    </td>\n' +
            '                    <td>\n' +
            '                        <input type="text" class="form-control" ' +
            '                               name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].daftarWarga[' + wargaIndex + '].namaWarga">\n' +
            '                    </td>\n' +
            '                    <td>\n' +
            '                        <select class="form-select" ' +
            '                                name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].daftarWarga[' + wargaIndex + '].jenisKelamin">\n' +
            '                            <option value="">Pilih Jenis Kelamin</option>\n' +
            '                            <option value="Pria">Pria</option>\n' +
            '                            <option value="Wanita">Wanita</option>\n' +
            '                        </select>\n' +
            '                    </td>\n' +
            '                    <td>\n' +
            '                        <input type="text" class="form-control" ' +
            '                               name="daftarDusun[' + dusunIndex + '].daftarRW[' + rwIndex + '].daftarRT[' + rtIndex + '].daftarWarga[' + wargaIndex + '].age">\n' +
            '                    </td>\n' +
            '                </tr>';

        wargaContainer.find('.tbl-body').append(wargaElement);
    });
});