$(document).ready(function () {

    //delete dusun
    $('#dusun-container').on('click', '.btn-delete-dusun', function () {
        $(this).closest('.form-dusun').remove();

        $('#dusun-container .form-dusun').each(function (dusunIndex) {
            $(this).find('[name]').each(function () {
                var nameDusun = $(this).attr('name');
                nameDusun = nameDusun.replace(/daftarDusun\[\d+\]/, `daftarDusun[${dusunIndex}]`);
                $(this).attr('name', nameDusun);
            });
        });
    });

    $('#dusun-container').on('click', '.btn-delete-rw', function () {
        $(this).closest('.form-rw').remove();

        $('#dusun-container .form-dusun').each(function (dusunIndex) {
            $(this).find('.form-rw').each(function (rwIndex) {
                $(this).find('[name]').each(function () {
                    var nameRW = $(this).attr('name');
                    nameRW = nameRW.replace(/daftarDusun\[\d+\].daftarRW\[\d+\]/, `daftarDusun[${dusunIndex}].daftarRW[${rwIndex}]`);
                    $(this).attr('name', nameRW);
                });
            });
        });
    });

    $('#dusun-container').on('click', '.btn-delete-rt', function () {
        $(this).closest('.rt-container').remove();

        $('#dusun-container .form-dusun').each(function (dusunIndex) {
            $(this).find('.form-rw').each(function (rwIndex) {
                $(this).find('.form-rt').each(function (rtIndex) {
                    $(this).find('[name]').each(function () {
                        var nameRT = $(this).attr('name');
                        nameRT = nameRT.replace(/daftarDusun\[\d+\].daftarRW\[\d+\].daftarRT\[\d+\]/, `daftarDusun[${dusunIndex}].daftarRW[${rwIndex}].daftarRT[${rtIndex}]`);
                        $(this).attr('name', nameRT);
                    });
                });
            });
        });
    });

    $('#dusun-container ').on('click','.btn-delete-warga-list', function () {
        $(this).closest('.warga-container').remove();

        $('#dusun-container .form-dusun').each(function (dusunIndex) {
            $(this).find('.form-rw').each(function (rwIndex) {
                $(this).find('.form-rt').each(function (rtIndex) {
                    $(this).find('.form-warga').each(function (wargaIndex) {
                        $(this).find('[name]').each(function () {
                            var nameWarga = $(this).attr('name');
                            nameWarga = nameWarga.replace(/daftarDusun\[\d+\].daftarRW\[\d+\].daftarRT\[\d+\].daftarWarga\[\d+\]/, `daftarDusun[${dusunIndex}].daftarRW[${rwIndex}].daftarRT[${rtIndex}].daftarWarga[${wargaIndex}]`);
                            $(this).attr('name', nameWarga);
                        });
                    });
                });
            });
        });
    });

    $('#dusun-container').on('click','.btn-delete-warga', function () {
        $(this).closest('.tbl-warga').remove();

        $('#dusun-container .form-dusun').each(function (dusunIndex) {
            $(this).find('.form-rw').each(function (rwIndex) {
                $(this).find('.form-rt').each(function (rtIndex) {
                    $(this).find('.tbl-body .tbl-warga').each(function (wargaIndex) {
                        $(this).find('th[scope="row"]').text(wargaIndex + 1);
                        $(this).find('[name]').each(function () {
                            var nameWarga = $(this).attr('name');
                            nameWarga = nameWarga.replace(/daftarDusun\[\d+\].daftarRW\[\d+\].daftarRT\[\d+\].daftarWarga\[\d+\]/, `daftarDusun[${dusunIndex}].daftarRW[${rwIndex}].daftarRT[${rtIndex}].daftarWarga[${wargaIndex}]`);
                            $(this).attr('name', nameWarga);
                        });
                    });
                });
            });
        });
    });



    $('#dusun-container').on('click', '.btn-add', function () {

        var dusunIndex = $('#dusun-container .form-dusun').length;

        var dusunElement = '<div class="row form-dusun">\n' +
            '   <div class="d-flex justify-content-between">\n' +
            '       <button type="button" class="btn btn-primary btn-add ms-auto">Add Dusun</button>\n' +
            '       <button type="button" class="btn btn-danger btn-delete-dusun">Delete Dusun</button>\n' +
            '   </div>\n' +
            '    <div class="col-12">\n' +
            '        <div class="mb-3">\n' +
            '            <label for="id_' + dusunIndex + '_name" class="form-label">Nama Dusun</label>\n' +
            '            <input type="text" class="form-control" id="id_' + dusunIndex + '_name" ' +
            '                   name="daftarDusun[' + dusunIndex + '].name">\n' +
            '        </div>\n' +
            '    </div>\n' +
            '    <div class="rw-container">\n' + // Container untuk RW dalam setiap Dusun
            '         <div class="row form-rw mb-3">\n' +
            '           <div class="d-flex justify-content-between">\n' +
            '             <button type="button" class="btn btn-success btn-rw ms-auto">Add RW</button>\n' +
            '             <button type="button" class="btn btn-danger btn-delete-rw">Delete RW</button>\n' +
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
            '                    <div class="row form-rt mb-3">\n' +
            '                       <div class="d-flex justify-content-between">\n' +
            '                         <button type="button" class="btn btn-secondary btn-rt ms-auto">Add RT</button>\n' +
            '                         <button type="button" class="btn btn-danger btn-delete-rt">Delete RT</button>\n' +
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
            '                                       <button type="button" class="btn btn-warning btn-warga ms-auto">Add Warga</button>\n' +
            '                                       <button type="button" class="btn btn-danger btn-delete-warga-list">Delete Warga</button>\n' +
            '                                    </div>\n' +
            '                                    <div class="col-12 mb-3">\n' +
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
            '                                                    <td>\n' +
            '                                                        <a class="btn btn-danger btn-delete-warga">\n' +
            '                                                           &nbsp;Delete\n' +
            '                                                        </a>\n' +
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

        var dusunContainer = $(this).closest('.form-dusun');
        var rwContainer = dusunContainer.find('.rw-container');

        var rwIndex = rwContainer.find('.form-rw').length;
        var dusunIndex = $('#dusun-container .form-dusun').index(dusunContainer);

        var rwElement = '<div class="row form-rw mb-3">\n' +
            '    <div class="d-flex justify-content-between">\n' +
            '         <button type="button" class="btn btn-success btn-rw ms-auto">Add RW</button>\n' +
            '         <button type="button" class="btn btn-danger btn-delete-rw">Delete RW</button>\n' +
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
            '                     <button type="button" class="btn btn-secondary btn-rt ms-auto">Add RT</button>\n' +
            '                     <button type="button" class="btn btn-danger btn-delete-rt">Delete RT</button>\n' +
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
            '                                 <button type="button" class="btn btn-danger btn-delete-warga-list">Delete Warga</button>\n' +
            '                            </div>\n' +
            '                            <div class="col-12 mb-3">\n' +
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
            '                                            <td>\n' +
            '                                               <a class="btn btn-danger btn-delete-warga">\n' +
            '                                                  &nbsp;Delete\n' +
            '                                               </a>\n' +
            '                                           </td>\n' +
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

        var rtElement = '<div class="row form-rt mb-3">\n' +
            ' <div class="d-flex justify-content-between">\n' +
            '     <button type="button" class="btn btn-secondary btn-rt ms-auto">Add RT</button>\n' +
            '     <button type="button" class="btn btn-danger btn-delete-rt">Delete RT</button>\n' +
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
            '                     <button type="button" class="btn btn-danger btn-delete-warga-list">Delete Warga</button>\n' +
            '                </div>\n' +
            '                <div class="col-12 mb-3">\n' +
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
            '                                <td>\n' +
            '                                    <a class="btn btn-danger btn-delete-warga">\n' +
            '                                      &nbsp;Delete\n' +
            '                                    </a>\n' +
            '                               </td>\n' +
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

        var wargaElement = '<tr class="tbl-warga">\n' +
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
            '                    <td>\n' +
            '                       <a class="btn btn-danger btn-delete-warga">\n' +
            '                         &nbsp;Delete\n' +
            '                      </a>\n' +
            '                    </td>\n' +
            '                </tr>';

        wargaContainer.find('.tbl-body').append(wargaElement);
    });
});